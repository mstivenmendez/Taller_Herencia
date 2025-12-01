package taller.Banco;

public class Intereses extends Cuenta {

   protected double intereses;

   public Intereses(double saldo, double intereses) {
      super(saldo);
      this.intereses = intereses;
   }

   public void agregarIntereses() {
        saldo += saldo * intereses;
   }

}
