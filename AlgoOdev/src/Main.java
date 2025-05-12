import Odev1.Odev1;

public class Main {
    public static void main(String[] args) {
        odev1Test();
    }

    public static void odev1Test() {
        Odev1.ikiSayınınToplamı(3,5);
        Odev1.sayiOrtalamasi(5);

        int[] dizi = {1,50,60,4};
        Odev1.diziToplam(dizi);
        System.out.println(Odev1.diziOrtalama(dizi));
        System.out.println(Odev1.diziEnKucuk(dizi));
        System.out.println(Odev1.diziEnBuyuk(dizi));

        int[] cevap = Odev1.ikiVektörToplam(dizi,dizi);
        for (int i = 0; i < cevap.length; i++) {
            System.out.println(cevap[i]);
        }

        int[][] matris = {   {1,2,5,0}
                            ,{3,4,3,1}};
        int[][] cevapDot = Odev1.dotProduct(matris, matris);
        for (int i = 0; i < cevapDot.length; i++) {
            for (int j = 0; j < cevapDot[i].length; j++) {
                System.out.println(cevapDot[i][j]);
            }
        }

        int[] cevap2= Odev1.satirdakiEnKucuk(matris);
        for (int i = 0; i < cevap2.length; i++) {
            System.out.println(cevap2[i]);

        }
        int[] cevap3= Odev1.sutundakiEnBuyuk(matris);
        for (int i = 0; i < cevap3.length; i++) {
            System.out.println(cevap3[i]);

        }
    }



}