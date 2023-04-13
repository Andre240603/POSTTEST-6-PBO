package posttest6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Minuman extends Data implements AntarMuka{
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Minuman> listMnm = new ArrayList<>();
    
    private String Ukuran;
    private String Topping;
    
    public Minuman(String name, String tanggalBrg, String StokMasuk, String Ukuran, String Topping) {
        super(name, tanggalBrg, StokMasuk);
        this.Ukuran = Ukuran;
        this.Topping = Topping;
    }

    Minuman() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
        public void notif() {
        System.out.println("Berhasil ditambahkan dikategori Minuman. ");
    }

    /**
     * @return the Ukuran
     */
    public String getUkuran() {
        return Ukuran;
    }

    /**
     * @param Ukuran the Ukuran to set
     */
    public void setUkuran(String Ukuran) {
        this.Ukuran = Ukuran;
    }

    /**
     * @return the Topping
     */
    public String getTopping() {
        return Topping;
    }

    /**
     * @param Topping the NamaKepalaKeluarga to set
     */
    public void setTopping(String Topping) {
        this.Topping = Topping;
    }
    
    @Override
    public void deskripsi(){
        System.out.println("Segarkan hari-harimu dengan segelas es teh, setiap rasa membawa manisnya sendiri.");
    }
    @Override
    public void deskripsi(int i){
        System.out.println("Data barang  hanya ada: "+ i);
    }
    
    @Override
    public void tampil(){
        System.out.println("Lokasi Toko               :" + lokasi);
        System.out.println("Nama Minuman              :" + getName());
        System.out.println("Tanggal Masuk Minuman     :" + getTanggalBrg());
        System.out.println("Stok Masuk Minuman        :" + getStokMasuk());
        System.out.println("Ukuran Minuman            :" + Ukuran);
        System.out.println("Topping Minuman           :" + Topping);
        System.out.println("Peringatan                :" + Peringatan());
        System.out.println("Kadaluwarsa               :" + Expired());
    }
    
        @Override
    public String Peringatan(){
        return "Jangan Di Tindis";
    }
    @Override
    public String Expired(){
        return "4 tahun";
    }
}
