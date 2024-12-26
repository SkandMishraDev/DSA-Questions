public class sumProblem {
    public static void main(String args[]){
        int arr[]={2,6,5,8,11};
        int target =14;
        boolean have=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if((arr[i]+arr[j])==target){
                    have=true;
                    System.out.println("Pair found at "+arr[i]+", "+arr[j]);
                    break;
                }
            }
            if(have)break;
        }
        if(!have){
            System.out.println("No pair exits in the array");
        }
    }
}
// Time complexity is O(n^2)

// import java.util.HashMap;

// public class sumProblem {
//     public static void main(String args[]){
//         int arr[]={2,6,5,8,11};
//         int target=14;
//         boolean pairfound=false;
//         HashMap<Integer,Integer> map=new HashMap<>();

//         for(int i=0;i<arr.length;i++){
//             int value=target-arr[i];
//             if(map.containsKey(value)){
//                 System.out.println("Pair exit at "+i+", "+ map.get(value));
//                 pairfound=true;
//                 break;
//             }
//             map.put(arr[i],i);
//         }
//         if(!pairfound){
//             System.out.println("No pair exits");
//         }
//     }
// }