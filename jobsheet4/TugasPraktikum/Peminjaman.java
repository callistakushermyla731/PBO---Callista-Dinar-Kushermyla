package TugasPraktikum;

public class Peminjaman {
    private String idPeminjaman;
    private String tanggal;
    private int durasi;
    private Mahasiswa mahasiswa;
    private Sepeda sepeda;

    public Peminjaman(String idPeminjaman, String tanggal, int durasi, Mahasiswa mahasiswa, Sepeda sepeda) {
        this.idPeminjaman = idPeminjaman;
        this.tanggal = tanggal;
        this.durasi = durasi;
        this.mahasiswa = mahasiswa;
        this.sepeda = sepeda;
    }

    public void mulaiPeminjaman() {
        if (sepeda.cekKetersediaan()) {
            sepeda.ubahStatus("Dipinjam");
            System.out.println("Peminjaman dimulai.");
        } else {
            System.out.println("Sepeda tidak tersedia.");
        }
    }

    public void selesaikanPeminjaman() {
        sepeda.ubahStatus("Tersedia");
        System.out.println("Peminjaman selesai.");
    }

    public boolean cekKeterlambatan(int durasiAktual) {
        return durasiAktual > durasi;
    }

    public String getIdPeminjaman() {
        return idPeminjaman;
    }

    public String getTanggal() {
        return tanggal;
    }

    public int getDurasi() {
        return durasi;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public Sepeda getSepeda() {
        return sepeda;
    }
}