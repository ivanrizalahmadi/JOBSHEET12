import java.util.Scanner;

public class UcapanTerimaKasih_13 {

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih_13() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n"
                + "You inspired me a love for learning and made me feel like I could ask you anything.");
    }

    // Fungsi UcapanTambahan dengan parameter
    public static void UcapanTambahan(String ucapanTambahan) {
        System.out.println(ucapanTambahan);
    }

    public static void main(String[] args) {
        UcapanTerimaKasih_13();

        // Memanggil fungsi UcapanTambahan dengan parameter
        UcapanTambahan("Semoga harimu menyenangkan!");
    }
}
