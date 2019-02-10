package telkomuniversity.ac.id.adieb;

public class Node {
    Mahasiswa mhs;
    Node prev, next;

    public Node(Mahasiswa mhs) {
        this.mhs = mhs;
    }

    public Mahasiswa getMhs() {
        return mhs;
    }

    public void setMhs(Mahasiswa mhs) {
        this.mhs = mhs;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
