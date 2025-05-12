package Odev2;

import java.util.Random;
import java.util.Scanner;

public class ArrayApp {
    public static void array1D_print(int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.println((i+1) + " inci eleman: "+ array[i]);
        }
    }

    public static void array1D_assign(int[] array) {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<array.length; i++){
            System.out.print((i+1) + " inci eleman: ");
            array[i] = input.nextInt();
        }
    }

    public static int[] array1D_assign() {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz: ");
        int length = input.nextInt();
        int[] array = new int[length];

        for(int i = 0; i<array.length; i++){
            System.out.print((i+1) + " inci eleman: ");
            array[i] = input.nextInt();
        }

        return array;
    }

    public static void array1D_random(int[] array) {
        Random r = new Random();
        for(int i = 0; i<array.length; i++){
            array[i] = r.nextInt(51); // 0-50 arasi rasgele uretilen sayiyi atariz
        }
    }

    public static int diziEnKucuk(int[] dizi){
        int enKucuk = dizi[0];
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] < enKucuk) {
                enKucuk = dizi[i];
            }
        }
        return enKucuk;
    }
    public static int diziEnBuyuk(int[] dizi){
        int enBuyuk = dizi[0];
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }
        }
        return enBuyuk;
    }
    public static double diziOrtalama(int[] dizi){
        double toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }

        return toplam/dizi.length;
    }
}
