public class missingnumber {
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int n=5;
        int sum=(n*(n+1))/2;
        int misSum=0;
        for(int i=0;i<n-1;i++){
            misSum+=arr[i];
        }
        int missingnumber=sum-misSum;
        System.out.println(missingnumber);
    }
    
}
