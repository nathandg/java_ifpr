package planos;

public class PlanoPremium implements PlanoSaude {
  @Override
  public double calcularMensalidade() {
    return 250 + (500.0 / 12);
  }

  @Override
  public double calcularMensalidade(int desconto) {
    double mensalidade = 250 + (500.0 / 12);
    return mensalidade - (mensalidade * ((double)desconto / 100));
  }
  
  @Override
  public String cobertura() {
    return "Consultas, exames e cirurgias básicas e complexas.";
  }

}
