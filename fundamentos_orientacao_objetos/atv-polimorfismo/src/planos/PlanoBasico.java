package planos;

public class PlanoBasico implements PlanoSaude {

  @Override
  public double calcularMensalidade() {
    return 100;
  }

  @Override
  public double calcularMensalidade(int desconto) {
    double mensalidade = 100;
    return mensalidade - (mensalidade * ((double)desconto / 100));
  }

  @Override
  public String cobertura() {
    return "Consultas e exames básicos.";
  }

}
