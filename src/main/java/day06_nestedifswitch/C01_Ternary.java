package day06_nestedifswitch;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        /*
                    TASK :
                Kullanıcıdan sifirdan buyuk pozitif bir tamsayı girmesini isteyin.
                Girilen pozitif tamsayı 3 basamaklı ise ekrana "3 Basamaklı" yazdırın.
                3 basamaklı degilse çift olup olmadigini kontrol edin.
                Çift ise "3 basamaklı olmayan çift sayı" yazdırın.
                Çift sayı degilse "3 basamaklı olmayan tek sayı yazdırın."
 */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayı giriniz..");
        int sayi=input.nextInt();

        String sonuc=(sayi>0) ?(sayi>99&&sayi<1000)? ("3 basamaklı  0'dan büyük sayı") :
                (sayi%2==0) ? ("3 bas olmayan çif sayı") :("3 bas lı olmayan tek sayı") :
                "Lütfen sıfırdan büyük bir sayı giriniz..";
        System.out.println(sonuc);

        if (sayi>0) {
            if (sayi < 1000 && sayi > 99) {
                System.out.println("3 bas lı sayı");
            } else if (sayi % 2 == 0) {
                System.out.println("3 bas lı olmayan çift sayı");
            } else
                System.out.println("3 bas lı olmayan tek sayı");
        }else
            System.out.println("lütfen sıfırdan büyük sayı giriniz..");
            }
            }

