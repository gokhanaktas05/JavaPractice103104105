package day06_nestedifswitch;

import java.util.Scanner;

public class C02Ternary {
    public static void main(String[] args) {

                /*
                Kullanicidan Final notunu 'A' ,'B' ,'C' seklinde  girmesini isteyiniz,
                'A'  ->  "Cok Basarili"
                'B'  ->  "Basarili"
                'C'  ->  "Orta"    bu notlar disindakilere de
                         Digerleri..
                            yazdiriniz.Nested Ternary ile cozunuz
 */
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz...");
        String not=input.next();
        String result=(not.equalsIgnoreCase("A")) ?"ÇOK BAŞARILI" :
                (not.equalsIgnoreCase("B")) ? "BAŞARILI":
                        (not.equalsIgnoreCase("C"))? "ORTA": "DİĞERLERİ";
        System.out.println(result);

    }
}
