package AbstractClassInterface;

public class fungsiBangunDatar extends BangunDatar{

    public fungsiBangunDatar() {

    }

    @Override
    public void info() {
        int nomor = 1;
        System.out.println("------------- Informasi Bangun Datar -------------");
        for (int i = 0; i < listBangunDatar.length; i++) {
            if (listBangunDatar[i] == null) {
                continue;
            }
            System.out.print(nomor + ". " + listBangunDatar[i] + "\n");
            nomor++;
        }
    }
}
