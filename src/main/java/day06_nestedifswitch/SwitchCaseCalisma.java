package day06_nestedifswitch;

import java.util.Scanner;

public class SwitchCaseCalisma {
    public static void main(String[] args) {
        /*

  Soru 3: Kullanicidan toplamak uzere pozitif sayilar isteyin.
  Islemi bitirmek icin 0'a basmasini soyleyin.
  Kullanici 0'a bastiginda toplam kac popzitif sayi girdigini ve
  girdigi pozitif sayilarin toplamini kac oldugunu yazdirin.

 */
        Scanner input = new Scanner(System.in);
       /* System.out.println("Lütfen Aygul'ün yapacağı içecekleri yazınız");
        String tatlı = input.next();
        switch (tatlı) {
            case "kahve":
                System.out.println("Yanında kek de olsun..");
                break;
            case "Cay":
                System.out.println("Kara cay tercihimizdir,Yanında ahududulu ekmek olsun.");
                break;
            case "salep":
                System.out.println("Salep candır.Gerisi heyecandır..");
                break;
            default:
                System.out.println("HATALI SEÇİM YAPTINIZ.lÜTFEN SALEP YAPINIZ..");
        }*/
        //Ex: Girilen Pozitif 3 basamaklı bir sayıyı yazı ile yazdırınız
        //Ex : 568
        //Besyuzaltmissekiz
        System.out.print("Lütfen 3 basamaklı bir sayı giriniz...");
        int sayı = input.nextInt();
        int birlerbas = (sayı % 10);
        int onlarbas = (sayı / 10) % 10;
        int yüzlerbas = (sayı / 100);
        if (sayı > 99 && sayı < 1000) {

            switch (yüzlerbas) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("yüz");
                    break;
                case 2:
                    System.out.println("ikiyüz");
                    break;
                case 3:
                    System.out.println("üçyüz");
                    break;
                case 4:
                    System.out.println("dörtyüz");
                    break;
                case 5:
                    System.out.println("besyuz");
                    break;
                case 6:
                    System.out.println("altıyuz");
                    break;
                case 7:
                    System.out.println("yediyuz");
                    break;
                case 8:
                    System.out.println("yediyuz");
                    break;
                case 9:
                    System.out.println("sekizyuz");
                    break;
            }
                switch (onlarbas) {
                    case 0:
                        System.out.println("");
                        break;
                    case 1:
                        System.out.println("on");
                        break;
                    case 2:
                        System.out.println("yirmi");
                        break;
                    case 3:
                        System.out.println("otuz");
                        break;
                    case 4:
                        System.out.println("kırk");
                        break;
                    case 5:
                        System.out.println("elli");
                        break;
                    case 6:
                        System.out.println("altmıs");
                        break;
                    case 7:
                        System.out.println("yetmiş");
                        break;
                    case 8:
                        System.out.println("seksen");
                        break;
                    case 9:
                        System.out.println("doksan");
                        break;
                }
                    switch (birlerbas) {

                        case 0:
                            System.out.println("");
                            break;
                        case 1:
                            System.out.println("bir");
                            break;
                        case 2:
                            System.out.println("iki");
                            break;
                        case 3:
                            System.out.println("uc");
                            break;
                        case 4:
                            System.out.println("dort");
                            break;
                        case 5:
                            System.out.println("bes");
                            break;
                        case 6:
                            System.out.println("altı");
                            break;
                        case 7:
                            System.out.println("yedi");
                            break;
                        case 8:
                            System.out.println("sekiz");
                            break;
                        case 9:
                            System.out.println("dokuz");
                            break;


                    }

                }else {
            System.out.println("Düzgün sayı gir la");
        }


            }
        }
