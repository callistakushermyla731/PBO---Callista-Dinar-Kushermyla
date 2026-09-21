package TugasPraktikum;
import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String status;
    private ArrayList<Peminjaman> daftarPeminjaman;

    public Mahasiswa(String nim, String nama, String status) {
        this.nim = nim;
        this.nama = nama;
        this.status = status;
        this.daftarPeminjaman = new ArrayList<>();
    }

    public void pinjamSepeda(Peminjaman peminjaman) {
        daftarPeminjaman.add(peminjaman);
        System.out.println("Peminjaman berhasil ditambahkan.");
    }

    public void kembalikanSepeda(Peminjaman peminjaman) {
        peminjaman.selesaikanPeminjaman();
        System.out.println("Sepeda berhasil dikembalikan.");
    }

    public void tampilkanData() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Status : " + status);
        System.out.println("Jumlah Peminjaman : " + daftarPeminjaman.size());
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getStatus() {
        return status;
    }
}