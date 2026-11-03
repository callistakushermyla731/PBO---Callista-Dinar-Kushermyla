package TugasPraktikum;

public class LumbaLumba implements Penyelam {
    public String nama;
    public int panjang;
    public int berat;
    public int kecepatan;
    public int umur;

    @Override
    public void menyelam() {
        System.out.println(nama + " menyelam ke dalam air.");
    }

    @Override
    public void mengapung() {
        System.out.println(nama + " naik ke permukaan air.");
    }

    @Override
    public void aturKedalaman() {
        System.out.println(nama + " mengatur kedalaman selamnya.");
    }

    public void bernapas() {
        System.out.println(nama + " bernapas melalui lubang di atas kepalanya.");
    }
}
