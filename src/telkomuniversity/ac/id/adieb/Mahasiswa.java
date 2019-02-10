package telkomuniversity.ac.id.adieb;

public class Mahasiswa {
    private String nama;
    private int nim;

    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void lihat() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim + "\n");
    }
}
