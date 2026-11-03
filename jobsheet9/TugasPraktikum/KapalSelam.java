package TugasPraktikum;

public class KapalSelam implements Penyelam {
    public String nama;
    public int panjang;
    public int berat;
    public int kecepatan;

    @Override
    public void menyelam() {
        System.out.println(nama + " menyelam dengan mengisi tangki ballast.");
    }

    @Override
    public void mengapung() {
        System.out.println(nama + " mengapung ke permukaan.");
    }

    @Override
    public void aturKedalaman() {
        System.out.println(nama + " mengatur kedalaman menggunakan kemudi selam.");
    }

    public int hitungKecepatan() {
        return kecepatan;
    }

    public void isiBallast() {
        System.out.println("Tangki ballast " + nama + " diisi air.");
    }

    public void kosongkanBallast() {
        System.out.println("Tangki ballast " + nama + " dikosongkan.");
    }
}
