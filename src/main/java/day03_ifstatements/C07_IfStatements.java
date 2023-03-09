package day03_ifstatements;

import java.util.Scanner;

public class C07_IfStatements {
    public static void main(String[] args) {

        //Kullanicidan dikdortgenin kenar uzunluklarini isteyin
//ve dikdortgenin kare olup  olmadigini yazdirin

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen 1. kenar uzunluğunu giriniz...");
        int kenar1= input.nextInt();
        System.out.println("Lütfen 2. kenar uzunluğunu giriniz...");
        int kenar2= input.nextInt();
        System.out.println("Lütfen 3. kenar uzunluğunu giriniz...");
        int kenar3 = input.nextInt();
        System.out.println("Lütfen 4. kenar uzunluğunu giriniz...");
        int kenar4 = input.nextInt();
        if(kenar1==kenar2&&kenar2==kenar3&&kenar3==kenar4) {
            System.out.println("karedir..");
        }else{
            System.out.println("kare değildir..");

        }

    }
}
