
import java.util.Scanner;

public class MainMahasiswa {

    static Scanner sc = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);
    static int pilih;
    static InputDataMahasiswa input = new InputDataMahasiswa();

    public static void main(String[] args) {
        menuutama();
    }

    static void menuutama() {
        System.out.println("1 .Menambah Data");
        System.out.println("2. Menghapus Data");
        System.out.println("3. Melihat Data");
        System.out.println("4. keluar");
        System.out.print("pilih : ");
        pilih = sc.nextInt();
        switch (pilih) {
            case 1:
                System.out.print("Masukan banyaknya mahasiswa : ");
                int masuk = sc.nextInt();
                for (int i = 0; i < masuk; i++) {
                    System.out.print("Nama " + (i + 1) + "    : ");
                    String namay = sc2.nextLine();
                    System.out.print("Alamat " + (i + 1) + "  : ");
                    String alamay = sc2.nextLine();
                    System.out.print("Telepon " + (i + 1) + " : ");
                    String telepoy = sc2.nextLine();
                    System.out.print("Email " + (i + 1) + "   : ");
                    String emaiy = sc2.nextLine();
                    input.insertData(namay, alamay, telepoy, emaiy);
                    System.out.println("-----------------------");
                }
                menuutama();
                break;
            case 2:
                System.out.print("mahasiswa keberapa yang ingin dihapus ?");
                pilih = sc.nextInt();
                input.deleteData(pilih-1);
                menuutama();
                break;
            case 3:
                System.out.println("Data buku alamat mahasiswa :");
                System.out.println("-----------------------------");
                for (mhs mhsw : input.getALL()) {
                    System.out.println("Nama    : " + mhsw.getNama());
                    System.out.println("Alamat  : " + mhsw.getAlamat());
                    System.out.println("Telepon : " + mhsw.getTelepon());
                    System.out.println("Email   : " + mhsw.getEmail());
                    System.out.println("-----------------------------");
                }
                menuutama();
                break;
            case 4:
                System.out.println("program terhenti");
                break;
            default:
                System.out.println("program tidak ditemukan");
                menuutama();
                break;
        }

    }
}
