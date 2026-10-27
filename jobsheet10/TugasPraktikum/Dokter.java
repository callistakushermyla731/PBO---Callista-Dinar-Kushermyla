public class Dokter extends Karyawan {
    public String sip;
    public int pasien;

    public Dokter() {
        super();
        sip = "";
        pasien = 0;
    }

    public Dokter(String nama, String tempatKerja, int gaji, String sip, int pasien) {
        super(nama, tempatKerja, gaji); 
        this.sip = sip;
        this.pasien = pasien;
    }

    public void hitungGaji() {
        gaji = gaji + (pasien * 100000);
    }

    public String getInfo() {
        return super.getInfo() + "\nSIP: " + sip + "\nJumlah Pasien: " + pasien + "\nGaji: " + gaji;
    }
}
