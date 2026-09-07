package TugasPraktikum;

public class Anggota {
    private String nomorKtp;
    private String nama;
    private int limitPeminjaman;
    private int jumlahPinjaman;

    public Anggota(String nomorKtp, String nama, int limitPeminjaman) {
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNomorKtp() {
        return nomorKtp;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPeminjaman() {
        return limitPeminjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int uang) {
        if (jumlahPinjaman + uang <= limitPeminjaman) {
            jumlahPinjaman += uang;
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
    }

    public void angsur(int uang) {
        if (uang <= jumlahPinjaman) {
            jumlahPinjaman -= uang;
        } else {
            System.out.println("Maaf, jumlah angsuran melebihi jumlah pinjaman.");
        }
    }
}
