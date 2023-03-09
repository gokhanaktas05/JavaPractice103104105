package day07_stringmanip;

import java.util.Scanner;

public class C06_StringManipulationsLenght {
    public static void main(String[] args) {
        String cumle = "Bugün hava yağmurlu...";
        System.out.println(cumle.length());
        String str1 = " ";
        System.out.println(str1.length());
        String str2 = "";
        System.out.println(str2.length());
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
        Scanner input = new Scanner(System.in);
       /* System.out.println("iSİM ve soy isminizi ayrı ayrı giriniz...\n isim");
        String isim = input.next();
        System.out.println("Lütfen soy isminiiz giriniz..");
        String soyIsim = input.nextLine();
        if (isim.length() > soyIsim.length()) {
            System.out.println("isim uzundur");
        } else if (isim.length() == soyIsim.length()) ;
        System.out.println("İsminiz ve soyisiminiz aynı uzunlukta");*/


        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin
        // word   drow

        System.out.println("Lütfen 4 harfl bir kelime giriniz.");
        String kelime=input.next();
        char ilk=kelime.charAt(0);
        char ikinci=kelime.charAt(1);
        char ucuncu=kelime.charAt(2);
        char dorduncu=kelime.charAt(3);
        System.out.println("ters hali= "+ dorduncu+ucuncu+ikinci+ilk);

        }
    }




