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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Akatsuki ak= new Akatsuki("Penguasaan Dunia dengan Mutlak", "Jubah corak awan merah", "Pain & Obito", "Berkelompok");
       ak.tampilAkatsuki();
       
       Anggota hidan= new Anggota("Hidan", "Yugakure", "Sabir bermata tiga", "Tidak bisa mati", "Tiga Tingkatan, Telunjuk Kiri", "Kakuzu", "Disegel", "", "", "", "");
       Anggota kakuzu= new Anggota("Kakuzu", "Takigakure", "-", "Dapat menggunakan seluruh lima elemen chakra", "Bintang Utara, Jari tengah kri", "Hidan", "Mati", "", "", "", "");
       Anggota itachi= new Anggota("Itachi Uchiha", "Konohagakure", "Pedang,Kunai,Shuriken", "Mangekyou Sharingan", "Merah Delima, Jari manis kanan", "Kisame Hoshigaki", "Mati", "", "", "", "");
       Anggota kisame= new Anggota("Kisame Hoshigaki", "Kirigakure", "Pedang Samehada", "Karakterisik badan hiu", "Bintang Selatan, Jari manis kiri", "Itachi Uchiha", "Mati", "", "", "", "");
       Anggota zetsu= new Anggota("Zetsu", "Kusagakure", "-", "Mempunyai dua kepribadian(zetsu putih & zetsu hitam)", "Babi Hutan, Kelingking kanan", "Tobi/Obito Uchiha", "Mati", "", "", "", "");
       Anggota tobi= new Anggota("Tobi/Obito Uchiha", "Konohagakure", "Gunbai, Kunai", "Mangekyou Sharingan", "Berlian, Jempol kiri", "Deidara", "Mati", "", "", "", "");
       Anggota orochimaru= new Anggota("Orochimaru", "Konohagakure, Otogakure","", "Karakteristik badan ular", "Langit, Kelingking Kiri", "Sasori", "Hidup, Keluar Akatsuki", "", "", "", "");
       Anggota deidara= new Anggota("Deidara", "Iwagakure", "Tanah liat", "Bom tanah liat", "Biru/Hijau, Telunjuk Kanan", "Sasori, Tobi/Obito Uchiha", "Mati", "", "", "", "");
       Anggota sasori= new Anggota("Sasori", "Sunagakure", "Boneka", "Pengendali 100 Boneka", "Virgo, Jempol kri", "Orochimaru, Deidara", "Mati", "", "", "", "");
       Anggota konan= new Anggota("Konan", "Amegakure", "Kertas", "Merubah bentuk kertas dan menjadikannya sebagi senjata", "Putih, Jari tengah kanan", "Pain", "Mati", "", "", "", "");
       Anggota pain= new Anggota("Yahiko/Nagato", "Amegakure", "-", "Rinnegan", "Nol/Tidak ada, Jempol kanan", "Conan", "Mati", "", "", "", "");
       
        System.out.println("\nAnggota : \n");
        hidan.tampilAnggota();
        kakuzu.tampilAnggota();
        itachi.tampilAnggota();
        kisame.tampilAnggota();
        zetsu.tampilAnggota();
        tobi.tampilAnggota();
        orochimaru.tampilAnggota();
        deidara.tampilAnggota();
        sasori.tampilAnggota();
        konan.tampilAnggota();
        pain.tampilAnggota();
    }
    
}
