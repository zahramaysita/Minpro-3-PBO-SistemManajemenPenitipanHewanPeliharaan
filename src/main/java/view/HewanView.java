package view;

public class HewanView {

    // =========================
    // TAMPILKAN MENU
    // =========================
    public void tampilkanMenu() {

        System.out.println(
                "\n===== SISTEM MANAJEMEN PENITIPAN HEWAN ====="
        );

        System.out.println("1. Tambah Hewan");
        System.out.println("2. Tampilkan Hewan");
        System.out.println("3. Update Hewan");
        System.out.println("4. Hapus Hewan");
        System.out.println("5. Tambah Penitipan");
        System.out.println("6. Tampilkan Penitipan");
        System.out.println("7. Update Penitipan");
        System.out.println("8. Hapus Penitipan");
        System.out.println("9. Cari Hewan");
        System.out.println("10. Keluar");

        System.out.print("Pilih menu (1-10): ");
    }

    // =========================
    // TAMPILKAN PESAN
    // =========================
    public void tampilkanPesan(String pesan) {
        System.out.println(pesan);
    }

    // =========================
    // TAMPILKAN INPUT
    // =========================
    public void tampilkanInput(String pesan) {
        System.out.print(pesan);
    }
}