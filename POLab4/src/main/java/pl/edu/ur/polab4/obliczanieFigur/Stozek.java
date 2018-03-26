/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

import static java.lang.Math.pow;

/**
 *
 * @author krzysztof
 */
public class Stozek 
{
    int r,l,h;

    public Stozek(int r, int l, int h) 
    {
        this.r = r;
        this.l = l;
        this.h = h;
    }
    public float polestozka(int r, int l)
    {
            float pole = (float) (Math.PI * pow(r, 2)+Math.PI*r*l);
            return pole;
     }
      public float objetoscstozka(int h, int r) 
      {
            float objetosc = (float)(Math.PI*pow(r, 2)*h/ 3);
            return objetosc;
       }
    public void danestozka()
    {
        System.out.println("dane stozka");
        System.out.println("promien,wysokosc,tworzaca"+this.r+this.h+this.l);
        System.out.println("pole to"+this.polestozka(r, l));
        System.out.println("objetosc"+this.objetoscstozka(h, r));
        
    }   
    
}
