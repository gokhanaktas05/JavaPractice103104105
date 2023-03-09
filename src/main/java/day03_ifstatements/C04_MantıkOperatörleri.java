package day03_ifstatements;

public class C04_MantıkOperatörleri {

    public static void main(String[] args) {
        System.out.println(5+2==8);//false
        boolean sonuc1=5>4 && 7<9 && 6+3==9 && 5+2!=8;
        System.out.println("sonuc==>"+sonuc1);
        boolean sonuc2=5>4 && 7>9 && 6+3==9 &&5+2!=8;
        System.out.println("sonuc2="+sonuc2);
        // sayı 1 in 10 ie 20 arasında olduğunu true diyerek yazdıralım...
        int sayı1=15;
        System.out.println(10<sayı1 && sayı1<20);
        int sayı2=5;
        //sayı2 n,-in 1 ile 20 arasında olmadığını true diyerek kod
        System.out.println("sayı2 10 ile 20 arsında değildir:" + (sayı2<10 || sayı2<20));
        //true veya da 1 tane tre yetrlidir.





    }
}
