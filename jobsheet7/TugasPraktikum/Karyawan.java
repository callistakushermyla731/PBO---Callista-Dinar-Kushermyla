package TugasPraktikum;

public class Karyawan {
    public String nama;
    public String tempatKerja;
    public int gaji;

    // Constructor tanpa parameter
    public Karyawan() {
        nama = "-";
        tempatKerja = "-";
        gaji = 0;
    }

    // Constructor berparameter
    public Karyawan(String nama, String tempatKerja, int gaji) {
        this.nama = nama;
        this.tempatKerja = tempatKerja;
        this.gaji = gaji;
    }

    // Method untuk menghitung gaji
    public int hitungGaji() {
        return gaji;
    }

    // Method untuk menampilkan informasi karyawan
    public String getInfo() {
        return "Nama: " + nama
            + "\nTempat Kerja: " + tempatKerja
            + "\nGaji: Rp" + hitungGaji();
    }
}
