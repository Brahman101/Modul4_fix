package modul4;
import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama, kelas, matkulPraktikum;
    int nim;

    public Mahasiswa(String nm, String kl, String mat, int ni) {
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("Brodi", "3E", "Seni", 2020022));
        mhs.put("2", new Mahasiswa("Kaja", "3B", "Fisika", 2020211));
        mhs.put("3", new Mahasiswa("Argus", "3D", "Agama", 2020017));

        System.out.println("Masukkan ID : ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null) {
            System.out.println("Data Mahasiswa : " + data.nama + ", Kelas : " +
                    data.kelas + ", mata kuliah praktikum : " + data.matkulPraktikum +
                    ". nim : " + data.nim
            );
}

}
}
