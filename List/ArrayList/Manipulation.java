package List.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class Manipulation {
    List<Integer> list=new ArrayList<>();
    public void insert(){
    list.add(5);
    list.add(8);
    list.add(1);
    list.add(4);
    list.add(0);
    System.out.println("The ArrayList is: "+list);

    List<Integer> BulkInsert=List.of(37,28,38);
    list.addAll(BulkInsert);
    System.out.println("Bulk elements inserted in List: "+list);
    System.out.println("bulk inserted elements are :"+BulkInsert);
}
public static void main(String[] args) {
    Manipulation zax=new Manipulation();
    zax.insert();
}
}
