package day03_ifstatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {

/*Scanner input=new Scanner(System.in);
       System.out.println("Lütfen bir not giriniz");
       int not1= input.nextInt();

        if (not1 <= 100 && not1 > 90) {
            System.out.println("cok iyi");
        }else if(not1<=90&&not1>=80) {
            System.out.println("iyi");
        } else if (not1<=69&&not1>=79) {
            System.out.println("orta");
        } else if (not1>=45&&not1<=68) {
            System.out.println("idare eder");
        } else if (not1>=0&&not1<=44) {
            System.out.println("zayıf");
        }else{
            System.out.println("Gecerli bir not giriniz..");

        }*/
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir gün giriniz...");
        String gun=input.nextLine();
        if(gun.equalsIgnoreCase("cuma")) {
            System.out.println("Müslümanlar icin kutsal gun");
        }else if(gun.equalsIgnoreCase("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        } else if (gun.equalsIgnoreCase("pazar")) {
            System.out.println("Hristiyanlar icin kutsal gun");
        }else{
            System.out.println("Lütfen gecerli bir gun giriniz..");

        }

    }
        }


