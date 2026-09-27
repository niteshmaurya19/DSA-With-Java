package List.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;


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
    // sax=list.set(2, 99);
    // System.out.println("Bulk elements inserted in List: "+list);
}
public void delete(){
    // list.remove(1);

    // list.remove(Integer.valueOf(99));

    list.removeIf(n-> n>50);
    System.out.println("List after removing elements which greater then 50: "+list);
}
public void Iteratror(){
    // Iterator<Integer> it = list.iterator();
    // while(it.hasNext()){
    //     int val= it.next();
    //     if(val==5){
    //         it.remove();
    //     }
    // }
    System.out.println("delete 5 with use of iterator: "+list);
    List<Integer> reverse=new ArrayList<>();
    ListIterator<Integer> li = list.listIterator(list.size());
while (li.hasPrevious()){
    reverse.add(li.previous());
}
System.out.println(reverse);

// sorting in natural accending order.
Collections.sort(list);
System.out.println(list);
// reverse the list
Collections.reverse(list);
System.out.println(list);
}
public static void main(String[] args) {
    Manipulation zax=new Manipulation();
    zax.insert();
    // zax.delete();
    zax.Iteratror();
}
}
