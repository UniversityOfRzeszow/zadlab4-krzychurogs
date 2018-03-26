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
public class Szescian 
{
    int bokszescianu;

    public Szescian(int bokszescianu) 
    {
        this.bokszescianu = bokszescianu;
    }
    public int objetoscszescianu(int bokszescianu)
    {
        int objetosc=bokszescianu*bokszescianu*bokszescianu;
        return objetosc;
    }
     public int poleszescianu(int bokszescianu)
    {
        int pole=(int) (6*pow(bokszescianu,2));
        return pole;
    }
    public void danekwadratu()
    {
        System.out.println("Szescian:");
        System.out.println("bok:"+this.bokszescianu);
        System.out.println("pole:"+this.poleszescianu(bokszescianu));
        System.out.println("objetosc:"+this.objetoscszescianu(bokszescianu));
       
    }    
}
