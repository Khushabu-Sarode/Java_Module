public class Volume {

    private int len;
    private int hig;
    private int bre;
    
    public int res = 0;
    Volume (){
        len = hig = bre = 0;
    }

    Volume(int v,int l,int b){
        len = l;
        hig = v;
        bre = b;
    }

    // int CalculateVolume(){
    //     return res;
    // }
    
    void display(){
        res =  len*hig*bre;
        System.out.println("Total Volume is :" + res);
    }

}
