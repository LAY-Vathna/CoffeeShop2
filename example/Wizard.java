package example;

import java.util.ArrayList;

public class Wizard extends Dude{
    ArrayList<String> spells = new ArrayList<>();
    public Wizard() {
        spells.add("Fireball");
        spells.add("Lightning Bolt");
    }
    public String castSpell(String spell) {
        mp -= 10; // Casting a spell costs 10 MP
        return "Casting " + spell + "!";
    }
    @Override
    public void sayName() {
        // TODO Auto-generated method stub
        System.out.println("Wizard: " + name);
    }
}
