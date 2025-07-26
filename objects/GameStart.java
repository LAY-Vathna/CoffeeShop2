package objects;

import java.util.ArrayList;

import example.Dude;
import example.GrandWizard;
import example.Wizard;

public class GameStart {
    public static void main(String[] args) {
        Dude s1 = new Dude("Hello", 100);
        Dude s2 = new Dude("Hello",100);
        Wizard wizard = new Wizard("Hello", 100, 100);
        
        // System.out.println(s1.equals(wizard));
        Dude.greeting();
        Wizard.greeting();

        // Dude dude = new Dude("dude1", 100);
        // GrandWizard grandWizard = new GrandWizard("grandwizard1", 100, 100, 5);

        // ArrayList<Dude> heroList = new ArrayList<>();  
           
        // heroList.add(grandWizard);
        // heroList.add(wizard);
        // heroList.add(dude);
        // for (Dude dude1 : heroList) {
        //     if(dude1 instanceof GrandWizard)
        //     {
        //         System.out.println(dude1);
        //         //  ((GrandWizard) dude1).testGW(); // Call GrandWizard specific method
        //     }else if(dude1 instanceof Wizard)
        //     {
        //         // ((Wizard) dude1).testWizard(); // Call Wizard specific method
        //         System.out.println(dude1);
        //     }
        //     else if(dude1 instanceof Dude)
        //     {
        //         System.out.println(dude1);
        //         //  dude1.sayName(); // Call Dude's sayName method
        //     }
        //     else
        //     {
        //         // System.out.println("Unknown type of hero");
        //     }
        // }

        // heroList.get(0).sayName();
        // heroList.get(1).sayName();
        // heroList.get(2).sayName();

        // Dude d1 = heroList.get(1);
        // GrandWizard gw = (GrandWizard) d1; // Downcasting to GrandWizard
        // gw.testGW(); // Call GrandWizard specific method
        // ((GrandWizard) heroList.get(0)).testGW();

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

        // Dude dude1 = new Dude("Dude1", 100);
        // Wizard wizard = new Wizard("Wizard", 80, 150);
        // System.out.println(wizard.getMp());


        // dude2.paunchFace(dude1);
        // dude1.paunchFace(wizard);
        
        // // Paunching the face
        // System.out.println("Before paunching: " + dude1.hp);
        // System.out.println("After paunching: " + dude1.mp);
        // System.out.println("Before paunching: " + wizard.hp);
        // System.out.println("After paunching: " + wizard.mp);
    }
}
