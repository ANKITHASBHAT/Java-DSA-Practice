public class varargs {
    public static void show(int ...a){
        for(int i:a){
            System.out.println(i);
        }
    }   
    public static void showList(String ...a){
        for(String i:a){
            System.out.println(i);
        }
    }
    public static void showMultipleLists(int start, String[] usn, String[] ...a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < usn.length; j++) {
                System.out.println("USN " + usn[j]);
            }
            System.out.println("List " + (i + start));
            start++;
        }
    }
        public static void main(String[] args){
            varargs obj = new varargs();
            obj.show(new int[]{}); // Explicitly call the show(int ...a) method with an empty integer array
            show(1);
            show(1,2);
            show(new int[]{1,2,3,4,5});
            showList("John","Doe","Jane","Doe");
            showMultipleLists(1,new String[]{"1mj21cd001", "1mj21cd002"},new String[]{"John","Doe"},new String[]{"Jane","Doe"});
        }
    }