package day06_nestedifswitch;

import java.util.Scanner;

public class SonGun01 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        /*System.out.println("Lütfen isim ve soyisminizi giriniz.\n İsminizi giriniz..");
       String isim=input.nextLine();
        System.out.println("Lütfen soyisminizi giriniz.");
        String soyIsim=input.nextLine();
        String tamIsim=isim.concat(" "+soyIsim).toUpperCase();
        System.out.println(tamIsim);*/


        /** substring()
         //substring() in iki kullanimi vardir.
         //1)substring(baslangic indexi, bitis indexi) String'in ortasindan bir parca almaya yarar
         //2)substring(baslangic indexi) String'in verilen index'ten sonuna kadar almaya yarar. Sonuc ise String dir.
         */

//10.index dahil sonuna kadar verilen Stringi yazdiriniz
        String cumle = "Her dert Java gibi olsa";
        System.out.println(cumle.substring(5));

//son 10 harfi yazdirin >>>>gibi olsa:
        System.out.println(cumle.substring(cumle.length()-9));

// ilk 10 karakteri alma
        System.out.println(cumle.substring(0,10));

// 11.ci karakterden sonuna kadar olan Stringi yazdiralim
        System.out.println(cumle.substring(10));

    }
}
