package planos;

public class PlanoIntermediario implements PlanoSaude {

  private int consultasExtras;

  public PlanoIntermediario(int consultasExtras) {
    this.consultasExtras = consultasExtras;
  }

  private int calcularConsultasExtras(int consultasExtras) {
    return consultasExtras > 5 ? (consultasExtras - 5) * 20 : 0;
  }

  @Override
  public double calcularMensalidade() {
    return 150 + this.calcularConsultasExtras(this.consultasExtras);
  }
  
  @Override
  public double calcularMensalidade(int desconto) {
    double mensalidade = 150 + this.calcularConsultasExtras(this.consultasExtras);
    return mensalidade - (mensalidade * ((double)desconto / 100));
  }

  @Override
  public String cobertura() {
    return "Consultas e exames básicos e 5 consultas extras gratuitas.";
  }


}