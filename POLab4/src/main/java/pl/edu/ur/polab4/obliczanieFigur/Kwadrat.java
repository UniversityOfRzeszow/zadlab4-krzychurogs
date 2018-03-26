/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author krzysztof
 */
public class Kwadrat {
    
    int bokkwadratu;

    public Kwadrat(int bokkwadratu)
    {
        this.bokkwadratu = bokkwadratu;
    }
    public int polekwadratu(int bokwadratu)
    {
        int pole=bokkwadratu*bokkwadratu;
        return pole;
    }
    public int obwod(int bokwadratu)
    {
        int obwod=4*bokkwadratu;
        return obwod;
    }
    public void danekwadratu()
    {
        System.out.println("Kwadrat:");
        System.out.println("bok:"+bokkwadratu);
        System.out.println("pole:"+this.polekwadratu(bokkwadratu));
        System.out.println("obwod:"+this.obwod(bokkwadratu));
       
    }       
    
}
