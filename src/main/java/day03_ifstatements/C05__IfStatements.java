package day03_ifstatements;

import java.util.Scanner;

public class C05__IfStatements {
    public static void main(String[] args) {

        // kullanıcıdan iki sayıyı alın büyük sayıyı yazdırın..
        Scanner input = new Scanner(System.in);
      /*  System.out.println("lütfen birinci sayıyı giriniz...");
        int sayı1 = input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz.");
        int sayı2 = input.nextInt();
        if (sayı1 > sayı2) {
            System.out.println("*Buyuk olan sayı" +sayı1);
        } else if (sayı2 > sayı1) {
            System.out.println("*buyuk olan sayı"+sayı2);
        } else if (sayı1 == sayı2) {
            System.out.println("*Sayılar eşit..");
            //2.yol
            System.out.println(sayı1 == sayı2 ? "Sayılar eşit" : sayı1 > sayı2 ? sayı1 : sayı2);
        }*/
        System.out.println("Lütfen iki sayı giriniz...");
        double sayi1 =input.nextDouble();
        System.out.println("Lütfen ikinci sayıyı giriniz");
        double sayi2=input.nextDouble();
        if(sayi1>0 && sayi2>0) {
            System.out.println("sayıların toplamı" + (sayi1 + sayi2));
        }else if(sayi1<0 && sayi2<0) {
            System.out.println("sayıların çarpımı" + (sayi1 * sayi2));
        }else if(sayi1*sayi2<0) {
            System.out.println("Farklı işaretlerle işlem yapamazsın... ");
        }else if(sayi1==0||sayi2==0) {
            System.out.println("Sıfır çarpmaya göre yutan elemandır...");
        }else{
            System.out.println("Geçerli bir işlem seçiniz..");
        }


    }
}

