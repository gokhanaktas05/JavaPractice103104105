package day03_ifstatements;

public class C02_AsciiDeğerleri {

    public static void main(String[] args) {

        char harf= 'a';
        char harf2='A';
        System.out.println("harf>harf2 ==>"+(harf>harf2));
        //Herhangi  bir char variable in ASCII değerlerini kod yazarak bulunuz..
        char space=' ';
        System.out.println("Space' in ASCII değeeri : "+(space+0));//0 ın ascıı değeri olmadığı için 0 ile topladık.
        char m= 'm';
        System.out.println("m NİN ASCII değeri"+ (m+0));

        //2.yol
        int harf3 = 'm'; // char karakterinin ascıı değerinin karşılığı int olarak atandı.
        System.out.println("m harfinin ASCII değeri=" + harf3);

        byte b1 =12;
        byte b2 =-125;
        //kıyaslayan bir kod yazınız...
        System.out.println("b1>b2==>"+(b1>b2));
        float f1=2.45645f;
        float f2=5.86786F;
        System.out.println("f1>f2==>"+(f1>f2));
        System.out.println("b1>f1==>"+(b1>f1));

        long lng1= 545646461654L;
        System.out.println("b1<lng1==>"+(b1<lng1));

        char ch= 'h';
        System.out.println("b1>ch==>"+ (b1>ch));
    }
}
