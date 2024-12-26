public class insert_positon {
    public static int insertPosition(int x,int arr[]){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while (low<=high) {
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
    public static void main(String[] args) {
        int arr[]={2,3,6,7,8,8,11,11,11,12};
        int tar=4;
        insertPosition(tar,arr);
    }
    
}
