public class reverseArray {
    public static void reverse(int i,int[] arr){
        int n=arr.length-1;
        if(n/2 <i){
            return;
        }
        
        int temp =arr[n-i];
        arr[n-i]=arr[i];
        arr[i]=temp;
        reverse(i+1,arr);
        
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,5,4};
        int l=0;
        
        reverse(l,arr);
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
