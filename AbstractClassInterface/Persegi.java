package AbstractClassInterface;

public class Persegi extends BangunDatar implements Hitung{

    private double panjangSisi;

    public Persegi() {

    }

    public Persegi(String nama, double panjangSisi) {
        super(nama);
        this.panjangSisi = panjangSisi;

    }

    public Persegi(double panjangSisi) {
        this.panjangSisi = panjangSisi;
    }

    @Override
    public void info() {
        System.out.printf("Nama bangun datar     : %s\n", getNama());
        System.out.printf("Panjang sisi          : %.2f\n", panjangSisi);
        System.out.printf("Luas                  : %.2f\n", hitungLuas());
        System.out.printf("Keliling              : %.2f\n", hitungKeliling() );
        System.out.printf("Nilai Spesial         : %.2f\n\n", hitungSpesial());
    }

    @Override
    public double hitungLuas() {
        return Math.pow(panjangSisi,2);
    }

    @Override
    public double hitungKeliling() {
        return 4 * panjangSisi;
    }

    @Override
    public double hitungSpesial() {
        return Math.sqrt(2 * Math.pow(panjangSisi,2));
    }
}
