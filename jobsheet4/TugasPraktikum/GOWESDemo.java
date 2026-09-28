package TugasPraktikum;

public class GOWESDemo {
    public static void main(String[] args) {

        // membuat objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("254107060087", "Callista", "Aktif");

        // membuat objek Sepeda
        Sepeda sepeda1 = new Sepeda("S001", "Sepeda Listrik", "Tersedia");

        // membuat objek Peminjaman
        Peminjaman pinjam1 = new Peminjaman("P001", "2026-09-21", 3, mhs1, sepeda1);

        System.out.println("=== DATA MAHASISWA ===");
        mhs1.tampilkanData();

        System.out.println("\n=== DATA SEPEDA ===");
        sepeda1.tampilkanData();

        System.out.println("\n=== MULAI PEMINJAMAN ===");
        mhs1.pinjamSepeda(pinjam1);
        pinjam1.mulaiPeminjaman();

        System.out.println("\n=== STATUS SEPEDA ===");
        sepeda1.tampilkanData();

        System.out.println("\n=== CEK KETERLAMBATAN ===");
        boolean terlambat = pinjam1.cekKeterlambatan(4);

        if (terlambat) {
            System.out.println("Pengembalian sepeda terlambat.");
        } else {
            System.out.println("Pengembalian sepeda tidak terlambat.");
        }

        System.out.println("\n=== PENGEMBALIAN ===");
        mhs1.kembalikanSepeda(pinjam1);

        System.out.println("\n=== STATUS AKHIR SEPEDA ===");
        sepeda1.tampilkanData();
    }
}