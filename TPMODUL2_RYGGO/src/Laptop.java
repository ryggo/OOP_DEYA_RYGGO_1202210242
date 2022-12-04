public class Laptop extends Perangkat{
    
    protected boolean webcam;

    public Laptop (String drive, int ram, float processor, boolean webcam){
        super(drive,ram,processor);
        this.webcam=webcam;

    }
    @Override
    public void Informasi(){
       if(this.webcam == true){
        System.out.println("Laptop ini memiliki drive tipe "+drive+"dengan ram sebesar "+ram+" dan processor secepat "+ processor+" Ghz. Selain itu laptop ini juga memiliki webcam"); 
       } else{
        System.out.println("Laptop ini memiliki drive tipe "+drive+"dengan ram sebesar "+ram+" dan processor secepat "+ processor+" Ghz. Selain itu laptop ini juga Tidak memiliki webcam"); 
       }
    }

    public void bukaGame(String name_game){
        System.out.println("Laptop berhasil membuka game "+name_game);
    }

    public void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim Email ke "+email);
    }

    public void kirimEmail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim Email ke "+email1+" dan ke "+email2);
    }
}
