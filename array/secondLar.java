//Brute force approch

// public class secondLar {
//     public static void sorting(int[] arr,int low, int high){
//         if(low>=high){
//             return;
//         }
//         int mid=(low+high)/2;
//         sorting(arr,low,mid);
//         sorting(arr,mid+1,high);

//         int[] temp=new int[high-low+1];
//         int left=low;
//         int right=mid+1;
//         int index=0;

//         while(left<=mid && right<=high){
//             if(arr[left]<arr[right]){
//                 temp[index++]=arr[left++];
//             }else{
//                 temp[index++]=arr[right++];
//             }
//         }
//         while(left<=mid){
//             temp[index++]=arr[left++];
//         }
//         while(right<=high){
//             temp[index++]=arr[right++];
//         }
//         for(int i=0;i<temp.length;i++){
//             arr[low+i]=temp[i];
//         }
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,4,7,7,5};
//         int low=0;
//         int high=arr.length-1;
//         sorting(arr,low,high);
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//         int x=0;
//         for(int i=1;i<high+1;i++){
//             if(arr[high]>arr[high-i]){
//                 System.out.println("second largest element "+arr[high-i]);
//                 return;
//             }
//         }
//     }
    
// }

//better approch

// public class secondLar {
//     public static void main(String args[]){
//         int arr[]={1,2,4,7,7,5};
//         int largest=0;
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]>arr[largest]){
//                 largest=i;
//             }
//         }
//         int secondLargest=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>arr[secondLargest] && arr[i]!=arr[largest]){
//                 secondLargest=i;
//             }
//         }
//         System.out.println(arr[secondLargest]);
//     }
// }

//Optimal approch

public class secondLar {
    public static void main(String[] args) {
        int arr[]={1,2,4,7,7,5};
        int largest=arr[0];
        int secondLargest= -1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}