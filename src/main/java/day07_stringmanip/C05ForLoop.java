package day07_stringmanip;

import java.util.Scanner;

public class C05ForLoop {
    public static void main(String[] args) {
        /*
  Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
  tekrarlayan kodu yaziniz

 * ornek:  input            output
 *         elma  2           eaea
 *         army  3           ayayay

 */

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen kelime giriniz");
        String kelime=input.nextLine();
        System.out.println("harflrin kac kere tekrarlanmasını istiyorsunuz");
        int tekrar=input.nextInt();

       String ilkSon=kelime.substring(0,1)+kelime.substring(kelime.length()-1);
       String cikti="";
       for (int i=1;i<=tekrar;i++){
        cikti+=ilkSon;
       }
        System.out.println(cikti);




        /*

         *
         * *
         *   *
         *     *
         *********


         */


    }
}
