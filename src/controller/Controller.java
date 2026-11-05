package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modell.Emberek;
import modell.Modell;
import view.VIew;

public class Controller {
    private Emberek emberek;
    private view.VIew view;
    private Scanner src= new Scanner(System.in);

    public Controller(Emberek emberek, VIew view) {
        this.emberek = emberek;
        this.view = view;
    }
    
    
    public void indit(){
        kezdet();
        int adat=adatbekeres();
        jovalaszvolte(adatellenorzes(adat));
    }
    public void kezdet(){
        for (int i = 0; i <emberek.getEmberek().size(); i++) {
            view.kiirnolinechange(emberek.getEmberek().get(i).getNev()+" : ");
            view.kiir(emberek.getEmberek().get(i).getMondando());
        }
        
    }
    public int adatbekeres(){
    view.kiir("melyik ember volt szerinted? (1-Anna,2-Bela,3-Csaba,4-Dezso)");
    int valasztas = src.nextInt();
    return valasztas;
    }
    public void jovalaszvolte(boolean valasz){
        if(valasz){view.kiir("a program keszito egyan ezt gondolja");}else{view.kiir("lehet hogy eltatlaltad de en nem ezt valasztottam");}
    }
    
    public boolean adatellenorzes(int szam){
        int valasztas=szam;
        while(valasztas<1||valasztas>4){
            view.kiir("rossz valaszt adtal meg, keret: [1-4]");
            view.kiir("melyik ember volt szerinted? (1-Anna,2-Bela,3-Csaba,4-Dezso)");
            valasztas = src.nextInt();
        }
        if(valasztas!=1){return false;}else{return true;}
    }
    
}
    

