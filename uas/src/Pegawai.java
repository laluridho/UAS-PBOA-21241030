public class Pegawai {
  public String nama;
  public String jabatan;
  public double pajak;
  private double gajiPokok;
  private double gajiBersih;


  public Pegawai(String nama, String jabatan, double pajak) {
    this.nama = nama;
    this.jabatan = jabatan;
    this.pajak = pajak;
  }


  public void setGajiPokok(double gajiPokok) {
    this.gajiPokok = gajiPokok;
  }


  public double getGajiBersih() {
    return gajiBersih;
  }

  void display (){
    gajiBersih =  (gajiPokok*pajak) - gajiPokok;
    System.out.println("Nama : " + nama);
    System.out.println("Jabatan : " + jabatan);
    System.out.println("Gaji Bersih " + gajiBersih);
  }
  
  public static void main(String[] args) {
    Pegawai pegawai = new Pegawai("Adam", "Direktur", 5000);
    pegawai.setGajiPokok(20.000000);
    pegawai.display();
  }
}
