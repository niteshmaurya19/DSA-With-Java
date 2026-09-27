package List.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class Manipulation {
    List<Integer> list=new ArrayList<>();
    public void insert(){
        //insert at end
    list.add(5);
    list.add(8);
    list.add(1);
    list.add(4);
    list.add(0);
    list.add(4,6); //insert element at specific position

    System.out.println("The ArrayList is: "+list);

    //bulk insert element in list
    List<Integer> BulkInsert=List.of(37,28,38);
    list.addAll(BulkInsert); //append all elements at end(default)
    // list.addAll(0, BulkInsert); Append at Specific position.

    System.out.println("Bulk elements inserted in List: "+list);
    System.out.println("bulk inserted elements are :"+BulkInsert);

    //get the first element of list
    Integer sax=list.getFirst();
    System.out.println(sax);

    //replace the data with index.
    sax=list.set(2, 99);
    System.out.println("Bulk elements inserted in List: "+list);
}
public void delete(){
    // list.remove(1);

    // list.remove(Integer.valueOf(99));

    list.removeIf(n-> n>50);
    System.out.println("List after removing elements which greater then 50: "+list);
}
public static void main(String[] args) {
    Manipulation zax=new Manipulation();
    zax.insert();
    zax.delete();
}
}
