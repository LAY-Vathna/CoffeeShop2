package objects;

import example.Dude;
import example.Wizard;

public class GameStart {
    public static void main(String[] args) {
        // Dude dude1 = new Dude();
        // dude1.name = "Dude1";
        // dude1.sayName();

        // Dude dude2 = new Dude();
        // dude2.name = "Dude2";
        // dude2.sayName();
        
        // Wizard wizard = new Wizard();
        // wizard.name = "Wizard";
        // ((Dude) wizard).sayName();

        // GrandWizard gWizard = new GrandWizard();
        // gWizard.name = "Grand Wizard";
        // gWizard.sayName();

        Dude dude1 = new Dude("Dude1", 100);
        Wizard wizard = new Wizard("Wizard", 80, 150);
        System.out.println(wizard.getMp());


        // dude2.paunchFace(dude1);
        // dude1.paunchFace(wizard);
        
        // // Paunching the face
        // System.out.println("Before paunching: " + dude1.hp);
        // System.out.println("After paunching: " + dude1.mp);
        // System.out.println("Before paunching: " + wizard.hp);
        // System.out.println("After paunching: " + wizard.mp);
    }
}
