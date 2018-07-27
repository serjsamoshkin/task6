package ua.testing;

import ua.testing.collect.UndeletableArrayList;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] array = {4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7};
        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < array.length; i++) {
            map.merge(array[i], 1, Integer::sum);
        }

        System.out.println(map);


        List<Integer> list = new UndeletableArrayList<>(Arrays.asList(4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7));
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            try {
                iterator.remove();
            }catch (UnsupportedOperationException e){
                System.out.println("All right!");
                break;
            }

        }



    }

}
