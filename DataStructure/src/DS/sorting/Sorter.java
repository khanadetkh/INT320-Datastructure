/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS.sorting;

import java.util.Comparator;

/**
 *
 * @author INT303
 */
public class Sorter {
    
    private final static int CUTOFF = 10;
    
    private static void swap(Comparable x[], int i, int j) {
        Comparable tmp = x[i];
        x[i] = x[j];
        x[j] = tmp;
    }
    
    public static void insertionSort(Comparable x[]) {
        for (int i = 1; i < x.length; i++) {
            Comparable tmp = x[i];
            int j = i;
            for (; j > 0 && tmp.compareTo(x[j - 1]) < 0; j--) {
                x[j] = x[j - 1];
            }
            x[j] = tmp;
        }
    }
    
    public static void insertion(Object data[], Comparator c) {
        if (c == null) {
            insertionUsingComparable(data);
        } else {
            insertionUsingComparator(data,c);
        }
    }

    private static void insertionUsingComparable(Object data[]) {
        for (int i = 0; i < data.length; i++) {
            Comparable tmp = (Comparable) data[i];
            int j;
            for (j = i; j > 0 && tmp.compareTo((Comparable) data[j - 1]) < 0; j--) {
                data[j] = data[j - 1];
            }
            data[j] = tmp;
        }
    }

    private static void insertionUsingComparator(Object data[], Comparator c) {
        for (int i = 0; i < data.length; i++) {
            Object tmp = data[i];
            int j;
            for (j = i; j > 0 && c.compare(tmp, data[j - 1]) < 0; j--) {
                data[j] = data[j - 1];
            }
            data[j] = tmp;
        }
        
    }
       public static void selectionSort(Comparable x[]) {
        for (int i = x.length - 1; i > 0; i--) {
            int max = 0;
            for (int j = 1; j <= i; j++) {
                if (x[j].compareTo(x[max]) > 0) {
                    max = j;
                }
            }
            if (max != i) {
                swap(x,max, i);
            }

        }
    }
    private static void swap (Object x[],int i, int j) {
        Object tmp = x[i];
        x[i] = x[j];
        x[j] = tmp;
    }
}

