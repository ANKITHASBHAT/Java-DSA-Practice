
public class StringPallindrome {
    static private boolean CheckString(String str){
        int left = 0, right = str.length()-1;
        while(left < right){
            char  l = str.charAt(left), r = str.charAt(right);
            if(!Character.isLetterOrDigit(l)){
                left++;
            }
            else if(!Character.isLetterOrDigit(r)){
                right--;
            }
            else if(Character.toLowerCase(l)!=Character.toLowerCase(r)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
}
public static void main(String[] args){
    String str ="ABCDCBA";
    boolean ans = CheckString(str);

    if(ans == true){
        System.out.println("Pallindrome");
    }
    else{
        System.out.println("Not Pallindrome");
    }

}
}