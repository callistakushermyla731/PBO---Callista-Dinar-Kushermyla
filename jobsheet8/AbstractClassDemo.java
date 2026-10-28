public class AbstractClassDemo {
    public static void main(String[] args) {
        Lebah lebah1 = new Lebah("Ratu", 0., "Nektar", "Hutan");
        lebah1.cetakInfo();
        lebah1.bergerak();
        lebah1.bernapas();

        Ular ular1 = new Ular(true, 10, "Tikus", "Sawah");
        ular1.cetakInfo();
        ular1.bergerak();
        ular1.bernapas();
    }
}
