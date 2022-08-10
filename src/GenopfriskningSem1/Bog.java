package GenopfriskningSem1;

public class Bog {

  private String isbn;
  private String titel;
  private int udgivelsesår;

  public Bog(String isbn, String titel, int udgivelsesår) {
    this.isbn = isbn;
    this.titel = titel;
    this.udgivelsesår = udgivelsesår;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public void setTitel(String titel) {
    this.titel = titel;
  }

  public void setUdgivelsesår(int udgivelsesår) {
    this.udgivelsesår = udgivelsesår;
  }

  public String getIsbn() {
    return isbn;
  }

  public String getTitel() {
    return titel;
  }

  public int getUdgivelsesår() {
    return udgivelsesår;
  }


  public String toString(){
    return isbn + " " + titel + " " + udgivelsesår + "\n" ;
  }


}
