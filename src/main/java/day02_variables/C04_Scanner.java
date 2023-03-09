package day02_variables;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("4 basamaklı bir sayı giriniz...");
        int sayı = scanner.nextInt();
        //Bir sayının birler basamağını %10(macıılıs 10) ile hesaplatırız.
        int sonRakam=sayı%10;
        int ilkRakam=sayı/1000;

        // System.out.println("ilk rakam + son rakam"+(ilkRakam+sonRakam));

        //Soru 2) Kullanicidan uc basamakli bir sayi alin
        // ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin...
          //   Ornek : Inputs : 853
    //Output : Girdiginiz sayinin birler basamagi : 3
     //        Girdiginiz sayinin onlar basamagi : 5
      //       Girdiginiz sayinin yuzler basamagi : 8


      /*  Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz...");
        int s = input.nextInt();
        if(s%2==0) {
            System.out.println("Cift sayı...");
        }
            if(s%2!=0){

                System.out.println("Tek sayı...");
            }*/
       /* Scanner input = new Scanner(System.in);
        int s = input.nextInt();
            if(s%2==0){
                System.out.println("Cift sayı..");

            }else{
                System.out.println("Tek sayı...");
            }*/

        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();
// 1) 1 ler basamagindaki sayiyi bulun
        int birler = sayi % 10;
        System.out.println("girdiginiz sayinin birler basamagi " + birler);
        sayi /= 10;
// 2) 10 lar basamagindaki sayiyi bulun
        int onlar = sayi % 10;
        System.out.println("girdiginiz sayinin onlar basamagi " + onlar);
// 3) 100 ler basamagindaki sayiyi bulun
        int yuzler = sayi /= 10;
        System.out.println("girdiginiz sayinin yuzler basamagi " + yuzler);

        Scanner input =new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        double number =input.nextDouble();
        if(number>0) {
            System.out.println("Pozitif...");
        }else if(number<0) {
            System.out.println("Negatif...");
        }else{
                    System.out.println("Notr...");

                }
            }
            }








