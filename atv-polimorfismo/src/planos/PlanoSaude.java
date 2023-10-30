package planos;

public interface PlanoSaude {
  String cobertura();
  double calcularMensalidade();
  double calcularMensalidade(int desconto);
}
