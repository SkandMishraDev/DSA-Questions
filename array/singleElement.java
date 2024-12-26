public class singleElement {
    public static void main(String args[]){
        int arr[]={1,1,2,2,3,3,4,5,5,6,6};
        for(int i=0;i<arr.length;i++){
            if(i==0){
                if(arr[i]!=arr[i+1]){
                    System.out.println(arr[i]);
                    return;
                }
            }
            else if(i==arr.length-1){
                if(arr[i]!=arr[i-1]){
                    System.out.println(arr[i]);
                    return;
                }
            }else if(arr[i]!=arr[i+1]&&arr[i]!=arr[i-1]){
                System.out.println(arr[i]);
                return;
            }
        }
    }
    
}
