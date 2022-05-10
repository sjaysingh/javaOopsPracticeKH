package ContactsPoly;

public class ContactMain {

    public static void main(String[] args){
        Contact con1 = new Contact("Chris",new PhoneNumber("+91124567890"), "chris@york.com");
        Contact con2 = new Contact("Mike", new PhoneNumber("+449423948299"));
        Contact con3 = new Contact("Luke", "luke@york.com");
        Contact con4 = new Contact("James", new PhoneNumber(1, "9843729203"));


        con1.displayContact();
        con2.displayContact();
        con3.displayContact();
        con4.displayContact();

        System.out.println("\n");

        System.out.println(con1);
        System.out.println(con2);
        System.out.println(con3);
        System.out.println(con4);

    }

}
