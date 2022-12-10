package huffman_dizi;

public class Huffman_dizi {

    public static void main(String[] args) {
        int min1 = 0;
        int min2 = 0;
        int toplam = 0;
        int n = 0;
        int tmp1 = 0,tmp2;
        int sayilar []  = {13,45,9,16,5,12}; 
        int elemanSayisi = sayilar.length;
        int es = sayilar.length;
        int [] sonHal = new int[elemanSayisi*3];
        
        sıralama sıra=new sıralama();
        imp ekle=new imp();
        
        sıra.sort();
        ekle.dizi();
        
 /*       
        for (int i = 0; i < elemanSayisi; i++) {
            int minIndex = i;
            for (int j = i + 1; j < es; j++) {
                if (sayilar[j] < sayilar[minIndex]) {
                    minIndex = j;
                    es--;
                }
            }
        int temp = sayilar[i];
        sayilar[i] = sayilar[minIndex];
        sayilar[minIndex] = temp;
        
        min1 = sayilar[0];
        min2 = sayilar[1];
        toplam = min1 + min2;
        
        sonHal[n] = min1;
        sonHal[n+1] = min2;
        sonHal[n+2] = toplam;  
         
    }  
   */  
        
 /*tmp1 = sayilar[0];
        sayilar[0] = sayilar[sayilar.length - 1];
        sayilar[sayilar.length - 1] = tmp1;
        sayilar[sayilar.length - 1] = 0;
        
        tmp2 = sayilar[1];
        sayilar[1] = toplam;
        toplam = sayilar[1];
        
        for(int y = 0; y < sayilar.length; y++){
            System.out.println(sayilar[y]);
        }
        
   */     
        /*
        for(int y = 0; y < sonHal.length; y++){
            System.out.println(sonHal[y]);
        }
        */

        
        
        
        
        
    }

}
    

