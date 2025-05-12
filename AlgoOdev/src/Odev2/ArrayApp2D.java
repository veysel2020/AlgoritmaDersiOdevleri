package Odev2;

public class ArrayApp2D {

    public static void matrisiYazdir(int[][] matris) {
        for (int[] satir : matris) {
            for (int eleman : satir) {
                System.out.print(eleman + "\t");
            }
            System.out.println();
        }
    }

    public static int[] satirMinDon(int[][] matris) {
        int[] minler = new int[matris.length];
        for (int i = 0; i < matris.length; i++) {
            int min = matris[i][0];
            for (int j = 1; j < matris[i].length; j++) {
                if (matris[i][j] < min) {
                    min = matris[i][j];
                }
            }
            minler[i] = min;
        }
        return minler;
    }

    public static int[] satirMaxDon(int[][] matris) {
        int[] maxlar = new int[matris.length];
        for (int i = 0; i < matris.length; i++) {
            int max = matris[i][0];
            for (int j = 1; j < matris[i].length; j++) {
                if (matris[i][j] > max) {
                    max = matris[i][j];
                }
            }
            maxlar[i] = max;
        }
        return maxlar;
    }

    public static int[] sutunMinDon(int[][] matris) {
        int sutunSayisi = matris[0].length;
        int[] minler = new int[sutunSayisi];
        for (int j = 0; j < sutunSayisi; j++) {
            int min = matris[0][j];
            for (int i = 1; i < matris.length; i++) {
                if (matris[i][j] < min) {
                    min = matris[i][j];
                }
            }
            minler[j] = min;
        }
        return minler;
    }

    public static int[] sutunMaxDon(int[][] matris) {
        int sutunSayisi = matris[0].length;
        int[] maxlar = new int[sutunSayisi];
        for (int j = 0; j < sutunSayisi; j++) {
            int max = matris[0][j];
            for (int i = 1; i < matris.length; i++) {
                if (matris[i][j] > max) {
                    max = matris[i][j];
                }
            }
            maxlar[j] = max;
        }
        return maxlar;
    }

    public static double[] satirOrtalamalari(int[][] matris) {
        double[] ortalamalar = new double[matris.length];
        for (int i = 0; i < matris.length; i++) {
            int toplam = 0;
            for (int j = 0; j < matris[i].length; j++) {
                toplam += matris[i][j];
            }
            ortalamalar[i] = (double) toplam / matris[i].length;
        }
        return ortalamalar;
    }

    public static double[] sutunOrtalamalari(int[][] matris) {
        int sutunSayisi = matris[0].length;
        double[] ortalamalar = new double[sutunSayisi];
        for (int j = 0; j < sutunSayisi; j++) {
            int toplam = 0;
            for (int i = 0; i < matris.length; i++) {
                toplam += matris[i][j];
            }
            ortalamalar[j] = (double) toplam / matris.length;
        }
        return ortalamalar;
    }
}
