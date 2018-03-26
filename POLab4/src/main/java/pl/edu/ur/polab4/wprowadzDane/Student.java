/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;

import java.util.Scanner;


public class Student 
{  
    String imie;
    String nazwisko;
    int nrindeksu;
    int rokstudio;
    String nazwaspecjalnosci;

    public void domyslny() 
    {
        this.imie = "";
        this.nazwisko = "";
        this.nrindeksu = 0;
        this.rokstudio = 0;
        this.nazwaspecjalnosci = "";
    }
    
    public void ustaw()
    {
        Scanner odczyt=new Scanner(System.in);
        System.out.println("podaj imie");
        this.imie=odczyt.nextLine();
        System.out.println("Podaj nazwisko: ");
        this.nazwisko=odczyt.nextLine();
        System.out.println("Podaj nr indeksu: ");
        this.nrindeksu=odczyt.nextInt();
        System.out.println("Podaj rok studiow: "); 
        this.rokstudio=odczyt.nextInt();
        System.out.println("Podaj specjalnosc: ");
        this.nazwaspecjalnosci=odczyt.nextLine();
    }   
    public void info()
    {
        System.out.println("imie"+imie);
        System.out.println("nazwisko"+nazwisko);
        System.out.println("nrindeksu"+nrindeksu);
        System.out.println("rokstudio"+rokstudio);
        System.out.println("nazwaspecjalnosci"+nazwaspecjalnosci);
        
    }
  

    
    
}
