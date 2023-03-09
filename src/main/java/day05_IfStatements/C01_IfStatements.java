package day05_IfStatements;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {


  /*Soru 6) Kullanicidan iki sayi isteyin,
 sayilarin ikisi de pozitif ise "sayilarin toplamini "yazdirin,
 sayilarin ikisi de negative ise "sayilarin carpimini" yazdirin,
 sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
 sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.*/

      /*  Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ilk sayıyı giriniz...");
        double sayı1=input.nextDouble();
        System.out.println("Lütfen ikinci sayıyı giriniz...");
        double sayı2=input.nextDouble();
         if(sayı1>0&&sayı2>0) {
             System.out.println("sayıların toplamı" + (sayı1 + sayı2));
         }else if(sayı1<0&&sayı2<0) {
             System.out.println("sayıların carpımı" + (sayı1 * sayı2));
         }else if(sayı1*sayı2<0) {
             System.out.println("Farklı işaretlerle işlem yapamazsın...");
         }else if(sayı1==0 ||sayı2==0){
             System.out.println("sifir carpmaya gore yutan elemandir");*/

                 // Kullanicidan yasini isteyin
// 65 veya daha buyukse emekli olabilirsin
// 65'den kucukse emekli olamazsin "? sene daha calisman lazim" yazdirin
                 Scanner input = new Scanner(System.in);
                 System.out.println("yaşını pozitif sayı olarak giriniz");
                 int yas= input.nextInt();
                 if(yas>65) {
                     System.out.println("emekli olabilirsin...");
                 } else{
                     System.out.println("emekli olamazsın...");
                     System.out.println(65-yas + "sene daha çalışmalısın..");

                     // nested if else

            if(yas>=0) {
                if(yas>65) {
                    System.out.println("Emekli olabilirsin...");
                }else{
                    System.out.println("Emekli olamazsın...");
                    System.out.println(65-yas +"sene daha çalışmalısın");

                }

            }else{
                System.out.println("sıfırdan büyük bir sayı giriniz...");
            }

                 }

    }

         }



