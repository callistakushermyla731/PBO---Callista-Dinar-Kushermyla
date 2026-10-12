
package TugasPraktikum;

public class Guru extends Karyawan {
    public String nip;
    public int jtm;

    // Constructor tanpa parameter
    public Guru() {
        super();
        nip = "-";
        jtm = 0;
    }

    // Constructor berparameter
    public Guru(String nama, String tempatKerja, int gaji, String nip, int jtm) {
        super(nama, tempatKerja, gaji);
        this.nip = nip;
        this.jtm = jtm;
    }

    // Overriding method hitungGaji()
    @Override
    public int hitungGaji() {
        return gaji + (jtm * 50000);
    }

    // Menampilkan informasi guru
    @Override
    public String getInfo() {
        return super.getInfo() + "\nNIP: " + nip + "\nJTM: " + jtm;
    }
}
