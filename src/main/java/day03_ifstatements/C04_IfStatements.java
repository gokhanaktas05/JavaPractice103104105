package day03_ifstatements;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {
//Kullanici 0'dan kucuk 120'den buyuk deger giremiyecek sekilde degerleri aldiktan sonra ;
// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
// calisan erkekse 65 yasindan buyukse emekli olabilir seklinde yazdiran bir kod yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz.");
        System.out.println("erkek için e \nkadın için k");
        char cinsiyet = input.next().toUpperCase().charAt(0);

        System.out.println("lütfen yaşınızı giriniz");
        int yas = input.nextInt();
        if (cinsiyet == 'k') {
            if (yas >= 60 || yas <= 120) {
                System.out.println("Emekli olabilirsiniz...");
            } else {
                System.out.println("Emekli olamazsınız...");

                }
            }
        }

    }






