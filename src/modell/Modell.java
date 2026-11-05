
package modell;

public class Modell {
    private String nev;
    private String mondando;
    private boolean tettes;
    public Modell(String nev,String mondando ,boolean tettes) {
        this.nev = nev;
        this.mondando = mondando;
        this.tettes = tettes;
    }
    public String getNev() {
        return nev;
    }
    public boolean isTettes() {
        return tettes;
    }  

    public String getMondando() {
        return mondando;
    }
    
}
