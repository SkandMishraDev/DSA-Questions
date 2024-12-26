import java.util.HashSet;
import java.util.Iterator;

public class HashSetIntro {
    public static void main(String[] args) {
        //creating
        HashSet<Integer> set=new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //size
        System.out.println("size of set is :"+set.size());

        //print all elements of set
        System.out.println(set);


        //search-contains
        if(set.contains(2)){
            System.out.println("set contain 2");
        }
        if(!set.contains(6)){
            System.out.println("setdoes not contain 6");
        }

        //delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("set does not contain 1 after removal");
        }

        
        //Iterator
        Iterator it=set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
