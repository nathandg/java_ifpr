## Atividade Polimorfismo

### Descrição:
Suponha que temos uma interface chamada PlanoSaude com um método double calcularMensalidade().
Há três tipos de planos de saúde que implementam essa
interface: PlanoBasico, PlanoIntermediario e PlanoPremium.
Cada plano tem uma
lógica diferente para calcular sua mensalidade.

 * PlanoBasico: possui uma mensalidade fixa de R$ 100.
 * PlanoIntermediario: possui uma mensalidade fixa de R$ 150 e dá direito a 5
consultas por mês. A cada consulta extra, o valor da mensalidade aumenta em R$20.
 * PlanoPremium: possui uma mensalidade fixa de R$ 250 e dá direito a consultas
ilimitadas, mas também possui uma anuidade de R$ 500, que é distribuída ao longo
das mensalidades.

### Código Base:
```java
public interface PlanoSaude {
  double calcularMensalidade();
}
public class PlanoBasico implements PlanoSaude {
  @Override
  public double calcularMensalidade() {
    return 100;
  }
}

public class PlanoIntermediario implements PlanoSaude {

  private int consultasExtras;

  public PlanoIntermediario(int consultasExtras) {
    this.consultasExtras = consultasExtras;
  }

  @Override
    public double calcularMensalidade() {
      return 150 + (consultasExtras > 5 ? (consultasExtras - 5) * 20 : 0);
  }
}

public class PlanoPremium implements PlanoSaude {
  @Override
  public double calcularMensalidade() {
    return 250 + (500.0/12);
  } 
}
```

### Exercício:

#### Implemente uma classe Cliente que possui um atributo do tipo PlanoSaude.
 - Crie um método mostrarMensalidade que imprima a mensalidade do plano do cliente
  utilizando polimorfismo.

 - No método main, crie clientes com diferentes planos e mostre suas mensalidades.

### Cobertura de Planos de Saúde
 - Amplie o exemplo anterior, adicionando um método cobertura na interface
   PlanoSaude, que retorna uma String descrevendo a cobertura do plano.

 - Implemente o método cobertura para cada plano.
   No método main, além de mostrar a mensalidade, mostre também a cobertura de
   cada plano.

### Desconto na Mensalidade
 - Permita que os clientes possam ter um desconto em suas mensalidades. O desconto
   será um valor percentual que será aplicado sobre a mensalidade.

 - Modifique o método calcularMensalidade para aceitar um desconto.
   No método main, dê descontos a alguns clientes e mostre a mensalidade após o
   desconto.