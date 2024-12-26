
public class fibonacci {
    public static void series(int a,int b,int n){
        if(n<=0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        series(b,c,n-1);
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n =7;
        System.out.println(a);
        System.out.println(b);
        series(a,b,n-2);
    }
    
}
