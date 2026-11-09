public class Dosen extends Pegawai {
    public String nidn;

    public Dosen() {
    }

    public Dosen(String nip, String nama, String nidn) {
        super(nip, nama);
        this.nidn = nidn;
    }

    public void displayInnfo() {
        super.displayInfo();
        System.out.println("NIDN: " + nidn);
    }

    public void mengajar() {
        System.out.println("Membuat recana pembelajaran");
        System.out.println("Menyusun materi");
        System.out.println("Melaksanakan PBM");
        System.out.println("Melakukan evaluasi");
    }
}