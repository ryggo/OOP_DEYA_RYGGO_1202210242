public class Sampan extends TransportasiAir {
    protected int layar;

    public Sampan(int jumlahKursi,int biaya,int layar ){
        super(jumlahKursi,layar);
        this.layar = layar;
    }

    @Override
    public void informasi(){
        System.out.println("Transportasi Air jenis Sampan diketahui dengan kursi berjumlah "+jumlahKursi+" ditetapkan dengan biaya sebesar Rp. "+biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air dengan jenis Sampan sedang berlayar menggunakan"+layar);
    }
    public void berlabuh(){
        System.out.println("Transportasi Air dengan jenis Sampan berlabuh di pantai tanpa jangkar");
    }
    public void berlabuh(int jangkar){
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai menggunakan "+jangkar+" Jangkar");
    }
}
