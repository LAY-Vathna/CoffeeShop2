package example;

public class Dude {
    private String name;
    private int mp;
    private int hp;

    public Dude(String name, int hp) {
        // Default constructor
        mp = 0; // Default MP
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getMp() {
        return mp;
    }

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
}

