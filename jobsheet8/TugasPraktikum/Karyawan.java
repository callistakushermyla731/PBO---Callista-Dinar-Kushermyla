public abstract class Karyawan {
    public String nama;
    public String tempatKerja;
    public int gaji;
    public int totalGaji;

    
    public Karyawan() {
        nama = "";
        tempatKerja = "";
        gaji = 0;
        totalGaji = 0;
    }


    public Karyawan(String nama, String tempatKerja, int gaji) {
        this.nama = nama;
        this.tempatKerja = tempatKerja;
        this.gaji = gaji;
        this.totalGaji = 0;
    }


    public abstract void hitungGaji();


    public String getInfo() {
        return "Nama: " + nama + "\nTempat Kerja: " + tempatKerja + "\nGaji: Rp" + gaji;
    }
}
