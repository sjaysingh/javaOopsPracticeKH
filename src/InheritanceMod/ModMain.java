package InheritanceMod;

public class ModMain {
    public static void main(String[] args){
        ModArrayList listy = new ModArrayList();
        listy.add(1);
        listy.add(4);
        listy.add(5);
        listy.add(6);
        listy.add(7);

        System.out.println(listy.getUsingMod(3));
        System.out.println(listy.getUsingMod(-2));
        System.out.println(listy.getUsingMod(30));
    }

}
