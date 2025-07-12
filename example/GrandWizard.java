package example;

public class GrandWizard extends Wizard {

    protected int spellLevel;
    public GrandWizard(String name, int hp, int mp, int spellLevel) {
        super(name, hp, mp); // call to confirm they are already a wizard (superclass)
        this.spellLevel = spellLevel; // Initialize level
        // Additional initialization for GrandWizard if needed
    }

    @Override
    public void sayName() {
        // TODO Auto-generated method stub
        System.out.println("Grand Wizard: " + name);
    }
}
