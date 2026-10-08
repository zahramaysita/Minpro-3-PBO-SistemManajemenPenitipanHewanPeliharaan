package main;

import controller.HewanController;
import model.Service;
import view.HewanView;

import java.util.Scanner;

public class SistemPenitipanHewanPeliharaan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Service service = new Service();

        HewanView view = new HewanView();

        HewanController controller =
                new HewanController(service, view, scanner);

        controller.jalankanProgram();

        scanner.close();
    }
}