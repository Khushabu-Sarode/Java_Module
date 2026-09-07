public class Rgb {
    private int r;
    private int g;
    private int b;

    Rgb(){
        r = g = b = 0;
    }

    Rgb(int red,int green,int black){
        this.r = (red >= 0 && red <= 255) ? red :0;
        this.g = (green >= 0 && green <= 255) ? green :0;
        this.b = (black >= 0 && black <= 255) ? black :0;
    }

    void display(){
        if( (r = b = g) == 0){
            System.out.println("Color is black");
        }
        else if( (r= b = g) == 255 ){
            System.out.println("Color is white");  
        }
        else if( (r == 255) && ((b = g) == 0)){
            System.out.println("Color is red");
        }
        else if( (r = b) == 0 && (g == 255)){
            System.out.println("Color is green");
        }
        else if( (r = g ) == 0 && (b == 255)){
            System.out.println("Color is blue");
        }else{
            System.out.println("Color is RGBShade");
        }
    }
     
}
