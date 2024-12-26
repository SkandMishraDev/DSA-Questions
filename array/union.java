// import java.util.HashSet;

// public class union {
//     public static void main(String[] args) {
//         int arr1[]={1,1,2,3,4,5};
//         int arr2[]={2,3,4,4,5,6};
        
//         HashSet<Integer> unionSet=new HashSet<>();

//         for(int i=0;i<arr1.length;i++){
//             unionSet.add(arr1[i]);
//         }
//         for(int i=0;i<arr2.length;i++){
//             unionSet.add(arr2[i]);
//         }
//         // for(int element : unionSet){
//         //     System.out.println(element+" ");
//         // }
//         System.out.println(unionSet);
//     }
    
// }

public class union {
    public static void main(String[] args) {
        int arr1[]={1,1,2,3,4,5};
        int arr2[]={2,3,4,4,5,6};
        int temp[]=new int[arr1.length+ arr2.length];

        int j=0;
        temp[0]=arr1[0];

        for(int i=1;i<arr1.length;i++){
            if(temp[j]!=arr1[i]){
                j++;
                temp[j]=arr1[i];
            }
        }
        for(int i=0;i<arr2.length;i++){
            boolean isDuplicate =false;
            for(int a=0;a<j;a++){
                if(temp[a]!=arr2[i]){
                    temp[j++]=arr2[i];
                }
            }
         } System.out.println("Union of arr1 and arr2:");
            for (int i = 0; i < j; i++) {
                System.out.print(temp[i] + " ");
            }
    }
}