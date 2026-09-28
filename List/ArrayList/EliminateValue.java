package List.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EliminateValue {
    private Scanner sc = new Scanner(System.in);
    private List<Integer> list = new ArrayList<>();

    public void eliDel() {
        // Pre-populating list with consecutive duplicates to test shifting
        list.add(2);
        list.add(2); // Consecutive duplicate
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(2);
        list.add(5);

        System.out.println("Original list: " + list);
        System.out.print("Enter the number you want to delete: ");
        int del = sc.nextInt();

        // Safe backward iteration: eliminates index-shift bugs
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == del) {
                list.remove(i); // Removes index i
            }
        }

        System.out.println("Updated list:  " + list);
    }

    public static void main(String[] args) {
        EliminateValue el = new EliminateValue();
        el.eliDel();
    }
}