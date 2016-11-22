
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
        
        result = this.num.calculate(x)/this.den.calculate(x);
        
        return result;
    }
}
