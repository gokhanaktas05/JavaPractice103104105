package day03_ifstatements;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        /*  Problem Tanımı
       Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
       hesaplayan kodu yazınız.
       Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
       Buna göre 2 işçi aynı işi kaç günde yapar?
       Örnek Ekran Çıktısı
        Bir işçi işi kaç günde bitirmektedir? 10
        Toplam kaç işçi çalışacak? 2
       İşin bitme süresi 5 gündür.
   */
        Scanner input = new Scanner(System.in);
       /* System.out.println("Bir iscinin isi bitirme suresi :");
        double sure = input.nextDouble();
        System.out.println("Kac kisi calisacak:");
        int kisi = input.nextInt();
        double birliktebitmesuresi = sure/kisi;
        System.out.println("birliktebitmesuresi :" +sure/kisi);*/


        System.out.println("Babanın Hamza'yı gezdirme süresi:");
        double sabahGezme = input.nextDouble();
        System.out.println("Annenin Hamza'yı gezdirme süresi:");
        double aksamGezme = input.nextDouble();
        double toplamGezme = sabahGezme+aksamGezme;
        System.out.println("Toplam Hamza kaç saat gezer ==>" + toplamGezme);







    }


}
