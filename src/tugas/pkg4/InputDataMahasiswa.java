
import java.util.ArrayList;

public class InputDataMahasiswa {

    ArrayList<mhs> listmahasiswa;

    public InputDataMahasiswa() {
        listmahasiswa = new ArrayList();
    }

    public void insertData(String nama, String alamat, String telepon, String email) {
        mhs mhsw = new mhs(nama, alamat, telepon, email);
        listmahasiswa.add(mhsw);
    }

    public ArrayList<mhs> getALL() {
        return listmahasiswa;
    }

    public void deleteData(int index) {
        listmahasiswa.remove(index);
    }
}
