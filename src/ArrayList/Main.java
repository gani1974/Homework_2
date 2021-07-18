package ArrayList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(16);
        arrayList.add(34);
        System.out.println(arrayList.getSize());
        System.out.println(arrayList.toString());
        System.out.println(Arrays.asList(arrayList));
    }
}
