package example;

public class Dude {
    public String name;
    public int mp = 0;
    public int hp = 100;

    public void sayName()
    {
        System.out.println("dude: " + name);
    }
    public void paunchFace(Dude target)
    {
        target.hp = target.hp - 10;
    }
}
