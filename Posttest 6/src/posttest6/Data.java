package posttest6;


public abstract class Data { 
    protected final String lokasi = "Marangkayu, Kalimantan Timur"; // final pada atribut 
    private String name; 
    private String tanggalBrg;
    private String StokMasuk;


    public Data(String name, String tanggalBrg,String StokMasuk) {
        this.name = name; // untuk menginisialisasi atribut "name"
        this.tanggalBrg = tanggalBrg;
        this.StokMasuk = StokMasuk;
    }

    
    public Data(){}
    
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the tanggalBrg
     */
    public String getTanggalBrg() {
        return tanggalBrg;
    }

    /**
     * @param tanggalBrg the tanggalBrg to set
     */
    public void setTanggalBrg(String tanggalBrg) {
        this.tanggalBrg = tanggalBrg;
    }
    
     /**
     * @return the StokMasuk
     */
    public String getStokMasuk() {
        return StokMasuk;
    }

    /**
     * @param StokMasuk the StokMasuk to set
     */
    public void setStokMasuk(String StokMasuk) {
        this.StokMasuk = StokMasuk;
    }
    
       @Override
    public String toString() {
        return "Nama Barang: " + name + "\nTanggal Masuk Barang: " + tanggalBrg + "\nStok Masuk Barang: " + StokMasuk;
    }

    public void deskripsi(){
        System.out.println("Jangan Lupa Mampir Ges Yaaa");
    }

    public void deskripsi(int i){
        System.out.println("Data barang hanya ada: "+ i);
    }
    
    //abstract method
    public abstract void tampil();
}

