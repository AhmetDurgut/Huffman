package huffman_dizi;

public class imp {

    public void dizi() {
        int min1 = 0;
        int min2 = 0;
        int toplam = 0;
        int n = 0;
        int tmp1 = 0, tmp2;
        int sayilar[] = {13, 45, 9, 16, 5, 12};
        int elemanSayisi = sayilar.length;
        int es = sayilar.length;
        int[] sonHal = new int[elemanSayisi * 3];

        tmp1 = sayilar[0];
        sayilar[0] = sayilar[sayilar.length - 1];
        sayilar[sayilar.length - 1] = tmp1;
        sayilar[sayilar.length - 1] = 0;

        tmp2 = sayilar[1];
        sayilar[1] = toplam;
        toplam = tmp2;

        for (int y = 0; y < sayilar.length; y++) {
            System.out.println(sayilar[y]);
        }
    }
}
