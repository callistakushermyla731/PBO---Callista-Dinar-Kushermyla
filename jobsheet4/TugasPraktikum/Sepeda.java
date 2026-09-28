package TugasPraktikum;

public class Sepeda {
    private String idSepeda;
    private String jenis;
    private String status;

    public Sepeda(String idSepeda, String jenis, String status) {
        this.idSepeda = idSepeda;
        this.jenis = jenis;
        this.status = status;
    }

    public boolean cekKetersediaan() {
        return status.equals("Tersedia");
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void tampilkanData() {
        System.out.println("ID Sepeda : " + idSepeda);
        System.out.println("Jenis : " + jenis);
        System.out.println("Status : " + status);
    }

    public String getIdSepeda() {
        return idSepeda;
    }

    public String getJenis() {
        return jenis;
    }
}