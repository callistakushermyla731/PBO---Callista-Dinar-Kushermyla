public class Guru extends Karyawan {
    public String nip;
    public int jtm;


    public Guru() {
        super();
        nip = "";
        jtm = 0;
    }


    public Guru(String nama, String tempatKerja, int gaji, String nip, int jtm) {
        super(nama, tempatKerja, gaji); 
        this.nip = nip;
        this.jtm = jtm;
    }


    public void hitungGaji() {
        totalGaji = gaji + (jtm * 50000);
    }


    public String getInfo() {
        return super.getInfo() + "\nNIP: " + nip + "\nJumlah Jam Mengajar: " + jtm + "\nTotal Gaji: Rp" + totalGaji;
    }
}
