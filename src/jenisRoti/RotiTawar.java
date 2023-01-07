package jenisRoti;

import modalRoti.Roti;
import varianRoti.Varian1;
import varianRoti.Varian2;

public class RotiTawar extends Roti implements Varian1, Varian2 {

    // Atribut untuk menerima data varian (total bahan, dan total harga)
    public double totalBahanVarian;
    public double totalHargaVarian;

    // Atribut untuk membuat format table
    private final String strFormat = "||%1$-4s%2$-24s %3$-16s %4$-16s ||\n";
    private final String strFormatTotal = "||%1$-28s %2$-16s %3$-17s||\n";
    private final String formatBil = "%1$-30s %2$-20s %3$-20s\n";

    // Method untuk menghitung banyaknya bahan yang harus disediakan
    @Override
    public double totalBahanAdonanRoti() {
        double total = this.tepung + this.gula + this.butter + this.ragi + this.susuBubuk + this.susuCair + this.telur + this.esBatu;
        return total;
    }

    @Override
    public double totalBahanVarian1() {
        double total = this.coklat;
        return total;
    }

    @Override
    public double totalBahanVarian2() {
        double total = this.keju;
        return total;
    }

    // Method untuk menghitung harga dari bahan yang harus disediakan
    @Override
    public double totalHargaAdonanRoti() {
        double total = this.hargaTepung + this.hargaGula + this.hargaButter + this.hargaRagi + this.hargaSusuBubuk + this.hargaSusuCair + this.hargaTelur + this.hargaEsBatu;
        return total;
    }

    @Override
    public double totalHargaVarian1() {
        double total = this.hargaCoklat;
        return total;
    }

    @Override
    public double totalHargaVarian2() {
        double total = this.hargaKeju;
        return total;
    }

    // Method untuk menampilkan hasil
    @Override
    public void tampilHasil() {

        // Atribut untuk menghitung berat (gram) bahan
        this.tepung = this.jumlah / 5.1625 * 1000;
        this.gula = this.jumlah / 5.1625 * 125;
        this.butter = this.jumlah / 5.1625 * 100;
        this.ragi = this.jumlah / 5.1625 * 20;
        this.susuBubuk = this.jumlah / 5.1625 * 250;
        this.susuCair = this.jumlah / 5.1625 * 200;
        this.telur = this.jumlah / 5.1625 * 70;
        this.esBatu = this.jumlah / 5.1625 * 300;
        this.keju = this.jumlah / 1 * 80;
        this.coklat = this.jumlah / 1 * 80;

        // Atribut untuk menghitung harga bahan
        this.hargaTepung = this.jumlah / 5.1625 * 1000 / 1000 * 40000;
        this.hargaGula = this.jumlah / 5.1625 * 125 / 1000 * 25000;
        this.hargaButter = this.jumlah / 5.1625 * 100 / 500 * 23000;
        this.hargaRagi = this.jumlah / 5.1625 * 20 / 11 * 5000;
        this.hargaSusuBubuk = this.jumlah / 5.1625 * 250 / 1000 * 39000;
        this.hargaSusuCair = this.jumlah / 5.1625 * 200 / 1000 * 24000;
        this.hargaTelur = this.jumlah / 5.1625 * 70 / 1000 * 23000;
        this.hargaEsBatu = this.jumlah / 5.1625 * 300 / 1000 * 2000;
        this.hargaKeju = this.jumlah / 1 * 80 / 250 * 31000;
        this.hargaCoklat = this.jumlah / 1 * 80 / 500 * 29000;

        System.out.println("");
        System.out.println("++===============================================================++");
        System.out.println("||                 * Rincian Adonan Roti Tawar  *                ||");
        System.out.println("++===============================================================++");
        System.out.println("\n*Bahan Adonan Roti");
        System.out.println("++----+------------------------+----------------+----------------++");
        System.out.println("|| No | Bahan                  | Berat          | Harga          ||");
        System.out.println("++----+------------------------+----------------+----------------++");
        System.out.format(strFormat, " 1.", "| Tepung Terigu", "| " + Math.round(this.tepung * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaTepung * 100.0) / 100.0);
        System.out.format(strFormat, " 2.", "| Gula", "| " + Math.round(this.gula * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaGula * 100.0) / 100.0);
        System.out.format(strFormat, " 3.", "| Butter", "| " + Math.round(this.butter * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaButter * 100.0) / 100.0);
        System.out.format(strFormat, " 4.", "| Ragi", "| " + Math.round(this.ragi * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaRagi * 100.0) / 100.0);
        System.out.format(strFormat, " 6.", "| Susu Bubuk", "| " + Math.round(this.susuBubuk * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaSusuBubuk * 100.0) / 100.0);
        System.out.format(strFormat, " 6.", "| Susu Cair", "| " + Math.round(this.susuCair * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaSusuCair * 100.0) / 100.0);
        System.out.format(strFormat, " 7.", "| Telur", "| " + Math.round(this.telur * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaTelur * 100.0) / 100.0);
        System.out.format(strFormat, " 8.", "| Es Batu", "| " + Math.round(this.esBatu * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaEsBatu * 100.0) / 100.0);
        System.out.println("++----+------------------------+----------------+----------------++");
        System.out.format(strFormatTotal, " Total Bahan Adonan", "| " + Math.round(totalBahanAdonanRoti() * 100) / 100 + " gram", "| Rp. " + Math.round(totalHargaAdonanRoti()));
        System.out.println("++-----------------------------+----------------+----------------++");

        if (this.varian == 1) {
            System.out.println("\n*Bahan Varian 1");
            System.out.println("++----+------------------------+----------------+----------------++");
            System.out.println("|| No | Bahan                  | Berat          | Harga          ||");
            System.out.println("++----+------------------------+----------------+----------------++");
            System.out.format(strFormat, " 1.", "| Filling Coklat", "| " + Math.round(this.coklat * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaCoklat * 100.0) / 100.0);
            System.out.println("++----+------------------------+----------------+----------------++");
            System.out.format(strFormatTotal, " Total Bahan Adonan", "| " + Math.round(totalBahanVarian1() * 100) / 100 + " gram", "| Rp. " + Math.round(totalHargaVarian1()));
            System.out.println("++-----------------------------+----------------+----------------++");
            totalBahanVarian = Math.round(totalBahanVarian1() * 100.0) / 100.0;
            totalHargaVarian = Math.round(totalHargaVarian1() * 100.0) / 100.0;
        } else if (this.varian == 2) {
            System.out.println("\n*Bahan Varian 2");
            System.out.println("++----+------------------------+----------------+----------------++");
            System.out.println("|| No | Bahan                  | Berat          | Harga          ||");
            System.out.println("++----+------------------------+----------------+----------------++");
            System.out.format(strFormat, " 1.", "| Filling Keju", "| " + Math.round(this.keju * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaKeju * 100.0) / 100.0);
            System.out.println("++----+------------------------+----------------+----------------++");
            System.out.format(strFormatTotal, " Total Bahan Adonan", "| " + Math.round(totalBahanVarian2() * 100) / 100 + " gram", "| Rp. " + Math.round(totalHargaVarian2()));
            System.out.println("++-----------------------------+----------------+----------------++");
            totalBahanVarian = Math.round(totalBahanVarian2() * 100.0) / 100.0;
            totalHargaVarian = Math.round(totalHargaVarian2() * 100.0) / 100.0;
        }

        // Atribut untuk menentukan harga jual roti per pcs
        double totalBahan = totalBahanAdonanRoti() + this.totalBahanVarian;
        double totalHarga = totalHargaAdonanRoti() + this.totalHargaVarian;
        double hargaJualPerPcs = (totalHarga / this.jumlah * 0.5) + (totalHarga / this.jumlah);
        System.out.println("===================================================================");
        System.out.println("                            BILL RECEIPT");
        System.out.println("===================================================================");
        System.out.format(formatBil, "ITEM", "QTY", "HARGA");
        System.out.println("-------------------------------------------------------------------");
        System.out.format(formatBil, "Bahan Adonan Roti", Math.round(totalBahanAdonanRoti() * 100.0) / 100.0 + " gram", "Rp. " + Math.round(totalHargaAdonanRoti() * 100.0) / 100.0);
        System.out.format(formatBil, "Bahan Varian " + this.varian, Math.round(this.totalBahanVarian * 100.0) / 100.0 + " gram", "Rp. " + Math.round(this.totalHargaVarian * 100.0) / 100.0);
        System.out.println("                              ___________________________________ +");
        System.out.format(formatBil, "Total ", Math.round(totalBahan * 100.0) / 100.0 + " gram", "Rp. " + Math.round(totalHarga * 100.0) / 100.0);
        System.out.println("===================================================================");
        System.out.println("\nMargin profit 50%");
        System.out.println("Harga Jual 1 pcs Roti Tawar Varian " + this.varian + " : Rp. " + Math.round(hargaJualPerPcs * 100.0) / 100.0 + "\n\n");
    }
}
