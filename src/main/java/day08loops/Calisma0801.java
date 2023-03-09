package day08loops;

import java.util.Scanner;

public class Calisma0801 {
    public static void main(String[] args) {
        //Kullanicidan baslangic , bitis ve artis miktarini alarak
        // aradaki tum sayilari aralarina virgul koyarak yazdirin

        Scanner input = new Scanner(System.in);

        /*
     Interview Question
          Kullanicidan 100’den kucuk bir tamsayi isteyin.
          1’den baslayarak girilen sayiya kadar tum sayilari yazdirin.
          Ancak;
          - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
          - Sayi 5’in kati ise sayi yerine "Guzeldir" yazdirin.
          - Sayi hem 3’un hem 5’in kati ise sayi yerine " ** Java Guzeldir ** " yazdirin.
     */
        /*System.out.println("Lütfen 100 den küçük bir sayı giriniz..");
        int sayi = input.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            if(i%3==0 && i%5==0){
                System.out.print("** Java Guzeldir ** " );
            }else if(i%3==0){
                System.out.print(" Java " );
            }else if(i%5==0){
                System.out.print( " Guzeldir ");
            }else System.out.print(i+" ");
        }

*/
        /*INPUT : Cumle: Java ogrenmek cok guzel. ==> Harf :e

        OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.*/

        System.out.println("Bir cümle giriniz..");
        String cumle=input.nextLine().toLowerCase();
        System.out.println("Lütfen bir harf giriniz..");
        char harf=input.next().toLowerCase().charAt(0);
        int sayac=0;
        for (int i=0; i<cumle.length();i++){
            if (cumle.charAt(i)==harf){
                sayac++;
            }
        }
        System.out.println(sayac+" kere kullanıldı.");


    }
}