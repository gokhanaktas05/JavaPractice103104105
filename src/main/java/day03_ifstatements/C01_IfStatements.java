package day03_ifstatements;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Y/N harflerinden birini giriniz...");
       char karakter=input.next().charAt(0);
        if (karakter == 'Y' || karakter == 'y') {
        System.out.println("YES");
        }else if(karakter=='N'||karakter=='n' ) {
            System.out.println("NO");
        }else{
            System.out.println("error");

        }
        }
}
