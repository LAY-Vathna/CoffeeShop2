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
        System.out.println("Grand Wizard: " + super.getName());
    }
    public void testGW()
    {
        System.out.println("from grandwizard");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + ", GrandWizard [spellLevel=" + spellLevel + "]";
    }
}
