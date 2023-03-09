package day06_nestedifswitch;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*DERS PROGRAMI

        Hangi gun hangi dersin oldugunu gosteren bir program yaziniz

        Pazartesi ve Sali ise: Java

        Persembe ve Cuma ise: Selenyum

        Carsamba ve Cumartesi ise: SQL

        aksi halde: izin gunu=Day Off*/
        System.out.println("Lütfen gün seçiniz:"+"Pazartesi\t Salı \t Persembe\t Cuma\t Carsamba\t Cumartesi\t");
        String program=input.next();
        switch (program){
            case "Pazartesi":
            case "Salı":
                System.out.println("JAVA");
                break;
            case "Persembe" :
            case "Cuma" :
                System.out.println("Selenyum");
                break;
            case "Carsamba":
            case "Cumartesi":
                System.out.println("SQL");
                break;
            default:
                System.out.println("Day off");
        }

    }
}
