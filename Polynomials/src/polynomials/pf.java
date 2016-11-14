package polynomials;


public class pf {
    int[] coef;
    int deg;
    
    public pf(int a, int b){ // a * x^b
        /*
        we made the field constructor this way is because we add the components up together so
        the polynomials will be simplified automatically
        Also this way is a lost easier when calculating
        */
        this.coef = new int[b+1];
        this.coef[b] = a;
        this.deg = getDegree();
    }
    
    public pf(String equation){ // for user inputs
        String[] components = equation.split("\\+");
        
        int a, b;
        if (components[0].indexOf("-")!=-1){
            String[] components2 = components[0].split("\\-");
            String[] terms1 = components2[0].split("\\^");
            a = Integer.parseInt(terms1[0].substring(0, 1));
            b = Integer.parseInt(terms1[1]);
        }
        else{
            String[] terms1 = components[0].split("\\^");
            a = Integer.parseInt(terms1[0].substring(0, 1));
            b = Integer.parseInt(terms1[1]);
        }
        
        this.coef = new int[b+1];
        this.coef[b] = a;
        this.deg = getDegree();
        
        for (int i = 0; i < components.length; i++) {
            if (components[i].indexOf("x")!=-1){
                if(components[i].indexOf("-")!=-1){
                    String[] components2 = components[i].split("\\-");
                    for (int j = 0; j < components2.length; j++) {
                        String[] parts = components2[i].split("\\^");
                        int a_1 = Integer.parseInt(parts[0].substring(0, 1));
                        int b_1 = Integer.parseInt(parts[1]);
                        this.add(new pf(a_1, b_1));
                    }
                }
                else{
                    String[] parts = components[i].split("\\^");
                    this.add(new pf(Integer.parseInt(parts[0].substring(0, 1)), Integer.parseInt(parts[1])));
                }
            }
            else{
                this.add(new pf(Integer.parseInt(components[i]), 0));
            }
        }
    }
    
    public int getDegree(){
        int d =0;
        for (int i = 0; i < coef.length; i++) {
            if (this.coef[i]!=0)d=i;            
        }
        return d;
    }
    
    public double getValue(double x){
        double result = 0;
        for (int i = 0; i < this.deg; i++) {
            result += this.coef[i]*Math.pow(x, i);            
        }
        
        return result;
    }
    
    public pf add(pf other){ // this polynomial plus the other polynomial
        pf result = new pf(0, Math.max(this.deg, other.deg));
        
        for (int i = 0; i < this.deg; i++) 
            result.coef[i] += this.coef[i];
        for (int i = 0; i < other.deg; i++) 
            result.coef[i] += other.coef[i];
        
        result.deg = result.getDegree();
        return result;
    }
    
    public pf subtract(pf other){ // this polynomial minus the other polynomial
        pf result = new pf(0, Math.max(this.deg, other.deg));
        
        for (int i = 0; i < this.deg; i++) 
            result.coef[i] += this.coef[i];
        for (int i = 0; i < other.deg; i++) 
            result.coef[i] -= other.coef[i];
        
        result.deg = result.getDegree();
        return result;
    }
    
    public pf multiply(pf other){ // this polynomial multiply the other polynomial
        pf result = new pf(0, this.deg + other.deg);
        for (int i = 0; i < this.deg; i++) {
            for (int j = 0; j < other.deg; j++) {
                result.coef[i+j] += this.coef[i] * other.coef[j];
            }
        }
        result.deg = result.getDegree();
        return result;
    }
    
    public pf constantMultiplication(int x){
        pf result = this;
        for (int i = 0; i < this.deg; i++) {
            result.coef[i] *= x;            
        }
        return result;
    }
    
//    public rf divide(pf other){
//        rf result = new rf(this, other);
//        return result;
//    }
    
    public pf composition(pf other){ //a(b(x))
        pf result = new pf(0, 0);
        for (int i = 0; i < this.deg; i++) {
            result = result.add(other.constantMultiplication(this.coef[i]));            
        }
        return result;
    }
    
    public pf differentiate(){
        if (this.deg == 0)return new pf(0, 0);
        pf result = new pf(0, this.deg -1);
//        result.deg = this.deg - 1;
        for (int i = 0; i < result.deg; i++) {
            result.coef[i] = (i+1)*this.coef[i+1];
        }
        return result;
    }
    
    public void print(){
        String result = "y=";
        for (int i = 0; i < this.deg; i++) {
            String exponent = "*x^" + Integer.toString(this.deg - i);
            if (this.deg - i == 0)exponent = "";
            result += Integer.toBinaryString(this.coef[deg-i]) + exponent;            
        }
        System.out.println(result);
    }
    

}
