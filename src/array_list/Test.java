package array_list;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <= 30; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(29));

        //a:
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }

        System.out.println("\n");

        //b:
        for (Integer x : arrayList) {
            System.out.print(x);
        }
    }
}
