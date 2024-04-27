/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.selectionsort;

/**
 *
 * @author kamau
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] my_array = {64, 34, 25, 12, 22, 11, 90, 5};
        int n = my_array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_value = i;
            for (int j = i + 1; j < n; j++) {
                if (my_array[min_value] > my_array[j]) {
                    min_value = j;
                }
            }
            int temp = my_array[min_value];
            my_array[min_value]= my_array[i];
            my_array[i] = temp;   
        }

          System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(my_array[i] + " ");
        }
        System.out.println();
    }
}
