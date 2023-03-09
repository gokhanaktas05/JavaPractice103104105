package day07_stringmanip;

public class C08Stringmanipulations {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan email adresini girmesini isteyin,
// mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
// @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
// @gmail.com ile bitmiyorsa "lutfen yazimı kontrol edin" yazdırın
        String email="gokhanaktas.05@hotmail.com";
        String str="gmail";
        if (email.contains(str)){
            System.out.println("Lütfen gmail ekleyiniz.");

        } else if (!email.contains(str)) {
            System.out.println("e mail adresiniz kaydedildi..");
        }else
            System.out.println("Lütfen yazımı kontrol edin");

        }

        }

