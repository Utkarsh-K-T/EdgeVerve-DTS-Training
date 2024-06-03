package Association04;

public class Address {
    String houseNo;
    String houseName;
    String street;

    public Address(String houseNo, String houseName, String street){
        this. houseNo = houseNo;
        this. houseName = houseName;
        this.street = street;
    }

    @Override
    public String toString(){
        return " houseNo = "+houseNo+" , houseName = "+houseName+" , street = "+street;
    }
}
