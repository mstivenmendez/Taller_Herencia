package taller.Banco;

public class Intereses extends Cuenta {

   protected double intereses;

   public Intereses(double saldo, String clave, double intereses) {
      super(saldo, clave);
      this.intereses = intereses;
   }
   

   public void agregarIntereses() {
      saldo += saldo * intereses;
   }


   public double getIntereses() {
      return intereses;
   }


   public void setIntereses(double intereses) {
      this.intereses = intereses;
   }

}
