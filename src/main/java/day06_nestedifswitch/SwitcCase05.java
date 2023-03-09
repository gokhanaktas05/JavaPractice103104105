package day06_nestedifswitch;

import java.util.Scanner;

public class SwitcCase05 {
    public static void main(String[] args) {
        /*
         * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
         * ornek
         *  Kullanici  : A , B , C harflerinden birini secsin
             A'yi secmis ise, ==> Java kolay
             B'yi secmis ise, ==> Java eglenceli
             C'yi secmis ise, ==> Calismaliyim :)
         */
        Scanner input=new Scanner(System.in);
        System.out.println("A \nB \nC \n" + "Harflerden birini seçiniz..");
        char harf=input.next().charAt(0);
        switch (harf){
            case 'A':
                System.out.println("Java kolaydır.");
                break;
            case 'B':
                System.out.println("Java eğlenceli");
                break;
            case  'C':
                System.out.println("Çalışmalıyım");
                break;
            default:
                System.out.println("Hatalı seçim yaptınız..");
        }
    }
}
