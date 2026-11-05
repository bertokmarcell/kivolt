
package modell;

import java.util.ArrayList;
import java.util.List;

public class Emberek {
    private List<modell.Modell> emberek = new ArrayList<>();

    public Emberek() {
        feltölt();
    }
    
    public void feltölt(){
        emberek.add(new Modell("Anna","Bela volt!",false));
        emberek.add(new Modell("Bela","Csaba volt!",false));
        emberek.add(new Modell("Csaba","nem Bela volt!",false));
        emberek.add(new Modell("Dezso","nem Csaba volt!",false));
    }

    public List<Modell> getEmberek() {
        return emberek;
    }
    public void lathat(){}
    
}
