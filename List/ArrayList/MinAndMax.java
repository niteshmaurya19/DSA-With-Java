package List.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class MinAndMax {
    List<Integer> list= new ArrayList<>();

    public void MaxMin(){
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(9);
        list.add(1);
        list.add(5);

        int min=list.get(0);
        int max=list.get(0);
        System.out.println("List are following"+ list);

        for(int i=1;i<=list.size();i++){
            if(i>max){
                max=list.get(i);
            }
            if(i<min){
                min=list.get(i);
            }
        }
        System.out.println("Max element in list: "+max);
        System.out.println("Min element in list: "+min);
    }
    public static void main(String[] args) {
        MinAndMax mm =new MinAndMax();
        mm.MaxMin();
    }
}
