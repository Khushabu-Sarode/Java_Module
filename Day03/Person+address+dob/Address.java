public class Address {
    String location;
    String Area;
    String city;
    String state;
    int pincode;

    Address(){
        location = "location";
        Area = "Area";
        city = "city";
        state = "state";
        pincode = 0000;
    }

    Address( String location,
    String Area,
    String city,
    String state,
    int pincode){
        this.location = location;
        this.city = city;
        this.Area = Area;
        this.pincode = pincode;
        this.state = state;
    }


    void display(){
        System.out.println(location + "," +Area + "," + city + "," + state + "," +pincode);
    }
}
