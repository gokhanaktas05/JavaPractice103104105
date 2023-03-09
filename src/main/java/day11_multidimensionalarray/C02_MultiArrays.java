package day11_multidimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class C02_MultiArrays {
    public static void main(String[] args) {

      /*  Kullanıcının girdigi bir array'in en buyuk elemani ile
        en kucuk elemanının  farkını bulan kodu yaziniz

        kod sharing ten bak
                */

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfrn Array in uzunlugunu giriniz.");
        int uzunluk=input.nextInt();
        int arr[]=new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Array in"+(i+1)+". elemanını giriniz.");
            arr[i]=input.nextInt();

            Arrays.sort(arr);
            System.out.println("Array in en büyük elmanı: " +arr[uzunluk-1]);
            System.out.println("Array in en küçük elmanı: "+arr[0]);


        } System.out.println(arr[uzunluk-1]-arr[0]);


    }
}
