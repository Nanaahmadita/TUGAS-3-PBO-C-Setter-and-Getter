class Kendaraan {
    String namaKendaraan;
    int nomorPlat;
    String warnaKendaraan;
    boolean isParked;

    void setKendaraan(String newnama_kendaraan, int newnomor_plat, String newwarna_kendaraan, boolean newis_parked){
        this.namaKendaraan = newnama_kendaraan;
        this.nomorPlat = newnomor_plat;
        this.warnaKendaraan = newwarna_kendaraan;
        this.isParked = newis_parked;
    }

    String getNamaKendaraan(){
        return namaKendaraan;
    }

    int getNomorPlat(){
        return nomorPlat;
    }

    String getWarnaKendaraan(){
        return warnaKendaraan;
    }

    boolean getIsParked(){
        return isParked;
    }
}

class tempatParkir {
    String jenisKendaraan;
    String kodeTempatParkir;
    boolean isOpen;   

    void settempatParkir (String newjenis_kendaraan, String newkode_tempat_parkir, boolean newis_open){
        this.jenisKendaraan = newjenis_kendaraan;
        this.kodeTempatParkir = newkode_tempat_parkir;
        this.isOpen = newis_open;
    }

    String getJenisKendaraan(){
        return jenisKendaraan;
    }

    String getKodeTempatParkir(){
        return kodeTempatParkir;
    }

    boolean getIsOpen(){
        return isOpen;
    }

    void parkinglot (String kodeParkirnya){
        System.out.println(this.jenisKendaraan + " " + " tersebut nomor parkirnya adalah " + "1" + kodeParkirnya);
    }
}

public class Parkiran{
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Kendaraan();
        kendaraan1.setKendaraan("Honda Jazz", 2045, "putih", true);
        tempatParkir tempatparkir1 = new tempatParkir();
        tempatparkir1.settempatParkir("Mobil", "B", true);
        System.out.println("\n" + "----Daftar kendaraan parkir----");
        System.out.println("Kendaraan : " + kendaraan1.getNamaKendaraan());
        System.out.println("Nomor Plat : " + "B" + " " + kendaraan1.getNomorPlat() + " " + "AA");
        System.out.println("Warna : " + kendaraan1.getWarnaKendaraan());
        System.out.println("\n" + "----Parking lot----");
        System.out.println("Jenis Kendaraan : " + tempatparkir1.getJenisKendaraan());
        System.out.println("Kode Tempat Parkir : " + tempatparkir1.getKodeTempatParkir());
        System.out.println("\n");
        tempatparkir1.parkinglot(tempatparkir1.getKodeTempatParkir());
        System.out.println("\n" + "\n" + "\t" + "\t" + "Terima kasih" + "\t" );
        System.out.println("\t" + "\t" + "🚧_🚗_🚗__🚗_🚗___" + "\t" + "\n");
    }
}
