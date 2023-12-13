import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        int[] ilkDizi = new int[1];
        int sayac = 0;
        System.out.println("Sayıları girin (0 ---> Çıkış):");
        while (true) {
            int girilen = k.nextInt();
            if (girilen == 0) {
                System.out.println("Çıkış yapılıyor...");
                break;
            }
            if (sayac == ilkDizi.length) {
                int[] yeniDizi = new int[ilkDizi.length + 1];
                System.arraycopy(ilkDizi, 0, yeniDizi, 0, ilkDizi.length);
                ilkDizi = yeniDizi;
            }
            ilkDizi[sayac] = girilen;
            sayac++;
        }
        System.out.println("Eleman Sayısı "+sayac+ " Olan Dizinin elemanları:");
        for (int elemanlar : ilkDizi) {
            System.out.print(elemanlar + " ");
        }

    }
}
