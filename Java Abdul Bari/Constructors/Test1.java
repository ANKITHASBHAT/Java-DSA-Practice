public class Test1 {
    public static void main(String[] args){
        Subject subs[] = new Subject[3] ;
        subs[0] = new Subject("s1","ds",100);
        subs[1] = new Subject("s2","algo",100);
        subs[2] = new Subject("s3","cs",100);
        for(Subject s:subs){
            System.out.println(s);
        }
    }
}