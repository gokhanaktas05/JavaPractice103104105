package day02_variables;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
      /*Scanner input = new Scanner(System.in);
       System.out.println("Lütfen isminizi giriniz...");
      String kullanıcıIsmi = input.next(); */
        //Soru 1 ) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplatan bir program yazdirin
//( CEMBERIN CEVRESI = 2*3.14*r  DAIRENIN ALANI = 3.14*r*r  )

      /*  Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen çemberin yarıçapını giriniz...");
        double r = scan.nextDouble();

        System.out.println("Çemberin çevresi = "+2*3.14*r/100);
        System.out.println("Çemberin alanı = "+314*r*r/100);*/

        //Soru 2 )  Kullanicidan bir dikdortgenin uzun ve kisa kenarlarini isteyip o dikdortgenin alan ve
// cevre hesabini yapan bir program yaziniz.




        //Soru 3) Kenar uzunluklari kullanicidan alinana bir ucgenin cevresini hesaplayan bir program yaziniz.(byte kullanin)
// Ucgenin cevresi=a+b+c
      /*  Scanner scan3 = new Scanner(System.in);
        System.out.println("Ucgenin 3 kenar uzunluğunu giriniz...");
        byte a = scan3.nextByte();
        byte b= scan3.nextByte();
        byte c= scan3.nextByte();
        int cevre = a+b+c;
        System.out.println("Ucgenin cevresi"+ cevre);*/

        // Soru4)   /*Kullanicidan aldiginiz sekille asagidaki gibi bir gorunum olusturan bir kod yaziniz

/*
             A
            A A
           A A A
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz...");
        char sembol = input.next().charAt(0);
        System.out.println("  "+sembol+"  ");
        System.out.println(" "+sembol+" "+sembol);
        System.out.println(sembol+" "+sembol+" "+sembol);

    }







}
