public class Main {
    public static void main(String[] args) {

        Guru guru1 = new Guru();
        guru1.nama = "Siti Aminah";
        guru1.tempatKerja = "SMAN 1 Malang";
        guru1.gaji = 3000000;
        guru1.nip = "1987654321";
        guru1.jtm = 20;

        
        Guru guru2 = new Guru(
            "Budi Santoso",
            "SMAN 3 Malang",
            3500000,
            "1987654322",
            24
        );
        guru2.hitungGaji();

        Dokter dokter1 = new Dokter();
        dokter1.nama = "Dr. Andi Wijaya";
        dokter1.tempatKerja = "RSUD Malang";
        dokter1.gaji = 5000000;
        dokter1.sip = "Dokter12345678";
        dokter1.pasien = 10;

        Dokter dokter2 = new Dokter(
            "Dr. Rina Sari",
            "RSUD Surabaya",
            6000000,
            "Dokter23456789",
            15
        );
        dokter2.hitungGaji();
        
        System.out.println("=== DATA GURU 1 ===");
        System.out.println(guru1.getInfo());

        System.out.println("\n=== DATA GURU 2 ===");
        System.out.println(guru2.getInfo());

        System.out.println("\n=== DATA DOKTER 1 ===");
        System.out.println(dokter1.getInfo());
        
        System.out.println("\n=== DATA DOKTER 2 ===");
        System.out.println(dokter2.getInfo());
    }
}
