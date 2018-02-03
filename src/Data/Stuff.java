package Data;

public class Stuff {
    public static int count = 0;
    public static Stuff[] stuffTable;
    int value;
    int key;
    String name;

    public Stuff(int value, int key, String name)
    {
        this.key = key;
        this.name = name;
        this.value = value;
    }

    public void add(Stuff stuff)
    {
        stuffTable = new Stuff[count+1];
        stuffTable[count] = stuff;
        this.count+=1;

    }

    public static void setCount(int count) {
        Stuff.count = count;
    }
}
