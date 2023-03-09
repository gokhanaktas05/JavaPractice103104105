package day02_variables;

import java.util.Scanner;

public class C04_Calisma {
    public static void main(String[] args) {
    /*    Scanner input = new Scanner(System.in);
        System.out.println("Gün numarsını giriniz...");
        byte gun = input.nextByte();

        if (gun == 1) {
            System.out.println("Pzartesi");
        } else if (gun == 2) {
            System.out.println("Sali");
        } else if (gun == 3) {
            System.out.println("Carsamba");
        } else if (gun == 4) {
            System.out.println("Persembe");
        } else if (gun == 5) {
            System.out.println("Cuma");
        } else if (gun == 6) {
            System.out.println("Cumartesi");
        } else if (gun == 7) {
            System.out.println("Cuma");
        } else {
            System.out.println("Geçerli bir gün no giriniz.Geçerli gün no ları 1,2,3,4,5,6,7");*/
        Scanner input = new Scanner(System.in);
        System.out.println("Gün ismi giriniz...");
        String gunIsmi = input.next();
        if (gunIsmi.equalsIgnoreCase("Pazar")) {
            System.out.println("Haftasonu");
        } else if (gunIsmi.equalsIgnoreCase("Pazartesi")) {
            System.out.println("Haftaici");
        } else if (gunIsmi.equalsIgnoreCase("Salı")) {
            System.out.println("Haftasici");
        } else if (gunIsmi.equalsIgnoreCase("Carsamba")) {
            System.out.println("Haftaici");
        } else if (gunIsmi.equalsIgnoreCase("Persembe")) {
            System.out.println("Haftaici");
        } else if (gunIsmi.equalsIgnoreCase("Cuma")) {
            System.out.println("Haftaici");
        } else if (gunIsmi.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Haftaici");
        } else {
            System.out.println("Gecerli bir gün ismi giriniz...");
        }
        if (gunIsmi.equalsIgnoreCase("Pazar") || gunIsmi.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu...");
        }
        }
    }