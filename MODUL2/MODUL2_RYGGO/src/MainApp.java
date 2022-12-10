public class MainApp {
    public static void main(String[] args) throws Exception {
    
    TransportasiAir t = new TransportasiAir(4, 20000);
    t.informasi();
    t.berlayar();
    t.berlabuh();

    Sampan s = new Sampan(20, 50000, 2);
    s.informasi();
    s.berlayar();
    s.berlabuh();
    s.berlabuh(2);

    Kapal k = new Kapal(50, 100000, "Diesel");
    k.informasi();
    k.berlayar();
    k.berlayar(20);
    k.berlabuh();
    }
}
