package day11_multidimensionalarray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_MultiArrays {
    public static void main(String[] args) {
                     /*
             INTERWIEW
            Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
            0-1-1-2-3-5-8-13-21-34....
            */
        List<Integer>fibonachi=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz..");
        int sayi=input.nextInt();

        fibonachi.add(0);
        fibonachi.add(1);
        int i=1;
        if (sayi<=1){
            System.out.println("Lütfen 1 den büyük sayı giriniz..");

        }else {

        }while (fibonachi.get(i)<sayi){
            fibonachi.add(fibonachi.get(i)+ fibonachi.get(i-1));
            i++;// bir basamaak ilerlesin
        }
    }
}
