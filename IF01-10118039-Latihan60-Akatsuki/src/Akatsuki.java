/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program yang dapat menampilkan beberapa informasi dari setiap karakter  
 */

/**
 *
 * @author Seno
 */
public class Akatsuki {
    private String tujuan;
    private String outfit;
    private String pemimpin;
    private String caraKerja;

    public String getTujuan() {
        return tujuan;
    }

    public String getOutfit() {
        return outfit;
    }

    public String getPemimpin() {
        return pemimpin;
    }

    public String getCaraKerja() {
        return caraKerja;
    }

    public Akatsuki(String tujuan, String outfit, String pemimpin, String caraKerja) {
        this.tujuan = tujuan;
        this.outfit = outfit;
        this.pemimpin = pemimpin;
        this.caraKerja = caraKerja;
    }
    
    public void tampilAkatsuki(){
        System.out.println("------Akatsuki------");
        System.out.printf("Pemimpin\t: %s%n",pemimpin);
        System.out.printf("Tujuan\t\t: %s%n",tujuan);
        System.out.printf("Outfit\t\t: %s%n",outfit);
        System.out.printf("Cara Kerja\t: %s%n",caraKerja);
    }
}

