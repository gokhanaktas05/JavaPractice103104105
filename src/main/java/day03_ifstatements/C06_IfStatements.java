package day03_ifstatements;

import java.util.Scanner;

public class C06_IfStatements {
    public static void main(String[] args) {
        //Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
// Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin.
// Son rakamı 0 ise ekrana "5’e bölünen çift sayı" yazdırın.
// Son rakamı 0 değil ise "5’e bölünen tek sayı" yazdırın.
// Girdiği password 5’e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın.

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen 4 bassamaklı bir sayı giriniz...");

        int sayi= input.nextInt();
        if(sayi<1000 || sayi>9999){ // istenmeyen durum inceelendi
            System.out.println("Lütfen 4 basamklı bir sayı giriniz");
        } else if (sayi%5==0) {
            if(sayi%10==0) { //  son rakamı 0 olması için 10 aböleriz.
                System.out.println("5 e bölünebilen çift sayı");
            }else{
                System.out.println("5 e bölünebilen tek sayı");
            }

        }else{ // 4 bsamaklı ama 5 e bölünemiyor..
            System.out.println("Tekrar deneeyin...");

        }


    }
}
