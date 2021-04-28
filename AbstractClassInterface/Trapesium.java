package AbstractClassInterface;

public class Trapesium extends BangunDatar implements Hitung{

    private double alasAtas;
    private double alasBawah;
    private double tinggi;

    public Trapesium() {

    }

    public Trapesium(String nama, double alasAtas, double alasBawah, double tinggi) {
        super(nama);
        this.alasAtas = alasAtas;
        this.alasBawah = alasBawah;
        this.tinggi = tinggi;

    }

    public Trapesium(double alasAtas, double alasBawah, double tinggi) {
        this.alasAtas = alasAtas;
        this.alasBawah = alasBawah;
        this.tinggi = tinggi;
    }

    public double getAlasAtas() {
        return alasAtas;
    }

    public void setAlasAtas(double alasAtas) {
        this.alasAtas = alasAtas;
    }

    public double getAlasBawah() {
        return alasBawah;
    }

    public void setAlasBawah(double alasBawah) {
        this.alasBawah = alasBawah;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public void info() {
        System.out.printf("Nama bangun datar     : %s\n", getNama());
        System.out.printf("Panjang alas atas     : %.2f\n", alasAtas);
        System.out.printf("Panjang alas bawah    : %.2f\n" ,alasBawah);
        System.out.printf("Tinggi                : %.2f\n" ,tinggi);
        System.out.printf("Luas                  : %.2f\n", hitungLuas());
        System.out.printf("Keliling              : %.2f\n", hitungKeliling() );
        System.out.printf("Nilai Spesial         : %.2f\n\n", hitungSpesial());
    }

    @Override
    public double hitungLuas() {
        return ((alasAtas+alasBawah) * tinggi) /2;
    }

    @Override
    public double hitungKeliling() {
        double sisiMiring;
        sisiMiring =Math.sqrt((Math.pow(((alasBawah - alasAtas) / 2), 2) + Math.pow(tinggi,2)));
        return (2 * sisiMiring) + alasAtas + alasBawah;
    }

    @Override
    public double hitungSpesial() {
        if (alasAtas > alasBawah) {
            return alasBawah * tinggi;
        } else {
            return alasAtas * tinggi;
        }
    }
}
