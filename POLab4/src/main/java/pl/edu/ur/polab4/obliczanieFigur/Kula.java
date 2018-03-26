/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

import static java.lang.Math.PI;
import static java.lang.Math.pow;


public class Kula 
{
  int r;
    private int Pi;


    public Kula(int r) 
    {
        this.r = r;
    }
  public float ppkuli(int r)
    {
        float pole = (float) (4 * Math.PI * pow(r, 2));
            return pole;
    }
   public float objetosckuli(int r)
    {
        float objetosc = (float) (4 * Math.PI * pow(r, 3) / 3);
        return objetosc;
    }
 public void daneprostopadloscianu()
    {
        System.out.println("Kula:");
        System.out.println("bok:"+this.r);
        System.out.println("pole:"+this.ppkuli(r));
        System.out.println("objetosc:"+this.objetosckuli(r));
       
    }  
}
