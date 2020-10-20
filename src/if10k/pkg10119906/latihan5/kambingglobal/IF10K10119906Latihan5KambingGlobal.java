/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan5.kambingglobal;

/**
 *
 * @author senenngahenen
 * Nama      : Rizqy Ananda Rusmana
 * NIM       : 10119906
 * Kelas     : IF-10K
 * Deskripsi : Deklarasi Variable Instance.
 */
public class IF10K10119906Latihan5KambingGlobal {

    int jumlahKambing = 88;
    
    //Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah kambing: " + jumlahKambing );
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        IF10K10119906Latihan5KambingGlobal kambingSusu = new IF10K10119906Latihan5KambingGlobal();
        
        // Menampilkan jumlah kambing yang ada saat pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        // Menambah satu kambing
        kambingSusu.tambahKambing();
        
        // Menampilkan jumlah kambing yang ada 
        kambingSusu.getJumlahKambing();
    }
    
}
