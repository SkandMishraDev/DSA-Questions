//Rotate array by d places

// public class lef {
//     public static void main(String args[]){
//         int arr[]={1,2,3,4,5};
//         int temp[]={1,2,3,4,5};
//         int d=5;
//         for(int i=d;i<arr.length;i++){
//             arr[i-d]=arr[i];
//         }
//         for(int i=0;i<d;i++){
//             arr[arr.length-d+i]=temp[i];
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//     }
    
// }

//Move zeros to end
public class lef {
    public static void main(String args[]) {
        int arr[]={1,0,2,3,2,0,0,4,5,1};
        int counter=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                counter+=1;
            }
        }
        int  j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<counter;i++){
            arr[j]=0;
            j++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
