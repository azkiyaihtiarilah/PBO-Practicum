package experiment3;

public class Motor2 {
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;
    
    public String getPlatNomor(){
        return platNomor;
    }

    public void setPlatNomor(String platNomor){
        this.platNomor = platNomor;
    }

    public boolean isMesinOn(){
        return isMesinOn;
    }

    public void setIsMesinOn(boolean isMesinOn){
        this.isMesinOn = isMesinOn;
    }

    public int getKecepatan(){
        return kecepatan;
    }

    public void setKecepatan(int kecepatan){
        if (!this.isMesinOn && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else if(kecepatan > 100){
            System.out.println("Kecepatan Maksimal adalah 100");
            this.kecepatan = 100;
        } else if(kecepatan < 0){
            System.out.println("Kecepatan tidak bisa bernilai negatif");
        } else {
            this.kecepatan = kecepatan;
        } 
    }
    
    public void displayStatus() {
        System.out.println("Plat Nomor: " + this.platNomor);

        if (isMesinOn) {
            System.out.println("Mesin On");
        } else{
            System.out.println("Mesin Off");
        }

        System.out.println("Kecepatan: "+ this.kecepatan);
        System.out.println("==========================");
    }
}
