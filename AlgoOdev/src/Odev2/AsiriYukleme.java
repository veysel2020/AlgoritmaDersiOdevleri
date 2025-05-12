package Odev2;

public class AsiriYukleme {
    public static void yazdir(int x){
        System.out.println("Integer Yazdir: " + x);

    }

    public static void yazdir(String x){
        System.out.println("String Yazdir: " + x);
    }
    public static void yazdir(int[] dizi){
        System.out.print("Dizi Yazdir: ");

        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
        System.out.println();
    }

}
