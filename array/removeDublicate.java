public class removeDublicate {
    public static void main(String args[]){
        int arr[]={1,1,2,2,2,3,3};
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[j]!=arr[i]){
                j++;
                arr[j]=arr[i];
            }

        }
        for(int i=0;i<=j;i++){
            System.out.println(arr[i]);
        }
    }
}
