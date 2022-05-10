package ContactsPoly;

import java.util.Random;

public class Contact {
    private String name;
    private PhoneNumber number;
    private String email;
    private final int contactID=this.generateID();

    Contact(String name, PhoneNumber number, String email){
        this.name=name;
        this.number=number;
        this.email=email;
    }

    Contact(String name, PhoneNumber number){
        this.name=name;
        this.number=number;
        this.email="NA";

    }

    Contact(String name, String email){
        this.name=name;
        this.email=email;
        this.number = new PhoneNumber("NA");
    }

    public void displayContact(){
        System.out.println("Contact ID: "+ this.contactID);
        System.out.println("Contact Name: "+ this.name);
        System.out.println("Contact Number: "+ this.number.getPhoneNumber());
        System.out.println("Contact Name: "+ this.name);

    }

    private int generateID(){
        Random rand = new Random();
        return rand.nextInt(1000);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", email='" + email + '\'' +
                ", contactID=" + contactID +
                '}';
    }
}
