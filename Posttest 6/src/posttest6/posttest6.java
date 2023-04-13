package posttest6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public final class posttest6 { //final class
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Makanan> listMkn = new ArrayList<>();
    static ArrayList<Minuman> listMnm = new ArrayList<>();
    
    public static void froze() throws IOException {
        System.out.print("Tekan enter untuk melanjutkan... ");
        input.readLine();
        System.out.println("");
    }
    
    public static void jenisBarang(){//static method
        System.out.println("=======================");
        System.out.println("Jenis Barang :");
        System.out.println("1. Barang Makanan");
        System.out.println("2. Barang Minuman");
    }
    
    static final void display() { // final method
        System.out.println("\n=================================================");
        System.out.println("|                   List Data                   |");
    }
        
    public static void addData() throws IOException { 
        System.out.println("Jenis data");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("========== Masukkan Data Makanan ==========");
            System.out.print("Masukkan Nama Makanan                      : ");
            String name = input.readLine();
            System.out.print("Masukkan Tanggal Masuk Makanan (DD/MM/YYYY): ");
            String tanggalBrg = input.readLine();
            System.out.print("Masukkan Stok Masuk Makanan                : ");
            String StokMasuk = input.readLine();
            System.out.print("Masukkan Rasa Makanan                      : ");
            String Rasa = input.readLine();
            System.out.print("Masukkan Jenis Makanan                     : ");
            String Jenis = input.readLine();
            System.out.println("=============================================");
            listMkn.add(new Makanan(name, tanggalBrg, StokMasuk, Rasa, Jenis));
            System.out.println("Data " + name + " berhasil ditambahkan!");

        }else if(pil == 2){
            System.out.println("========== Masukkan Data Minuman ==========");
            System.out.print("Masukkan Nama Minuman                      : ");
            String name = input.readLine();
            System.out.print("Masukkan Tanggal Masuk Minuman (DD/MM/YYYY): ");
            String tanggalBrg = input.readLine();
            System.out.print("Masukkan Stok Masuk Minuman                : ");
            String StokMasuk = input.readLine();
            System.out.print("Masukkan Ukuran Minuman                    : ");
            String Ukuran = input.readLine();
            System.out.print("Masukkan Topping Minuman                   : ");
            String Topping = input.readLine();
            System.out.println("=============================================");
            listMnm.add(new Minuman(name, tanggalBrg, StokMasuk, Ukuran, Topping ));
            System.out.println("Data " + name + " berhasil ditambahkan!");

        }else{
            System.out.println("Pilihan Salah");

        }
    }
    
    public static void showData() throws IOException {
        System.out.println("Jenis data");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            display();
            System.out.println("|                    Makanan                    |");
            System.out.println("=================================================");
            if (listMkn.isEmpty()){
                System.out.println("\n===========================================");
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listMkn.size();i++){
                    System.out.println("Data indeks ke-" + (i));
                    listMkn.get(i).tampil();
                    }
                }
                System.out.println("===========================================");
        }else if(pil == 2){
            display();
            System.out.println("|                    Minuman                    |");
            System.out.println("=================================================");
            if (listMnm.isEmpty()){
                System.out.println("\n===========================================");
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listMnm.size();i++){
                    System.out.println("Data indeks ke-" + (i));
                    listMnm.get(i).tampil();
                    }
            }
                System.out.println("=======================================");
        }else{
            System.out.println("Pilihan salah");

        }
    }
    
    public static void updateData() throws IOException {
        System.out.println("Jenis data");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listMkn.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                for(int i = 0; i < listMkn.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listMkn.get(i).tampil();
                }
                System.out.print("Masukkan indeks data Makanan yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                
                if (index <= listMkn.size() || index > 0) {
                    System.out.println("======= Masukkan data Makanan yang baru =======");
                    System.out.print("\nMasukkan Nama Makanan                      : ");
                    String name = input.readLine();
                    listMkn.get(index-1).setName(name);
                    
                    System.out.print("\nMasukkan Tanggal Masuk Makanan (DD/MM/YYYY): ");
                    String TanggalBrg = input.readLine();
                    listMkn.get(index-1).setTanggalBrg(TanggalBrg);
                    
                    System.out.print("\nMasukkan Stok Masuk Makanan                : ");
                    String StokMasuk = input.readLine();
                    listMkn.get(index-1).setStokMasuk(StokMasuk);
                    
                    System.out.print("\nMasukkan Rasa Makanan                      : ");
                    String Rasa = input.readLine();
                    listMkn.get(index-1).setRasa(Rasa);
                    
                    System.out.print("\nMasukkan Jenis Makanan                     : ");
                    String Jenis = input.readLine();
                    listMkn.get(index-1).setJenis(Jenis);
                    System.out.println("=================================================");
                }else{
                    System.out.println("Indeks tidak ditemukan!");
                }
                }
            }
        else if(pil == 2){
            if (listMnm.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                for(int i = 0; i < listMnm.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listMnm.get(i).tampil();
                }
                System.out.print("Masukkan indeks data Minuman yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                if(index <= listMnm.size() || index > 0){
                    System.out.println("======= Masukkan data Minuman yang baru =======");
                    System.out.print("\nMasukkan Nama Minuman                      : ");
                    String name = input.readLine();
                    listMnm.get(index-1).setName(name);
                    
                    System.out.print("Masukkan Tanggal Masuk Minuman (DD/MM/YYYY): ");
                    String tanggalBrg = input.readLine();
                    listMnm.get(index-1).setTanggalBrg(tanggalBrg);
                    
                    System.out.print("Masukkan Stok Masuk Minuman                : ");
                    String StokMasuk = input.readLine();
                    listMnm.get(index-1).setStokMasuk(StokMasuk);
                    
                    System.out.print("Masukkan Ukuran Minuman                    : ");
                    String Ukuran = input.readLine();
                    listMnm.get(index-1).setUkuran(Ukuran);
                    
                    System.out.print("Masukkan Topping Minuman                   : ");
                    String Topping = input.readLine();
                    listMnm.get(index-1).setTopping(Topping);
                    System.out.println("=================================================");
                    
                }else 
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }
        }else{
            System.out.println("Input Salah");
        }
    }
    
    public static void deleteData() throws IOException { 
        System.out.println("Jenis data");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listMkn.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
               for(int i = 0; i < listMkn.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listMkn.get(i).tampil();
                    }
                System.out.print("Masukkan indeks data penduduk yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if(index <= listMkn.size() || index > 0) 
                { 
                   listMkn.remove(index-1);
                    System.out.println("Data Makanan dengan indeks " + index + " berhasil dihapus");
                } 
                else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }
        }else if(pil == 2){
            if (listMnm.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                for(int i = 0; i < listMnm.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listMnm.get(i).tampil();
                    }
                System.out.print("Masukkan indeks data Minuman yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if(index <= listMnm.size() || index > 0) 
                {
                    listMnm.remove(index-1);
                    System.out.println("Data Minuman dengan indeks " + index + " berhasil dihapus:");
                }
                else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }
        }else{
            System.out.println("Input Salah");
        }
    }
    
     public static void DeskripsiBarang() throws IOException{
        Makanan Mkn = new Makanan();
        Minuman Mnm = new Minuman();

        System.out.println("Jenis Barang");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            Mkn.deskripsi();
            Mkn.deskripsi(listMkn.size());
        }else if(pil == 2){
            Mnm.deskripsi();
            Mnm.deskripsi(listMnm.size());
        }else{
            System.out.println("Piilihan salah!");
        }
    }

    public static void main(String[] args) throws IOException{
        boolean menu = true;
        while (menu = true) {
            System.out.println("\nProgram Pendataan Barang COffee Shop Tok Aba");
            System.out.println("==============================================");
            System.out.println("|   1. Menambah Data Barang                  |");
            System.out.println("|   2. Lihat Data Barang                     |");
            System.out.println("|   3. Ubah Data Barang                      |");
            System.out.println("|   4. Hapus Data Barang                     |");
            System.out.println("|   5. Deskripsi Barang                      |");
            System.out.println("|   6. Keluar Program                        |");
            System.out.println("==============================================");
            System.out.print("Pilihan: ");
            int pilih = Integer.parseInt(input.readLine());

            switch (pilih) {
                case 1:
                    addData();
                    froze();
                    break;
                case 2:
                    showData();
                    froze();
                    break;
                case 3:
                    updateData();
                    froze();
                    break;
                case 4:
                    deleteData();
                    froze();
                    break;
                case 5:
                    DeskripsiBarang();
                    froze();
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan program ini");
                    System.exit(0);
                    menu = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    froze();
                    break;
            }
        }
    }
}
