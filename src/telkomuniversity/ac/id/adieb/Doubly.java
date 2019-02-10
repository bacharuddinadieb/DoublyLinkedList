package telkomuniversity.ac.id.adieb;

public class Doubly {
    Node head, tail;

    public Doubly() {
        this.head = null;
        this.tail = null;
    }

    public void insertDepan(Mahasiswa m) {
        Node nd = new Node(m);

        if (this.head == null) {
            this.head = nd;
            this.tail = nd;
        } else {
            head.setPrev(nd);
            nd.setNext(head);
            head = nd;
        }
    }

    public void insertBelakang(Mahasiswa m) {
        Node nd = new Node(m);

        if (this.head == null) {
            this.head = nd;
            this.tail = nd;
        } else {
            tail.setNext(nd);
            nd.setPrev(tail);
            tail = nd;
        }
    }

    public void lihatBelakang() {
        if (head != null) {
            Node sem = tail;
            int urut = 1;
            while (sem != null) {
                System.out.println("Mahasiswa ke-" + urut);
                sem.getMhs().lihat();
                sem = sem.prev;
                urut++;
            }
        } else {
            System.out.println("Data Kosong");
        }
    }

    public void lihatData() {
        if (head != null) {
            Node sem = head;
            int urut = 1;
            while (sem != null) {
                System.out.println("Mahasiswa ke-" + urut);
                sem.getMhs().lihat();
                sem = sem.next;
                urut++;
            }
        } else {
            System.out.println("Data Kosong");
        }
    }
}
