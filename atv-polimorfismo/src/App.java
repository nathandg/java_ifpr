import java.util.ArrayList;

import clientes.Cliente;

public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("--- Planos de Saúde ---");

    Cliente cliente1 = new Cliente(
        "João",
        "123.456.789-00",
        "Rua 1, 123",
        new planos.PlanoBasico());

    Cliente cliente2 = new Cliente(
        "Maria",
        "987.654.321-00",
        "Rua 2, 456",
        new planos.PlanoIntermediario(4));
    
    Cliente cliente3 = new Cliente(
        "José",
        "111.222.333-44",
        "Rua 3, 789",
        new planos.PlanoPremium());
    
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    clientes.add(cliente1);
    clientes.add(cliente2);
    clientes.add(cliente3);

    for (Cliente cliente : clientes) {
      System.out.println("\n" + cliente);
      System.out.println(cliente.mostrarMensalidade());
      System.out.println(cliente.mostrarCobertura());
    }

    System.out.println("\n\t Calculando com desconto: ");
    for (Cliente cliente : clientes) {
      System.out.println("\n" + cliente);
      System.out.println(cliente.mostrarMensalidade(10));
    }
  }
}
