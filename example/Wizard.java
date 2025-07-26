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


    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if(!super.equals(obj))
        {
            return false;
        }else
        {
            if (!(obj instanceof Wizard)) {
                return false; // Not the same type
            }
            Wizard other = (Wizard) obj;
            if(this.getMp() != other.getMp() || this.spells.size() != other.spells.size())
            {
                return false; // Different MP values
            }else
            {
                return true;
            }
        }
    }

    public static void greeting() {
        Dude.greeting();
        System.out.println("Hello from Wizard class!");
    }

}
