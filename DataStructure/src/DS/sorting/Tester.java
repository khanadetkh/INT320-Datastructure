package DS.sorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author PAKBUNGZ
 */
public class Tester {

    public static void main(String[] args) {
        Integer x[] = new Integer[2_000];
        Integer y[] = new Integer[2_000];
        for (int i = 0; i < x.length; i++) {
            x[i] = new Integer((int) (Math.random() * 100));
        }
//        System.out.println("Insertion Sorting---------------");
//        System.out.println("Before sorting........");
//       printArray(x);
//        Sorter.selectionSort(x);
//        System.out.println("\nSorted........");
//        printArray(x);
//        System.out.println("==================================");
//        System.out.println("Selection Sorting---------------");
//        System.out.println("Before sorting........");
//        printArray(x);
//        /*Desc*/
//        Sorter.insertion(x, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        }
//        );
//        System.out.println("\nSorted Desc");
//        printArray(x);
//        /*Asc*/
//        Sorter.insertion(x, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        }
//        );
//      System.out.println("\nSorted Asc");
//        printArray(x);
        System.out.println("==================================");
        System.out.println("Arrays Method Sorting---------------");
//        System.out.println("Before sorting........");
//        printArray(x);
//        Arrays.sort(x, 0, 20);
//        Arrays.parallelSort(x);
       System.arraycopy(x, 0, y, 0, x.length);
        long before = System.currentTimeMillis();
        Arrays.parallelSort(x);
        long duration1 = System.currentTimeMillis()-before;
        before = System.currentTimeMillis();
        Sorter.insertionSort(y);
         long duration2 = System.currentTimeMillis()-before;
        System.out.println("Parallel sort : " + duration1+" Millis");
        System.out.println("Parallel sort : " + duration2+" Millis");
//        System.out.println("\nSorted...........");
//        printArray(x);
    }

    private static void printArray(Object[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%d%s", x[i], (i + 1) % 10 == 0 ? "\n" : "\t");
        }
        System.out.println("");
    }
}
