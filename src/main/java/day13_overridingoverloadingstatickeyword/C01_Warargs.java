package day13_overridingoverloadingstatickeyword;

public class C01_Warargs {
    public static void main(String[] args) {
        //Verilen sayılardan ilki hariç tüm sayıları toplayıııp ilk sayıyla çarpan bir method olusturunuz..
        int sayı1=5;
        int sayı2=7;
        int sayı3=2;
        int sayı4=4;
        int sayı5=9;
        
       toplam(sayı1,sayı2,sayı3,sayı4,sayı5);
        
        
        
    }

    private static void toplam(int sayı1,int...toplanacakSayi ) {
        int top=0;
        for (int w:toplanacakSayi){ // ilki hariç tuttuk
           top+=w;

        }
        System.out.println("toplam" + top);
        System.out.println("toplam ile iilk sayının carpımı: "+(top*sayı1));
    }
}
