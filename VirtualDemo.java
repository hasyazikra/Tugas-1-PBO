public class VirtualDemo {
    public static void main(String[] args) {

        Gaji s =  new Gaji("Wahyu", "KUBAR", 3, 5000.00); // Polymorphism 
        Pegawai e = new Gaji("Ini nama", "Samarinda", 2, 2500.00); // Polymorphism
        System.out.println("Memanggil mailCheck Berdasarkan referensi Gaji --"); 
        s.mailCheck();
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        e.mailCheck();
    }
}

// output "menyusun pegawai" tampil 2x karena dalam konstruktor gaji terdapat kode super yang
// mengakses konstruktor