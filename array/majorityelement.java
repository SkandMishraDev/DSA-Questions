import java.util.HashMap;
import java.util.Map;

public class majorityelement {
    public static void main(String args[]){
        int arr[]={2,2,3,3,1,2,2};
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue()>n/2){
                System.out.println(e.getKey());
                break;
            }
        }
    }
    
}
