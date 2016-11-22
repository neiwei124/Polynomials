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
        equation = equation.replaceAll("\\-+", "+-");//Change all the - to +-
        String[] components = equation.split("\\+");//split the equation into terms
        
        double[] a = new double[components.length];//array of coeficients
        int[] b = new int[components.length];//array of exponents
        
        for (int i = 0; i < components.length; i++) {
            if (!components[i].equals("")){//because split gives empty string if the first term is being split on
                if ((components[i].contains("x"))){//check whether it is constant or not
                    // when it is not a constant
                    String[] parts = components[i].split("\\^");
                    double a_1; //coeficient
                    int b_1; //exponent
                    if (parts[0].indexOf("x")!=0 && !parts[0].substring(0, 2).equals("-x")) //check if the coef is 1 or -1 or not
                        // coeficient not 1 or -1
                        a_1 = Double.parseDouble(parts[0].substring(0, parts[0].length()-1));
                    else{
                        // coefficient is 1 or -1
                        if (parts[0].contains("-x")) a_1 = -1;
                        else a_1 = 1;
                    }
                    if (parts.length == 1) b_1 = 1; // if the exponent is 1 and user didnt input "^1", make sure stores as 1
                    else b_1 = Integer.parseInt(parts[1]);
                    //store the values in the array
                    a[i] = a_1; 
                    b[i]= b_1;
                }
                else{
                    //if the term is a constant
                    double a_1 = Integer.parseInt(components[i]);
                    //store the values
                    a[i] = a_1;
                    b[i] = 0; // exponent of x is 0 when it is a constant term
                } 
            }
        }
        
        int x_1 = 0;
        // finding the highest degree
        for (int i = 0; i < b.length; i++) {
            x_1 = getBiggestVal(b);            
        }
        
        //creating the this.coef 
        this.coef = new double[x_1+1];
        
        //storing in the coefficients
        for (int i = 0; i < b.length; i++) {
            this.coef[b[i]] += a[i]; //b[i] is the degree of the x with the coeficient of a[i]
        }

        this.deg = getDegree(); // refresh/get the degree of the polynomial 
        this.yInt = this.calculate(0); // get the y-intercept
        
    }
    
    public int getBiggestVal(int[] a){ // gets the biggest value in an array
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
        
        for (int i = 0; i <= this.deg; i++) result.coef[i] += this.coef[i]; // add all the coef from this polymonial to the result
        for (int i = 0; i <= other.deg; i++) result.coef[i] += other.coef[i]; // add all the coef from the other polymonial to the result
        
        result.deg = result.getDegree();
        return result;
    }
    
    public pf subtract(pf other){ // this polynomial minus the other polynomial
        pf result = new pf(0, Math.max(this.deg, other.deg));
        
        for (int i = 0; i <= this.deg; i++) result.coef[i] += this.coef[i]; // add the coef from this polynomial to the result
        for (int i = 0; i <= other.deg; i++) result.coef[i] -= other.coef[i]; // subtract the coef from the other polynomial from the reuslt(this polynomial)
        
        result.deg = result.getDegree();
        return result;
    }
    
    public pf multiply(pf other){ // this polynomial multiply the other polynomial
        pf result = new pf(0, this.deg + other.deg); //set highest result degree
        for (int i = 0; i <= this.deg; i++) {
            for (int j = 0; j <= other.deg; j++) {
                result.coef[i+j] += this.coef[i] * other.coef[j]; //multiply the coeficients together
            }
        }
        result.deg = result.getDegree();
        return result;
    }
    

    
    public pf divide(pf other){ //this needs some work *cough* Neien * cough
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
    
    public pf differentiate(){ //returns a polynomial derivative
        if (this.deg == 0)return new pf(0, 0);
        pf result = new pf(0, this.deg -1);
        for (int i = 0; i <= result.deg; i++) {
            result.coef[i] = (i+1)*this.coef[i+1];
        }
        result.deg = result.getDegree();
        return result;
    }
    
    public String print(){ //prints out the polynomial
        String result = "";
        for (int i = 0; i <= this.deg; i++) {
            String exponent = "x^" + Integer.toString(this.deg - i);
            if (this.deg - i == 0)exponent = "";
            if (this.coef[deg-i]==0)exponent = "";
            if (this.deg - i == 1)exponent = "x";
            String co_ef = Double.toString(this.coef[deg-i]);
            if (this.coef[deg-i]>0 && deg-i < deg)co_ef = "+"+co_ef;
            if (co_ef.equals("0.0") || co_ef.equals("1.0"))co_ef = "";
            result += co_ef + exponent;            
        }
        return result;
    }
    
    public double calculate(double x){ //calculates y values for given x -> can be useful for graphing
        double fx = 0;
        for (int i = 0; i <= this.deg; i++) {
            fx += this.coef[this.deg-i]*Math.pow(x, this.deg-i);
            
        }
        return fx;
        
    }
    

}
