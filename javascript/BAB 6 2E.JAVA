Public class Lagu {
  private String band;
  private String judul;

  public void isiParam (String judul, String band) {
    this.judul = judul;
    this.band = band;
  }

  public void cetakKelayar() {
    if (judul==null && band==null) return;
    System.out.println("Judul: " + judul + "\nBand : " + pencipta);
  }
}

Public class DemoLagu {
  Public static void main (String[] args) {
    Lagu song = new Lagu ();
    song.isiParam("Dance Beside", "All American Reject");
    song.cetakKeLayar();
  }
}