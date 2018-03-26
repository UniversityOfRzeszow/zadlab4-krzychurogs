
package pl.edu.ur.polab4.obliczanieFigur;


public class Prostokat
{
    int bokprostokata,bokprostokata1;

    public Prostokat(int bokprostokata, int bokprostokata1) 
    {
        this.bokprostokata = bokprostokata;
        this.bokprostokata1 = bokprostokata1;
    }

    
    
    public int poleprostokata(int bokprostokata, int bokprostokata1)
    {
        int pole=bokprostokata*bokprostokata1;
        return pole;
    }
    public int obwodprostokata(int bokprostokata, int bokprostokata1)
    {
        int obwod=2*bokprostokata+2*bokprostokata1;
        return obwod;
    }
    public void daneprostokata()
    {
        System.out.println("Kwadrat:");
        System.out.println("bok:"+this.bokprostokata+this.bokprostokata1);
        System.out.println("pole:"+this.poleprostokata(bokprostokata, bokprostokata1));
        System.out.println("obwod:"+this.obwodprostokata(bokprostokata, bokprostokata1));
       
    }       
}
