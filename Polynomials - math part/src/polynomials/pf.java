package polynomials;


public class pf {
    double[] coef;
    int deg;
    double yInt;
    
    public pf(double a, int b){ // a * x^b
        /*
        we made the field constructor this way is because we add the components up together so
        the polynomials will be simplified automatically
        Also this way is a lost easier when calculating
        */
        this.coef = new double[b+1];
        this.coef[b] = a;
        this.deg = b;
    }
    
    public pf(String equation){ // for user inputs
        equation = equation.replaceAll("\\-+", "+-");
        String[] components = equation.split("\\+");
        
        double[] a = new double[components.length];
        int[] b = new int[components.length];
        
        for (int i = 0; i < components.length; i++) {
            if ((components[i].contains("x"))){
                String[] parts = components[i].split("\\^");
                double a_1;
                int b_1;
                if (parts[0].indexOf("x")!=0 && !parts[0].substring(0, 2).equals("-x"))
                    a_1 = Double.parseDouble(parts[0].substring(0, parts[0].length()-1));
                else{
                    if (parts[0].substring(0, 2).equals("-x")) a_1 = -1;
                    else
                        a_1 = 1;
                }
                if (parts.length == 1) b_1 = 1;
                else b_1 = Integer.parseInt(parts[1]);
                a[i] = a_1;
                b[i]= b_1;
            }
            else{
                if (!components[i].equals("")){
                    double a_1 = Integer.parseInt(components[i]);
                    a[i] = a_1;
                    b[i] = 0;
                }
            }            
        }
        
        int x_1 = 0;
        for (int i = 0; i < b.length; i++) {
            x_1 = getBiggestVal(b);            
        }
        
        this.coef = new double[x_1+1];
        
        for (int i = 0; i < b.length; i++) {
            this.coef[b[i]] += a[i];
        }

        this.deg = getDegree();
        this.yInt = this.calculate(0);
        
    }
    
    public int getBiggestVal(int[] a){
        int a_1 = 0;
        for (int i = 0; i < a.length; i++) {
            a_1 = Math.max(a_1, a[i]);            
        }
        return a_1;
    }
    
    public int getIndexOf(int[] a, int b){
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==b);
            x = b;
        }
        return x;
    }
    
    public int getDegree(){
        int d =0;
        for (int i = 0; i < coef.length; i++) {
            if (this.coef[i]!=0)d=i;            
        }
        return d;
    }
    
    public pf add(pf other){ // this polynomial plus the other polynomial
        pf result = new pf(0, Math.max(this.deg, other.deg));
        
        for (int i = 0; i <= this.deg; i++) 
            result.coef[i] += this.coef[i];
        for (int i = 0; i <= other.deg; i++) 
            result.coef[i] += other.coef[i];
        
        result.deg = result.getDegree();
        return result;
    }
    
    public pf subtract(pf other){ // this polynomial minus the other polynomial
        pf result = new pf(0, Math.max(this.deg, other.deg));
        
        for (int i = 0; i <= this.deg; i++) 
            result.coef[i] += this.coef[i];
        for (int i = 0; i <= other.deg; i++) 
            result.coef[i] -= other.coef[i];
        
        result.deg = result.getDegree();
        return result;
    }
    
    public pf multiply(pf other){ // this polynomial multiply the other polynomial
        pf result = new pf(0, this.deg + other.deg);
        for (int i = 0; i <= this.deg; i++) {
            for (int j = 0; j <= other.deg; j++) {
                result.coef[i+j] += this.coef[i] * other.coef[j];
            }
        }
        result.deg = result.getDegree();
        return result;
    }
    

    
    public pf divide(pf other){ //this needs some work
       // rf result = new rf(this, other);
        return new pf("1");
    }
    
    public pf composition(pf other){ //a(b(x))
        pf result = new pf(0, 0);
        for (int i = 0; i <= this.deg; i++) {
            result = result.add(other.multiply(new pf(this.coef[i], i)));            
        }
        return result;
    }
    
    public pf differentiate(){
        if (this.deg == 0)return new pf(0, 0);
        pf result = new pf(0, this.deg -1);
        for (int i = 0; i <= result.deg; i++) {
            result.coef[i] = (i+1)*this.coef[i+1];
        }
        result.deg = result.getDegree();
        return result;
    }
    
    public String print(){
        String result = "";
        for (int i = 0; i <= this.deg; i++) {
            String exponent = "x^" + Integer.toString(this.deg - i);
            if (this.deg - i == 0)exponent = "";
            if (this.coef[deg-i]==0)exponent = "";
            String co_ef = Double.toString(this.coef[deg-i]);
            if (this.coef[deg-i]>0 && deg-i < deg)co_ef = "+"+co_ef;
            if (co_ef.equals("0"))co_ef = "";
            result += co_ef + exponent;            
        }
        return result;
    }
    
    //calculates y values for given x -> can be useful for graphing
    public double calculate(double x){
        double fx = 0;
        for (int i = 0; i <= this.deg; i++) {
            fx += this.coef[this.deg-i]*Math.pow(x, this.deg-i);
            
        }
        return fx;
        
    }
    

}
