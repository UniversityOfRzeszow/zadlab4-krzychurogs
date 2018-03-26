
package pl.edu.ur.polab4.obliczanieFigur;


import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 *
 * @author krzysztof
 */
public class Koło 
{
    int r;

    public Koło(int r) 
    {
        this.r = r;
    }
    public int polekwadratu(int r)
    {
        int pole=(int)(PI*pow(r,2));
        return pole;
    }
    public int obwod(int bokwadratu)
    {
        int pi;
        int obwod=(int) (2*PI*r);
        return obwod;
    }
     
    public void danekola()
    {
        System.out.println("Kolo:");
        System.out.println("bok:"+this.r);
        System.out.println("pole:"+this.polekwadratu(r));
        System.out.println("obwod:"+this.obwod(r));
       
    }    
}