
package TugasPraktikum;

public class Main {
    public static void main(String[] args) {

        // Objek pertama menggunakan constructor tanpa parameter
        Guru guru1 = new Guru();
        guru1.nama = "Siti Aminah";
        guru1.tempatKerja = "SMAN 1 Malang";
        guru1.gaji = 3000000;
        guru1.nip = "1987654321";
        guru1.jtm = 20;

        // Objek kedua menggunakan constructor berparameter
        Guru guru2 = new Guru(
            "Budi Santoso",
            "SMAN 3 Malang",
            3500000,
            "1987654322",
            24
        );

        // Menampilkan informasi kedua guru
        System.out.println("=== DATA GURU 1 ===");
        System.out.println(guru1.getInfo());

        System.out.println("\n=== DATA GURU 2 ===");
        System.out.println(guru2.getInfo());
    }
}
