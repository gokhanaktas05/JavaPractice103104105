package day06_nestedifswitch;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
        // Kullanıcının yasadıgı güne  göre;
        // Kullanicinin verecegi gun kadar sonraki günun  hangi gün olduğunu yazdırınız.
        // pazartesi hafta başlangıcı
        //BulunanGun = (kacGunSonrasi + kacıncıGun) % 7;
        Scanner input = new Scanner(System.in);
        System.out.println("Pazartesi 1 \t: Salı 2 \t: Carsamba 3 \t: Persembe 4 \t: Cuma 5 \t: cumartesi 6 \t: Pazar 7 \t: " +
                "Gun secimi yapınız ");
        int kacinciGun = input.nextInt();
        if (kacinciGun > 7 || kacinciGun <= 0) {
            System.out.println("Hatalı gun girdiniz..");

        } else {
            System.out.println("Kac gün sonrasını soruyorsunuz?");
            int kacGunSonra=input.nextInt();
            int bulunanGun=(kacinciGun+kacGunSonra)%7;
            switch (bulunanGun){
                case 1:
                    System.out.println(kacGunSonra + "gun sonra günlerden Pazartesi..");
                    break;
                case 2:
                    System.out.println(kacGunSonra + "gun sonra günlerden Salı..");
                    break;
                case 3:
                    System.out.println(kacGunSonra + "gun sonra günlerden Carsamba..");
                    break;
                case 4:
                    System.out.println(kacGunSonra + "gun sonra günlerden Persembe..");
                    break;
                case 5:
                    System.out.println(kacGunSonra + "gun sonra günlerden Cuma..");
                    break;
                case 6:
                    System.out.println(kacGunSonra + "gun sonra günlerden Cumartesi..");
                    break;
                case 7:
                    System.out.println(kacGunSonra + "gun sonra günlerden Pazar..");
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız..");
            }



        }

    }
}


