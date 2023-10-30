package produtos;

public class Furadeira extends Produto {
  String fabricante;
  String cor;
  int voltagem;
  int rpm;

  public Furadeira(String fabricante, String cor, int voltagem, int rpm) {
    this.fabricante = fabricante;
    this.cor = cor;
    this.voltagem = voltagem;
    this.rpm = rpm;
  }

  @Override
  public String toString() {
    return "Furadeira [fabricante=" + fabricante + ", cor=" + cor + ", voltagem=" + voltagem + ", rpm=" + rpm + "]";
  }

}
