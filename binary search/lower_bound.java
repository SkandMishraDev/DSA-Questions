public class lower_bound {
    public static int lowerBound(int x,int arr[]){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;  
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String  args[]){
        int arr[]={1,2,3,3,5,8,8,10,10,11};
        int tar=2;
        System.out.println(lowerBound(tar,arr));
    } 
}
