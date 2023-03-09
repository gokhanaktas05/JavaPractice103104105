package day10_arrays;

import java.util.ArrayList;
import java.util.List;

public class Day10Calsmalar01 {
    public static void main(String[] args) {
        //EX:Size verilen ArrayListte 8 (inclusive-dahil) ve 8 den onceki tum elemanlari 2 katina cikariniz..
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        for (int i = 0; i < nums.size(); i++) {
            nums.set(i, nums.get(i) * 2);

            if (nums.get(i) == 8) {
                nums.set(i, nums.get(i) * 2);
                break;
            }
        }
        System.out.println(nums);
        //Aşağıdaki mutli dimensional array'lerin iç array'lerinde
// aynı indexe sahip elamanların toplamını yazdıran bir program yazın.
// int arr1[][] = {{1, 2}, { 3, 4, 5},{6}};
// int arr2[][] = {{7, 8,9},{10,11 }, {12}};

        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};

        int sinir = 0;
        int toplam = 0;

        for (int i = 0; i < arr1.length; i++) {
            sinir = arr1.length;
            if (arr1[i].length > arr2[i].length) {
                sinir = arr2[i].length;
            }
            for (int j = 0; j < sinir; i++) {
                toplam = arr1[i][j] + arr2[i][j];
                System.out.println(i + j);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            sinir = arr1[i].length;
            if (arr1[i].length > arr2[i].length) {
                sinir = arr2[i].length;
            }
            for (int j = 0; j < sinir; j++) {
                toplam = arr1[i][j] + arr2[i][j];
                System.out.println(i + "," + j + " indexindeki elemanlarin toplami" + toplam);
            }
        }
    }
    }



