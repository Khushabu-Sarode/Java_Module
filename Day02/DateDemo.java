public class DateDemo{
 
  public static void main(String[] args){
    Date d1 = new Date();
    d1.display();
    Date d4 = new Date();
    d4.display('-');


    Date d2=new Date(11,2,3); 
    d2.display();

    Date d3 = new Date(1,11,2003);
    d3.display('-');
 
    if(d3.isleapyr()){
      System.out.print("Leap year\n");
    }else{
      System.out.print("Not Leap year\n");

    }

  }

}
