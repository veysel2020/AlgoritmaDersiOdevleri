package Odev1;

public class Odev1 {
    public static void ikiSayınınToplamı(int a , int b){
        System.out.println(a+b);
    }

    public static double sayiOrtalamasi(int N){
        double toplam = 0;
        for (int i = 1; i <= N; i++) {
            toplam += i;

        }
        return toplam/N;
    }

    public static void diziToplam(int[] dizi){
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }

        System.out.println(toplam);
    }
    public static double diziOrtalama(int[] dizi){
        double toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }

        return toplam/dizi.length;
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
    public static int[] ikiVektörToplam(int[] vector1, int[] vector2){
        int[] toplam = new int[2];
        for (int i = 0; i < 2; i++){
            toplam[i] = vector1[i] + vector2[i];
        }
        return toplam;


    }

    public static int[][] dotProduct(int[][] matris1, int[][] matris2) {
        int satır1 = matris1.length;
        int sütun1 = matris1[0].length;
        int sütun2 = matris2[0].length;

        int[][] sonuc = new int[satır1][sütun2];

        for (int i = 0; i < satır1; i++) {
            for (int j = 0; j < sütun2; j++) {
                sonuc[i][j] = 0;
                for (int k = 0; k < sütun1; k++) {
                    sonuc[i][j] += matris1[i][k] * matris2[k][j];
                }
            }
        }
        return sonuc;
    }

    public static int[] satirdakiEnKucuk(int[][] matris) {
        int satir = matris.length;
        int[] satirdakiKucuk = new int[satir];

        for (int i = 0; i < satir; i++) {
            int min = matris[i][0];
            for (int j = 1; j < matris[i].length; j++) {
                if (matris[i][j] < min) {
                    min = matris[i][j];
                }
            }
            satirdakiKucuk[i] = min;
        }

        return satirdakiKucuk;
    }

    public static int[] sutundakiEnBuyuk(int[][] matrix) {
        int satır = matrix.length;
        int sutun = matrix[0].length;
        int[] sutundakiBuyuk = new int[sutun];

        for (int j = 0; j < sutun; j++) {
            int max = matrix[0][j];
            for (int i = 1; i < satır; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            sutundakiBuyuk[j] = max;
        }

        return sutundakiBuyuk;
    }




}
