package day12_warargsoverloadingoverriding;

public class C04_Warargs {
    public static void main(String[] args) {
        a1(true,false,true,true);
        a2(1,2,3,4);
    }//main

    private static void a2(int i,int i1,int... i2) {
        System.out.println(i2.length);
    }

    private static int a1(boolean b,boolean...  b3) {
    return b3.length;// int oldugu için return yaptık
    }
}
