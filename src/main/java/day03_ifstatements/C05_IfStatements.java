package day03_ifstatements;

import java.util.Scanner;

public class C05_IfStatements {
    public static void main(String[] args) {

        //Kullanıcıdan alacağınız 2 sayıyı yine kullanıcıya seçtireceğiniz
        // dört işlemden biri ile işleme koyup yazdıırnız.

        Scanner input=new Scanner(System.in);

       /* System.out.println("Lütfen iki sayı giriniz...");
        double sayı1=input.nextDouble();
        System.out.println("Lütfen ikinci sayıyı giriniz...");
        double sayı2=input.nextDouble();
        System.out.println("Toplama işlemi için 1 \n çıkarma işlemi için 2\n bölme işlemi için 3\n çarpma işlemi için 4\n");

        double islem=input.nextDouble();
        if(islem==1) {
            System.out.println("Toplama işleminin sonucu" +(sayı1 + sayı2));
        }else if(islem==2) {
            System.out.println("Çıkarma işleminin sonucu" +(sayı1 - sayı2));
        }  else if(islem==3) {
            System.out.println("Bölme işleminin sonucu" +(sayı1 / sayı2));
        }else if(islem==4) {
                        System.out.println("Çarpma işleminin sonucu" +(sayı1 * sayı2));
                    }else{
                        System.out.println("Gecerli bir işlem seçiniz");
                    }*/

        //System.out.println("Lütfen yaşınızı giriniz...");
        int yas=input.nextInt();
      /*  if(yas>=65 && yas<120) {
            System.out.println("Emekli olabilirsin...");
        }else if(yas<65) {
            System.out.println("emekli olamazsın " + (65 - yas)  +" yıl daha çalışmalısın");
        }else{
            System.out.println("Lütfen gecerli bir yaş giriniz");*/

            System.out.println(yas>=65&&yas<120? "Emekli olabilirsin" : yas<65? "emekli olamazsın": 65-yas +" daha çalışmalısın");

        }

    }


