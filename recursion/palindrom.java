public class palindrom {
    public static boolean f(int i, String str){
        int n=str.length();
        if(i>n/2){
            return true;
        }
        if(str.charAt(i)!=str.charAt(n-i-1)){
            return false;
        }
        return f(i+1,str);
    }
    public static void main(String args[]){
        String str="MADAM";

        if (f(0,str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
    
}
