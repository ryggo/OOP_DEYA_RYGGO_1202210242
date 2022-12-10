public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat pkt = new Perangkat("adata",2,1.88f);
        pkt.Informasi();
        System.out.println("");

        Laptop lepi = new Laptop("Seagate",8,2.40f,true);
        lepi.Informasi();
        lepi.bukaGame("Dota 2");
        lepi.kirimEmail("niceyuk@gmail.com");
        lepi.kirimEmail("anaarji@gmail.com","rusmangc@gmail.com");
        System.out.println("");

        Handphone hape = new Handphone("Sandisk",3,2.20f,false);
        hape.Informasi();
        hape.telfon(024125215);
        hape.kirimSMS(024125215);
        hape.kirimSMS(052525252,251528522);
    }
}
