/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS;

import java.util.Arrays;

/**
 *
 * @author INT303
 */
public class Datastructures {

    public static void main(String[] args) {
        int data[] = {9, 15, 32, 71, 78, 92, 101, 115, 117, 129, 270, 350, 470, 500};
        int pos = binarySearch(data, 128);
        System.out.println(pos);
    }

    public static int binarySearch(int[] data, int key) {
        int position = 0;
        int left = 0;
        int right = data.length - 1;
        while (left <= right) {

            int mid = (left + right) / 2;

            if (key == data[mid]) {
                position = mid;
                return position;
            } else if (key < data[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        position = -1;
        return position;
    }

}
