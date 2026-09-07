public class Date{
    private int dd;
    private int mm;
    private  int yy;

    public Date(){
        dd = mm = yy = 0;
    }

   public Date(int d,int m,int y){
       dd = d;
       mm = m;
       yy = y;
   }

   public void display(){
    System.out.println(dd + "/" + mm + "/" + yy);
   }
   
    public void display(char ch){
    System.out.println(dd + "" + ch + mm + "" + ch + yy);
   }
   boolean isleapyr(){
        if((yy % 4 == 0 && yy %100 != 0) || (yy% 400 == 0)){
            return true;
        }
        return false;
   }
}