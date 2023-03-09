package day08loops;

import java.util.Scanner;

public class C01_ForLoops {
    public static void main(String[] args) {

        //Kullanicidan baslangic , bitis ve artis miktarini alarak
        // aradaki tum sayilari aralarina virgul koyarak yazdirin


        int baslangic = 10;
        int bitis = 50;
        int artis = 5;

        for (int i = baslangic; i <= bitis; i += artis) {
            if (i < bitis) {
                System.out.print(i + ", ");
            } else {
                System.out.println(i);
            }

        }

        /*

 Interview Question
      Kullanicidan 100’den kucuk bir tamsayi isteyin.
      1’den baslayarak girilen sayiya kadar tum sayilari yazdirin.
      Ancak;
      - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
      - Sayi 5’in kati ise sayi yerine "Guzeldir" yazdirin.
      - Sayi hem 3’un hem 5’in kati ise sayi yerine " ** Java Guzeldir ** " yazdirin.
 */

        int s = 30;
        for (int i = 1; i <= s; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("**Java güzeldir**");
            } else if (i % 5 == 0) {
                System.out.println("Güzeldir.");
            } else if (i % 3 == 0) {
                System.out.print("Java");

            } else {
                System.out.print(i + " ");
            }
        }


    }
}