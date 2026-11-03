package TugasPraktikum;

public class Main {
    public static void main(String[] args) {
        KapalSelam kapal = new KapalSelam();
        kapal.nama = "KRI Nagapasa";
        kapal.panjang = 61;
        kapal.berat = 1300;
        kapal.kecepatan = 20;

        LumbaLumba lumba = new LumbaLumba();
        lumba.nama = "Flipper";
        lumba.panjang = 3;
        lumba.berat = 200;
        lumba.kecepatan = 30;
        lumba.umur = 10;

        System.out.println("=== Kapal Selam ===");
        kapal.isiBallast();
        kapal.menyelam();
        kapal.aturKedalaman();
        System.out.println("Kecepatan: " + kapal.hitungKecepatan() + " knot");
        kapal.kosongkanBallast();
        kapal.mengapung();

        System.out.println("\n=== Lumba-Lumba ===");
        lumba.menyelam();
        lumba.aturKedalaman();
        lumba.mengapung();
        lumba.bernapas();
    }
}
