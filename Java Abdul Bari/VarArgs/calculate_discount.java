public class calculate_discount {
    static  double discount(double ...p){
        double d=0;
        for(int i=0;i<p.length;i++){
            d+=p[i];

            if(d<500) return d;
            else if(d>=500 && d<1000) return d*0.1;
            else if(d>=1000 && d<2000) return d*0.2;
            else if(d>=2000) return d*0.3;
        }
        return d;
    }
    public static void main(String[] args){
        System.out.println(discount(100,200,300,400,500));
        System.out.println(discount());
        System.out.println(discount(100,200,300));
        System.out.println(discount(100));
    }
}