public class First_Last_occurance {
    public static int lowerBound(int arr[],int x){
        int first=arr.length;
        int low=0;
        int high=arr.length-1;

        while (low<=high) {
            int mid=low+(high-low)/2;
            if(arr[mid]>=x){
                first=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
       
        return first;
    }
    public static int upperBound(int arr[],int x){
        int last=arr.length;
        int low=0;
        int high=arr.length-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(arr[mid]>x){
                last=mid-1;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return last;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,8,8,11,13};        
        int val=8;

        System.out.println(lowerBound(arr,val));
        System.out.println(upperBound(arr, val));
    }
}
