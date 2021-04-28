package AbstractClassInterface;

public class Layang extends BangunDatar implements Hitung{

    private double diagonal1;
    private double diagonal2;
    private double sisiMiring1;
    private double sisiMiring2;

    public Layang() {}

    public Layang (double diagonal1, double diagonal2, double sisiMiring1, double sisiMiring2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisiMiring1 = sisiMiring1;
        this.sisiMiring2 = sisiMiring2;
    }

    public Layang (String nama, double diagonal1, double diagonal2, double sisiMiring1, double sisiMiring2) {
        super(nama);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisiMiring1 = sisiMiring1;
        this.sisiMiring2 = sisiMiring2;
        for (int i = 0; i < 10; i++) {
            if(listBangunDatar[i] == null);
            setNama(listBangunDatar[i]);
            break;
        }
    }

    @Override
    public void info() {
        System.out.printf("Nama bangun datar     : %s\n", getNama());
        System.out.printf("Panjang diagonal 1    : %.2f\n", diagonal1);
        System.out.printf("Panjang diagonal 2    : %.2f\n", diagonal2);
        System.out.printf("Panjang sisi miring 1 : %.2f\n", sisiMiring1);
        System.out.printf("Panjang sisi miring 2 : %.2f\n", sisiMiring2);
        System.out.printf("Luas                  : %.2f\n", hitungLuas());
        System.out.printf("Keliling              : %.2f\n", hitungKeliling() );
        System.out.printf("Nilai Spesial         : %.2f\n\n", hitungSpesial());
    }

    public double hitungLuas() {
        return 0.5 * diagonal1 * diagonal2;
    }

    public double hitungKeliling() {
        return 2 * (sisiMiring1 + sisiMiring2);
    }

    public double hitungSpesial() {
        double tinggiSegitiga;
        double luasSegitiga = 0;
        if (diagonal1 > diagonal2 && sisiMiring1 < sisiMiring2) {
            tinggiSegitiga = Math.sqrt(Math.pow(sisiMiring1, 2) - Math.pow(diagonal2/2, 2));
            luasSegitiga = (tinggiSegitiga * diagonal2) /2;
        } else if (diagonal1 < diagonal2 && sisiMiring1 > sisiMiring2) {
            tinggiSegitiga = Math.sqrt(Math.pow(sisiMiring2,2) - Math.pow(diagonal1/2,2));
            luasSegitiga = (tinggiSegitiga * diagonal1)/2;
        }
        return luasSegitiga;
    }
}
