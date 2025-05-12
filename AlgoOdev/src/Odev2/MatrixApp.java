package Odev2;

public class MatrixApp {

    public static int[][] matrisTopla(int[][] matris1, int[][] matris2) {
        int satirSayisi = matris1.length;
        int sutunSayisi = matris1[0].length;
        int[][] toplam = new int[satirSayisi][sutunSayisi];

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                toplam[i][j] = matris1[i][j] + matris2[i][j];
            }
        }

        return toplam;
    }

    public static int[][] matrisFark(int[][] matris1, int[][] matris2) {
        int satirSayisi = matris1.length;
        int sutunSayisi = matris1[0].length;
        int[][] fark = new int[satirSayisi][sutunSayisi];

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                fark[i][j] = matris1[i][j] - matris2[i][j];
            }
        }

        return fark;
    }

    public static int[][] matrisCarp(int[][] matris1, int[][] matris2) {
        int satirSayisi = matris1.length;
        int sutunSayisi = matris2[0].length;
        int[][] carpim = new int[satirSayisi][sutunSayisi];

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                for (int k = 0; k < matris2.length; k++) {
                    carpim[i][j] += matris1[i][k] * matris2[k][j];
                }
            }
        }

        return carpim;
    }
}
