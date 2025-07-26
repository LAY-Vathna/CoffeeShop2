package example;


public class Dude {


    private String name;
    private int mp;
    private int hp;

    public Dude(String name, int hp) {
        // Default constructor
        mp = 0; // Default MP
        setName(name);
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    //protected so only the subclass can access it
    protected void setName(String name) {
        if(name == null || name.isEmpty()) {
            System.out.println("Name cannot be null or empty. Setting to 'Unknown'.");
            System.exit(8);
        }else
        {
            this.name = name;
        }
    }

    public int getMp() {
        return mp;
    }

    //make sure they can only set the correct mp value
    protected void setMp(int mp) {
        if(mp < 0 || mp > 100) {
            System.out.println("MP cannot be negative. Setting to 0. or above 100");
            System.out.println("please set the mana again");
        }else {
            this.mp = mp;
        }
    }

    public int getHp() {
        return hp;
    }

    protected void setHp(int hp) {
        this.hp = hp;
    }

    public void sayName()
    {
        System.out.println("dude: " + name);
    }
    public void paunchFace(Dude target)
    {
        target.hp = target.hp - 10;
    }
    @Override
    public String toString() {
        return "Dude [name=" + name + ", hp =" + hp + "]";
    }

    @Override
    public boolean equals(Object obj) {
        
        if (obj == null)
            return false;
        // test before passing to the function
        
        Dude other = (Dude) obj;
        if (!(other instanceof Dude)) {
            return false; // Not the same type
        }
        if(this.name.equals(other.name) && this.hp == other.hp)
        {
            return true;
        }
        else{
            return false;
        }

    }

    public static void greeting()
    {
        System.out.println("Hello from Dude class!");
    }
    

}

