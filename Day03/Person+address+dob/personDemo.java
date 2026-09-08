public class personDemo {
    public static void main(String[] args) {
        
        Date d1 = new Date(1,2,2003);

       Address present = new Address(
         "123",
                "Ganesh Colony",
                "Karvenagar, Pune",
                "Maharashtra",
                411004
       );

       Address permanent = new Address(
          "45/A",
                "Sharada Society",
                "Dadar, Mumbai",
                "Maharashtra",
                400004
       );


        Person p1 = new Person("Women",d1,present,permanent);

        p1.display();
    }
}
