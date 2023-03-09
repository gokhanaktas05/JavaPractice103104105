package day06_nestedifswitch;

public class sonGun02 {
    public static void main(String[] args) {
             /*replace()
  Metin icerisindeki karakter ya da karakterlerin, istenilen karakter ya da metinle degistirilmesini saglar.
  Sonuc String'dir..
      */

       /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
1) \\d    ==> tum rakamlar
    \\D    ==> tum rakam disi character ler
2) \\w   ==> A->Z     a->z         0->9    _tum buyuk, kucuk harf ve rakamlar
    \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
3) \\s   ==> space tum bosluklar
    \\S   ==> space disindaki hersey  */




            //rakam haricindekileri silin
        String cum="Atatürk 19 mayıs 1919'da 05.26 da Samsun'a cıktı..";
        System.out.println(cum.replaceAll("\\D",""));



            // Verilen cumleyi  * ile gizleyin, 10 karakterden sonrasini yazdirin
            String cumle="Her dert Java gibi olsa..";
        System.out.println(cumle.replaceAll("\\w","*").substring(11));



            //a harfini @ isareti ile degistir
            String ders="olaganustu";
        System.out.println(ders.replaceAll("a","@"));



            /** ReplaceFirst
             * Replace ile aynı sadece ilk bulunan karakteri değiştirir
             */
            String txt = "Merhaba Dunya";
        System.out.println(txt.replaceFirst("a","@"));

            //txt'deki butun 'a' lari 'e' ile degistirin

        System.out.println(txt.replaceFirst("a","e"));

            //txt'deki ilk bulunan 'a' yi 'e' ile degistirin



     /* replaceAll()
       Metin icerisindeki bir dizi kumesini degistirme .Sonuc String'dir..

      */
            //bir dizi kumesini degistirme>>>> Kalem yerine biber yazdirin
            String str="Dolma Kalem";
        System.out.println(str.replaceAll(" Kalem"," biber"));






          /*
       contains()
       Metin icerisinde arama yapmamizi saglar.
       bir stringin içerisinde karakter(ler)in var olup olmadığını kontrol eder.
       Sonuc boolean dir.

       equals()
       2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.

       equalsIgnorecase()
       equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
      */

            String a="Merhaba Dunya";
            String b="Merhaba Dunya";
        boolean esitmi=a.equals(b);
        System.out.println(esitmi);
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));

        }
    }

