
package polynomials;

import java.util.ArrayList;


public class rf {
    pf num, den;
    
    public rf (pf t, pf b){
        this.num = t;
        this.den = b;
    }
    
    public double getValue(double x){
        double result = 0;
        
        result = this.num.getValue(x)/this.den.getValue(x);
        
        return result;
    }
}
