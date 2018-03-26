/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;


public class Prostopadloscian 
{
    int a,b,c;

    public Prostopadloscian(int a, int b, int c) 
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int poleprostopadloscianu(int a,int b, int c)
    {
        int pole=2*(a*b+a*c+b*c);
        return pole;
    }
    public int objetosc(int a,int b, int c)
    {
        int objetosc=a*b*c;
        return objetosc;
    }
     public void daneprostopadloscianu()
    {
        System.out.println("Prostopadloscian:");
        System.out.println("bok:"+this.a+this.b+this.c);
        System.out.println("pole:"+this.poleprostopadloscianu(a, b, c));
        System.out.println("objetosc:"+this.objetosc(a, b, c));
       
    }   
}
