package linke_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> linkeList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measureTime(linkeList);
        measureTime(arrayList);
    }

    private static void measureTime(List<Integer> List) {
        for (int i = 0; i < 1000000; i++) {
            List.add(i);
        }
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            List.get(i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}


