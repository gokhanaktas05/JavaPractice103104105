package practiceadvanced.practice07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2_UzunKelime {
    public static void main(String[] args) {
        /*
          Kullanıcıdan alınan cümledeki en uzun kelimeyi(kelimeleri) return eden bir method oluşturunuz.
         */
        System.out.println(enUzunKelime());
    }

    public static List<String> enUzunKelime(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle = scan.nextLine();
        String arr[] = cumle.split(" ");

        List<String> list = new ArrayList<>();
        int max = 0;
        for (String w : arr) {
            max = Math.max(w.length(), max);
        }
        for (String w : arr) {
            if (w.length() == max) {
                list.add(w);
            }
        }
        return list;
    }
    }



