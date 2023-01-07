package jenisRoti;

import modalRoti.Roti;
import varianRoti.Varian1;
import varianRoti.Varian2;
import varianRoti.Varian3;

public class RotiManis extends Roti implements Varian1, Varian2, Varian3 {

    // Atribut untuk menerima data varian (total bahan, dan total harga)
    public double totalBahanVarian;
    public double totalHargaVarian;

    // Atribut untuk membuat format table
    private final String strFormat = "||%1$-4s%2$-24s %3$-16s %4$-16s ||\n";
    private final String strFormatTotal = "||%1$-28s %2$-16s %3$-17s||\n";
    private final String formatBil = "%1$-30s %2$-20s %3$-20s\n";

    @Override
    public double totalBahanAdonanRoti() {
        double total = this.tepung + this.gula + this.butter + this.ragi + this.susuBubuk + this.susuCair + this.telur + this.esBatu;
        return total;
    }

    @Override
    public double totalHargaAdonanRoti() {
        double total = this.hargaTepung + this.hargaGula + this.hargaButter + this.hargaRagi + this.hargaSusuBubuk + this.hargaSusuCair + this.hargaTelur + this.hargaEsBatu;
        return total;
    }

    @Override
    public double totalBahanVarian1() {
        double total = this.keju + this.coklat;
        return total;
    }

    public double totalBahanVarian2() {
        double total = this.redBean + this.krimVanilla;
        return total;
    }

    public double totalBahanVarian3() {
        double total = (this.keju * 2) + this.sosis;
        return total;
    }

    @Override
    public double totalHargaVarian1() {
        double total = this.hargaKeju + this.hargaCoklat;
        return total;
    }

    @Override
    public double totalHargaVarian2() {
        double total = this.hargaRedBean + this.hargaKrimVanilla;
        return total;
    }

    @Override
    public double totalHargaVarian3() {
        double total = (this.hargaKeju * 2) + this.hargaSosis;
        return total;
    }

    // Method untuk menampilkan hasil
    @Override
    public void tampilHasil() {

        // Atribut untuk menghitung berat (gram) bahan
        this.tepung = this.jumlah / 47 * 1000;
        this.gula = this.jumlah / 47 * 150;
        this.butter = this.jumlah / 47 * 150;
        this.ragi = this.jumlah / 47 * 20;
        this.susuBubuk = this.jumlah / 47 * 300;
        this.susuCair = this.jumlah / 47 * 250;
        this.telur = this.jumlah / 47 * 80;
        this.esBatu = this.jumlah / 47 * 400;
        this.keju = this.jumlah / 1 * 5;
        this.coklat = this.jumlah / 1 * 10;
        this.redBean = this.jumlah / 1 * 10;
        this.krimVanilla = this.jumlah / 1 * 5;
        this.sosis = this.jumlah / 1 * 10;

        // Atribut untuk menghitung harga bahan
        this.hargaTepung = this.jumlah / 47 * 1000 / 1000 * 40000;
        this.hargaGula = this.jumlah / 47 * 150 / 1000 * 25000;
        this.hargaButter = this.jumlah / 47 * 150 / 500 * 23000;
        this.hargaRagi = this.jumlah / 47 * 20 / 11 * 5000;
        this.hargaSusuBubuk = this.jumlah / 47 * 300 / 1000 * 39000;
        this.hargaSusuCair = this.jumlah / 47 * 250 / 1000 * 24000;
        this.hargaTelur = this.jumlah / 47 * 80 / 1000 * 23000;
        this.hargaEsBatu = this.jumlah / 47 * 400 / 1000 * 2000;
        this.hargaKeju = this.jumlah / 1 * 5 / 250 * 31000;
        this.hargaCoklat = this.jumlah / 1 * 10 / 500 * 29000;
        this.hargaRedBean = this.jumlah / 1 * 10 / 500 * 25000;
        this.hargaKrimVanilla = this.jumlah / 1 * 5 / 500 * 30000;
        this.hargaSosis = this.jumlah / 1 * 10 / 1000 * 80000;

        System.out.println("");
        System.out.println("++===============================================================++");
        System.out.println("||                 * Rincian Adonan Roti Manis  *                ||");
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
            System.out.format(strFormat, " 1.", "| Keju", "| " + Math.round(this.keju * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaKeju * 100.0) / 100.0);
            System.out.format(strFormat, " 2.", "| Coklat", "| " + Math.round(this.coklat * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaCoklat * 100.0) / 100.0);
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
            System.out.format(strFormat, " 1.", "| RedBean", "| " + Math.round(this.redBean * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaRedBean * 100.0) / 100.0);
            System.out.format(strFormat, " 2.", "| Krim Vanilla", "| " + Math.round(this.krimVanilla * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaKrimVanilla * 100.0) / 100.0);
            System.out.println("++----+------------------------+----------------+----------------++");
            System.out.format(strFormatTotal, " Total Bahan Adonan", "| " + Math.round(totalBahanVarian2() * 100) / 100 + " gram", "| Rp. " + Math.round(totalHargaVarian2()));
            System.out.println("++-----------------------------+----------------+----------------++");
            totalBahanVarian = Math.round(totalBahanVarian2() * 100.0) / 100.0;
            totalHargaVarian = Math.round(totalHargaVarian2() * 100.0) / 100.0;
        } else if (this.varian == 3) {
            System.out.println("\n*Bahan Varian 3");
            System.out.println("++----+------------------------+----------------+----------------++");
            System.out.println("|| No | Bahan                  | Berat          | Harga          ||");
            System.out.println("++----+------------------------+----------------+----------------++");
            System.out.format(strFormat, " 1.", "| Coklat", "| " + Math.round(this.coklat * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaKeju * 100.0) / 100.0);
            System.out.format(strFormat, " 2.", "| Keju", "| " + Math.round(this.coklat * 100.0) / 100.0 + " gram", "| Rp. " + Math.round(this.hargaCoklat * 100.0) / 100.0);
            System.out.println("++----+------------------------+----------------+----------------++");
            System.out.format(strFormatTotal, " Total Bahan Adonan", "| " + Math.round(totalBahanVarian3() * 100) / 100 + " gram", "| Rp. " + Math.round(totalHargaVarian3()));
            System.out.println("++-----------------------------+----------------+----------------++");
            totalBahanVarian = Math.round(totalBahanVarian3() * 100.0) / 100.0;
            totalHargaVarian = Math.round(totalHargaVarian3() * 100.0) / 100.0;
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
        System.out.format(formatBil, "Bahan Varian " + this.varian, Math.round(this.totalBahanVarian * 100.0) / 100.0 + " gram", "Rp. " + Math.round((this.totalHargaVarian) * 100.0) / 100.0);
        System.out.println("                              ___________________________________ +");
        System.out.format(formatBil, "Total ", totalBahan + " gram", "Rp. " + Math.round(totalHarga * 100.0) / 100.0);
        System.out.println("===================================================================");
        System.out.println("\nMargin profit 50%");
        System.out.println("Harga Jual 1 pcs Roti Manis Varian " + this.varian + " : Rp. " + Math.round(hargaJualPerPcs * 100.0) / 100.0 + "\n\n");
    }
}
