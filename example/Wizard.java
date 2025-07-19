package example;

import java.util.ArrayList;

public class Wizard extends Dude{
    protected ArrayList<String> spells = new ArrayList<>();
    
     public Wizard(String name, int hp, int mp)
    {
        super(name, hp);
        this.setMp(mp); // Initialize MP
    }

    public String castSpell(String spell) {
         this.setMp(this.getMp() - 10); // Casting a spell costs 10 MP
        return "Casting " + spell + "!";
    }
    @Override
    public void sayName() {
        // TODO Auto-generated method stub
        System.out.println("Wizard: " + this.getName());
    }
    public void testWizard()
    {
        System.out.println("from wizard");
    }
    @Override
    public String toString() {
        // "Dude [name=" + name + ", hp=" + hp + "]";
        // TODO Auto-generated method stub
        return super.toString() + ", Wizard [spells=" + spells + " mana=" + this.getMp() + "]";
    }
}
