package kivolt;

import controller.Controller;
import modell.Emberek;
import view.VIew;

public class Program {
    public static void main(String[] args) {
        Emberek emberek = new Emberek();
        view.VIew view = new VIew();
        Controller controll = new Controller(emberek,view);
        controll.indit();
    }
    
}
