/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS.recurion;

/**
 *
 * @author INT303
 */
public class BinarySearchEx {

    public static void main(String[] args) {
        Integer[] data = {2, 7, 8, 12, 14, 15, 16, 39, 47, 53, 55};
        int pos = BinarySearch(data, 25);
        System.out.println("Key 25,pos : " + pos);
        pos = BinarySearch(data, 39);
        System.out.println("Key 39,pos : " + pos);
    }

    private static int BinarySearch(Object[] data, Object key) {
        Comparable k = (Comparable) key;
        int left = 0;
        int right = data.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            Comparable x = (Comparable) data[mid];
            if (k.compareTo(x) < 0) {
                right = mid - 1;
            } else if (k.compareTo(x) > 0) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
