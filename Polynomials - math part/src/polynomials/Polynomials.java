package polynomials;
public class Polynomials {

    
    public static void main(String[] args) {
        System.out.println("original: y=3x^3-2x^2+3x^1+6");
        pf p = new pf("3x^3-2x^2+3x^1+6");
        p.print();
    }
}
