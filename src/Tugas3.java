import java.util.LinkedList;

public class Tugas3 {

    public static void main(String[] args) {
        // linkedlist
        LinkedList<String> No_Bp = new LinkedList<String>();
        LinkedList<String> Nama_Mahasiswa = new LinkedList<String>();
        LinkedList<String> Alamat = new LinkedList<String>();

        // operasi likedlist (add)
        // data no bp
        No_Bp.add("2111522021");
        No_Bp.add("2111521001");
        No_Bp.add("2111522011");
        No_Bp.add("2111523021");
        No_Bp.add("2111527001");

        // data nama
        Nama_Mahasiswa.add("Nadini");
        Nama_Mahasiswa.add("Lydia");
        Nama_Mahasiswa.add("Budi");
        Nama_Mahasiswa.add("Annisa");
        Nama_Mahasiswa.add("Reza");

        // data alamat
        Alamat.add("Jl. Alai Timur B/11");
        Alamat.add("Jl. yogyakarta No.7");
        Alamat.add("Jl. Ahmad Yani");
        Alamat.add("Jl. Khatib Sulaiman No. 128");
        Alamat.add("Jl. Jati No. 47");

        // operasi linkedlist(get) = menampilkan data
        System.out.println("Data Mahasiswa : ");
        System.out.println("No Bp\t\t| Nama\t\t| Alamat ");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < No_Bp.size(); i++) {
            if (i == 1 || i == 2 || i == 4) {
                System.out.println(
                        No_Bp.get(i) + "\t| " + Nama_Mahasiswa.get(i) + "\t\t|" + Alamat.get(i));
            } else {
                System.out.println(No_Bp.get(i) + "\t| " + Nama_Mahasiswa.get(i) + "\t|" + Alamat.get(i));
            }
        }
        System.out.println("\n");

        // operasi linkedlist indexof
        var IndexNoBp = No_Bp.indexOf("2111522021");
        System.out.println("index dari data No Bp '211522021' \t\t\t: index ke-" + IndexNoBp);
        var IndexNama = Nama_Mahasiswa.indexOf("nadhila");
        System.out.println("index dari data Nama Mahasiswa 'nadini' : index ke" + IndexNama);
        var IndexAlamat = Alamat.indexOf("Jl. Jati No. 47");
        System.out.println("index dara data Alamat 'Jl. Jati No. 47 : index ke-" + IndexAlamat + "\n");

        // operasi offer (menambahkan elemen terakhir)
        No_Bp.offer("2111513009");
        System.out.println("Data No_Bp setelah offer \t\t\t\t\t\t\t\t: " + No_Bp);
        Nama_Mahasiswa.offerFirst("Nadhila");
        System.out.println("Data Nama_Mahasiswa setelah offer first : " + Nama_Mahasiswa);
        Alamat.offerLast("Jl. Limau manis D/10");
        System.out.println("Data Alamat setelah offer last \t\t\t\t\t: " + Alamat + "\n");

        // operasi poll(menghapus elemen)
        No_Bp.poll(); // hapus elemen pertama
        System.out.println("Data No_Bp setelah poll \t\t\t\t\t\t\t\t: " + No_Bp);
        Nama_Mahasiswa.pollLast();
        System.out.println("Data Nama_Mahasiswa setelah pollLast \t\t: " + Nama_Mahasiswa);
        Alamat.pollFirst();
        System.out.println("Data Alamat setelah pollFirst \t\t\t\t\t: " + Alamat + "\n");

        // operasi push (nambah elemen pertama)
        No_Bp.push("211151000");
        System.out.println("Data No_Bp setelah push \t\t\t\t\t\t\t\t: " + No_Bp);
        Nama_Mahasiswa.push("Alexandra");
        System.out.println("Data Nama Mahasiswa setelah push \t\t\t\t: " + Nama_Mahasiswa);
        Alamat.push("Jl. Ulak Karang Selatan J.11");
        System.out.println("Data Alamat setelah push \t\t\t\t\t\t\t\t: " + Alamat + "\n");

        // operasi pop
        No_Bp.pop();
        System.out.println("Data No_Bp setelah pop \t\t\t\t\t\t\t\t\t: " + No_Bp);
        Nama_Mahasiswa.pop();
        System.out.println("Data Nama Mahasiswa setelah pop \t\t\t\t: " + Nama_Mahasiswa);
        Alamat.pop();
        System.out.println("Data Alamat setelah pop \t\t\t\t\t\t\t\t: " + Alamat + "\n");

        // operasi size
        System.out.println("Ukuran data No_Bp \t\t\t\t\t\t\t\t\t\t\t: " + No_Bp.size());
        System.out.println("Ukuran data Nama_Mahasiswa \t\t\t\t\t\t\t: " + Nama_Mahasiswa.size());
        System.out.println("Ukuran data Alamat \t\t\t\t\t\t\t\t\t\t\t: " + Alamat.size() + "\n");

        // operasi set
        No_Bp.set(1, "2111522021");
        System.out.println("Data No_Bp setelah set index 1 \t\t\t\t\t: " + No_Bp);
        Nama_Mahasiswa.set(3, "Alexandra");
        System.out.println("Data Nama_Mahasiswa setelah set index 3 : " + Nama_Mahasiswa);
        Alamat.set(2, "Jl. Purus 1 No.20");
        System.out.println("Data Alamat setelah set index 2 \t\t\t\t: " + Alamat + "\n");

        // hasil data final
        System.out.println("Data Mahasiswa : ");
        System.out.println("No Bp\t\t\t\t| \tNama\t\t| Alamat ");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < No_Bp.size(); i++) {
            if (i == 1 || i == 4) {
                System.out.println(
                        No_Bp.get(i) + "\t| " + Nama_Mahasiswa.get(i) + "\t\t|" + Alamat.get(i));
            } else if (i == 0) {
                System.out.println(No_Bp.get(i) + "\t| " + Nama_Mahasiswa.get(i) + "\t\t|" + Alamat.get(i));
            } else if (i == 2) {
                System.out.println(No_Bp.get(i) + "\t| " + Nama_Mahasiswa.get(i) + "\t\t\t|" + Alamat.get(i));
            } else {
                System.out.println(No_Bp.get(i) + "\t| " + Nama_Mahasiswa.get(i) + "\t|" + Alamat.get(i));
            }
        }
        System.out.println("\n");

    }
}