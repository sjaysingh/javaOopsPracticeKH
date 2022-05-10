package ContactsPoly;

public class PhoneNumber {
    private int countryCode;
    private String phoneNumber;

    public PhoneNumber(String phoneNumber){
        if(phoneNumber.length()>10){
            this.countryCode=Integer.parseInt(phoneNumber
                    .substring(0, phoneNumber.length()-10));
            this.phoneNumber=phoneNumber
                    .substring(phoneNumber.length()-10);
        }
        else{
            this.countryCode=91;
            this.phoneNumber=phoneNumber;
        }
    }

    public PhoneNumber(int countryCode, String phoneNumber){
        this.countryCode=countryCode;
        this.phoneNumber=phoneNumber;

    }

    public String getPhoneNumber(){
        return this.countryCode + (String)this.phoneNumber;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "countryCode=" + countryCode +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
