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

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if(!super.equals(obj))
        {
            return false;
        }else
        {
            if (!(obj instanceof GrandWizard)) {
                return false; // Not the same type
            }
            GrandWizard other = (GrandWizard) obj;
            if(this.spellLevel != other.spellLevel)
            {
                return false; // Different spell levels
            }else
            {
                return true;
            }
        }
    }
}
