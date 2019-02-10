package telkomuniversity.ac.id.adieb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nama;
        int nim, pil;

        Doubly db = new Doubly();
        Scanner inp = new Scanner(System.in);

        do {
            System.out.println("\n========================");
            System.out.println("Menu\n" +
                    "Masukkan Pilihan: \n" +
                    "1. Insert First\n" +
                    "2. Insert Last\n" +
                    "3. View From First\n" +
                    "4. View From Last\n" +
                    "5. Keluar");
            System.out.print("Pilihan Anda: ");
            pil = inp.nextInt();

            switch (pil) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    nama = inp.next();
                    System.out.print("Masukkan NIM : ");
                    nim = inp.nextInt();
                    Mahasiswa mhs = new Mahasiswa(nama, nim);
                    db.insertDepan(mhs);
                    break;
                case 2:
                    System.out.print("Masukkan Nama: ");
                    nama = inp.next();
                    System.out.print("Masukkan NIM : ");
                    nim = inp.nextInt();
                    Mahasiswa mhs1 = new Mahasiswa(nama, nim);
                    db.insertBelakang(mhs1);
                    break;
                case 3:
                    db.lihatData();
                    break;
                case 4:
                    db.lihatBelakang();
                    break;
                case 5:

                    break;

            }

        } while (pil != 5);
    }
}
