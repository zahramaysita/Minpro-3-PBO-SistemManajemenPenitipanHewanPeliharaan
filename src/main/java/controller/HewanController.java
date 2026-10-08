package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Anjing;
import model.Hamster;
import model.Hewan;
import model.Kelinci;
import model.Kucing;
import model.Penitipan;
import model.Service;
import view.HewanView;

public class HewanController {

    private Service service;
    private HewanView view;
    private Scanner scanner;

    public HewanController(
            Service service,
            HewanView view,
            Scanner scanner) {

        this.service = service;
        this.view = view;
        this.scanner = scanner;
    }

    // =========================
    // JALANKAN PROGRAM
    // =========================
    public void jalankanProgram() {
        boolean berjalan = true;
        while (berjalan) {
            view.tampilkanMenu();
            if (!scanner.hasNextInt()) {
                view.tampilkanPesan(">> Pilihan harus berupa angka!");
                scanner.nextLine();
                continue;
            }

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> tambahHewan();
                case 2 -> tampilkanHewan();
                case 3 -> updateHewan();
                case 4 -> hapusHewan();
                case 5 -> tambahPenitipan();
                case 6 -> tampilkanPenitipan();
                case 7 -> updatePenitipan();
                case 8 -> hapusPenitipan();
                case 9 -> cariHewan();
                case 10 -> {
                    view.tampilkanPesan("\n=== Terima kasih sudah menggunakan program ini ===");
                    view.tampilkanPesan("==== Byeee ====");
                    berjalan = false;
                }

                default -> view.tampilkanPesan(">> Pilihan tidak valid!");
            }
        }
    }

    // =========================
    // TAMBAH HEWAN
    // =========================
    public void tambahHewan() {

        ArrayList<Hewan> daftarHewan =
                service.getDaftarHewan();

        view.tampilkanInput("ID Hewan: ");

        if (!scanner.hasNextInt()) {
            view.tampilkanPesan (">> ID hewan harus berupa angka!");
            scanner.nextLine();
            return;
        }

        int id = scanner.nextInt();
        scanner.nextLine();

        if (id <= 0) {
            view.tampilkanPesan (">> ID hewan tidak valid!");
            return;
        }

        for (Hewan h : daftarHewan) {
            if (h.getIdHewan() == id) {
                view.tampilkanPesan(">> ID hewan sudah digunakan!");
                return;
            }
        }

        view.tampilkanInput("Nama Hewan: ");
        String nama = scanner.nextLine();

        if (nama.isEmpty()) {
            view.tampilkanPesan(">> Nama hewan tidak boleh kosong!");
            return;
        }

        view.tampilkanPesan("\nPilih Jenis Hewan:");
        view.tampilkanPesan("1. Kucing");
        view.tampilkanPesan("2. Anjing");
        view.tampilkanPesan("3. Kelinci");
        view.tampilkanPesan("4. Hamster");

        view.tampilkanInput("Pilihan: ");

        if (!scanner.hasNextInt()) {

            view.tampilkanPesan(">> Pilihan harus berupa angka!");
            scanner.nextLine();
            return;
        }

        int pilihan = scanner.nextInt();
        scanner.nextLine();
        Hewan hewanBaru;
        switch (pilihan) {
            case 1 -> {
                view.tampilkanInput("Ras Kucing: ");
                String ras = scanner.nextLine();

                if (ras.isEmpty()) {
                    view.tampilkanPesan(">> Ras kucing tidak boleh kosong!");
                    return;
                }

                hewanBaru =
                        new Kucing(id, nama, ras);
            }

            case 2 -> {

                view.tampilkanInput("Ras Anjing: ");
                String ras = scanner.nextLine();

                if (ras.isEmpty()) {
                    view.tampilkanPesan(">> Ras anjing tidak boleh kosong!");
                    return;
                }

                hewanBaru =
                        new Anjing(id, nama, ras);
            }

            case 3 -> {

                view.tampilkanInput("Ras Kelinci: ");
                String ras = scanner.nextLine();

                if (ras.isEmpty()) {
                    view.tampilkanPesan(">> Ras kelinci tidak boleh kosong!");
                    return;
                }

                hewanBaru =
                        new Kelinci(id, nama, ras);
            }

            case 4 -> {

                view.tampilkanInput("Ras Hamster: ");
                String ras = scanner.nextLine();

                if (ras.isEmpty()) {
                    view.tampilkanPesan(">> Ras hamster tidak boleh kosong!");
                    return;
                }

                hewanBaru =
                        new Hamster(id, nama, ras);
            }

            default -> {
                view.tampilkanPesan(">> Pilihan jenis hewan tidak valid!");
                return;
            }
        }

        daftarHewan.add(hewanBaru);

        view.tampilkanPesan(">> Hewan berhasil ditambahkan!");
    }

    // =========================
    // TAMPILKAN HEWAN
    // =========================
    public void tampilkanHewan() {

        ArrayList<Hewan> daftarHewan =
                service.getDaftarHewan();

        if (daftarHewan.isEmpty()) {

            view.tampilkanPesan(">> Belum ada data hewan.");
            return;
        }

        for (Hewan h : daftarHewan) {

            view.tampilkanPesan("ID Hewan: " + h.getIdHewan());

            view.tampilkanPesan("Nama Hewan: " + h.getNamaHewan());

            view.tampilkanPesan("Info Hewan: " + h.getInfo());

            if (h instanceof Kucing) {

                Kucing k = (Kucing) h;

                view.tampilkanPesan("Jenis Hewan: Kucing");

                view.tampilkanPesan("Ras: " + k.getRas());

            } else if (h instanceof Anjing) {

                Anjing a = (Anjing) h;

                view.tampilkanPesan("Jenis Hewan: Anjing");

                view.tampilkanPesan("Ras: " + a.getRas());

            } else if (h instanceof Kelinci) {

                Kelinci k = (Kelinci) h;

                view.tampilkanPesan("Jenis Hewan: Kelinci");

                view.tampilkanPesan("Ras: " + k.getRasKelinci());

            } else if (h instanceof Hamster) {
                Hamster hm = (Hamster) h;

                view.tampilkanPesan("Jenis Hewan: Hamster");

                view.tampilkanPesan("Ras: " + hm.getRasHamster());
            }

            view.tampilkanPesan("----------------------------");
        }
    }

    // =========================
    // HAPUS HEWAN
    // =========================
    public void hapusHewan() {

        ArrayList<Hewan> daftarHewan =
                service.getDaftarHewan();

        view.tampilkanInput("Masukkan ID Hewan: ");

        if (!scanner.hasNextInt()) {

            view.tampilkanPesan(">> ID hewan harus berupa angka!");

            scanner.nextLine();
            return;
        }

        int idTarget = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < daftarHewan.size(); i++) {

            if (daftarHewan.get(i).getIdHewan()
                    == idTarget) {

                daftarHewan.remove(i);

                view.tampilkanPesan(">> Hewan berhasil dihapus!");
                return;
            }
        }

        view.tampilkanPesan(">> Hewan tidak ditemukan!");
    }

    // =========================
    // UPDATE HEWAN
    // =========================
    public void updateHewan() {

        ArrayList<Hewan> daftarHewan =
                service.getDaftarHewan();

        view.tampilkanInput ("Masukkan ID Hewan: ");

        if (!scanner.hasNextInt()) {

            view.tampilkanPesan(">> ID hewan harus berupa angka!");

            scanner.nextLine();
            return;
        }

        int idTarget = scanner.nextInt();
        scanner.nextLine();

        for (Hewan h : daftarHewan) {

            if (h.getIdHewan() == idTarget) {

                view.tampilkanInput("Nama Hewan Baru: ");

                String namaBaru =
                        scanner.nextLine();

                if (namaBaru.isEmpty()) {

                    view.tampilkanPesan(">> Nama hewan tidak boleh kosong!");
                    return;
                }

                h.setNamaHewan(namaBaru);

                view.tampilkanPesan(">> Data hewan berhasil diperbarui!");

                return;
            }
        }

        view.tampilkanPesan(">> Hewan tidak ditemukan!");
    }

    // =========================
    // TAMBAH PENITIPAN
    // =========================
    public void tambahPenitipan() {

        ArrayList<Hewan> daftarHewan =
                service.getDaftarHewan();

        ArrayList<Penitipan> daftarPenitipan =
                service.getDaftarPenitipan();

        view.tampilkanInput("ID Penitipan: ");

        if (!scanner.hasNextInt()) {

            view.tampilkanPesan(">> ID penitipan harus berupa angka!");

            scanner.nextLine();
            return;
        }

        int idPenitipan = scanner.nextInt();

        if (idPenitipan <= 0) {

            view.tampilkanPesan(">> ID penitipan tidak valid!");

            scanner.nextLine();
            return;
        }

        for (Penitipan p : daftarPenitipan) {
            if (p.getIdPenitipan()
                    == idPenitipan) {
                view.tampilkanPesan(">> ID penitipan sudah digunakan!");
                scanner.nextLine();
                return;
            }
        }

        view.tampilkanInput("ID Hewan: ");
        if (!scanner.hasNextInt()) {
            view.tampilkanPesan(">> ID hewan harus berupa angka!");
            scanner.nextLine();
            return;
        }

        int idHewan = scanner.nextInt();
        scanner.nextLine();
        if (idHewan <= 0) {
            view.tampilkanPesan(">> ID hewan tidak valid!");
            return;
        }

        boolean hewanDitemukan = false;
        for (Hewan h : daftarHewan) {
            if (h.getIdHewan() == idHewan) {
                hewanDitemukan = true;
                break;
            }
        }

        if (!hewanDitemukan) {
            view.tampilkanPesan(">> ID hewan belum terdaftar!");
            return;
        }

        view.tampilkanInput("Tanggal Masuk: ");

        String tanggalMasuk =
                scanner.nextLine();

        if (tanggalMasuk.isEmpty()) {
            view.tampilkanPesan(">> Tanggal masuk tidak boleh kosong!");
            return;
        }

        view.tampilkanInput("Lama Penitipan (hari): ");
        if (!scanner.hasNextInt()) {
            view.tampilkanPesan(">> Lama penitipan harus berupa angka!");

            scanner.nextLine();
            return;
        }

        int lamaPenitipan =
                scanner.nextInt();

        if (lamaPenitipan <= 0) {

            view.tampilkanPesan(">> Lama penitipan harus lebih dari 0 hari!");
            scanner.nextLine();
            return;
        }

        scanner.nextLine();

        Penitipan penitipanBaru =
                new Penitipan(
                        idPenitipan,
                        idHewan,
                        tanggalMasuk,
                        lamaPenitipan
                );

        daftarPenitipan.add(penitipanBaru);

        view.tampilkanPesan(">> Data penitipan berhasil ditambahkan!");
    }

    // =========================
    // TAMPILKAN PENITIPAN
    // =========================
    public void tampilkanPenitipan() {

        ArrayList<Penitipan> daftarPenitipan =
                service.getDaftarPenitipan();

        ArrayList<Hewan> daftarHewan =
            service.getDaftarHewan();
        
        if (daftarPenitipan.isEmpty()) {
            view.tampilkanPesan(">> Belum ada data penitipan.");
            return;
        }

        for (Penitipan p : daftarPenitipan) {

            view.tampilkanPesan("ID Penitipan: " + p.getIdPenitipan());
            view.tampilkanPesan("ID Hewan: " + p.getIdHewan());
            view.tampilkanPesan("Tanggal Masuk: " + p.getTanggalMasuk());
            view.tampilkanPesan("Lama Penitipan: " + p.getLamaPenitipan() + " hari");

            
             // PEMANGGILAN OVERLOADING
            for (Hewan h : daftarHewan) {
                if (h.getIdHewan() == p.getIdHewan()) {
                    h.infoPenitipan();
                    h.infoPenitipan(p.getLamaPenitipan());
                    break;
                }
            }

            view.tampilkanPesan("-----------------------------------------------");
        }
    }

    // =========================
    // HAPUS PENITIPAN
    // =========================
    public void hapusPenitipan() {

        ArrayList<Penitipan> daftarPenitipan =
                service.getDaftarPenitipan();

        view.tampilkanInput("Masukkan ID Penitipan: ");

        if (!scanner.hasNextInt()) {

            view.tampilkanPesan(">> ID penitipan harus berupa angka!");

            scanner.nextLine();
            return;
        }

        int idTarget = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0;
                i < daftarPenitipan.size();
                i++) {

            if (daftarPenitipan.get(i)
                    .getIdPenitipan() 
                    == idTarget) {

                daftarPenitipan.remove(i);
                view.tampilkanPesan(">> Data penitipan berhasil dihapus!");
                return;
            }
        }

        view.tampilkanPesan(">> Data penitipan tidak ditemukan!");
    }

    // =========================
    // UPDATE PENITIPAN
    // =========================
    public void updatePenitipan() {

        ArrayList<Penitipan> daftarPenitipan =
                service.getDaftarPenitipan();

        view.tampilkanInput("Masukkan ID Penitipan: ");

        if (!scanner.hasNextInt()) {
            view.tampilkanPesan(">> ID penitipan harus berupa angka!");
            scanner.nextLine();
            return;
        }

        int idTarget = scanner.nextInt();
        scanner.nextLine();

        for (Penitipan p : daftarPenitipan) {

            if (p.getIdPenitipan()
                    == idTarget) {

                view.tampilkanInput("Tanggal Masuk Baru: ");

                String tanggalBaru =
                        scanner.nextLine();

                view.tampilkanInput("Lama Penitipan Baru: ");

                if (!scanner.hasNextInt()) {
                    view.tampilkanPesan(">> Lama penitipan harus berupa angka!");
                    scanner.nextLine();
                    return;
                }

                int lamaBaru =
                        scanner.nextInt();

                scanner.nextLine();

                p.setTanggalMasuk(tanggalBaru);
                p.setLamaPenitipan(lamaBaru);

                view.tampilkanPesan(">> Data penitipan berhasil diperbarui!");

                return;
            }
        }

        view.tampilkanPesan(">> Data penitipan tidak ditemukan!");
    }

    // =========================
    // CARI HEWAN
    // =========================
    public void cariHewan() {

        ArrayList<Hewan> daftarHewan =
                service.getDaftarHewan();

        view.tampilkanInput("Masukkan ID Hewan yang dicari: ");

        if (!scanner.hasNextInt()) {
            view.tampilkanPesan(">> ID hewan harus berupa angka!");
            scanner.nextLine();
            return;
        }

        int idTarget = scanner.nextInt();
        scanner.nextLine();

        for (Hewan h : daftarHewan) {

            if (h.getIdHewan() == idTarget) {

                view.tampilkanPesan("=== DATA HEWAN DITEMUKAN ===");
                view.tampilkanPesan("ID Hewan: " + h.getIdHewan());
                view.tampilkanPesan("Nama Hewan: " + h.getNamaHewan());

                if (h instanceof Kucing) {
                    Kucing k = (Kucing) h;

                    view.tampilkanPesan("Jenis Hewan: Kucing");
                    view.tampilkanPesan("Ras: " + k.getRas());

                } else if (h instanceof Anjing) {

                    Anjing a = (Anjing) h;

                    view.tampilkanPesan("Jenis Hewan: Anjing");

                    view.tampilkanPesan("Ras: " + a.getRas());

                } else if (h instanceof Kelinci) {

                    Kelinci k = (Kelinci) h;

                    view.tampilkanPesan("Jenis Hewan: Kelinci");
                    view.tampilkanPesan("Ras: " + k.getRasKelinci());

                } else if (h instanceof Hamster) {

                    Hamster hm = (Hamster) h;

                    view.tampilkanPesan("Jenis Hewan: Hamster");
                    view.tampilkanPesan("Ras: " + hm.getRasHamster());
                }

                return;
            }
        }

        view.tampilkanPesan(">> Hewan tidak ditemukan!");
    }
}