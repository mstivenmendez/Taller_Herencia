package taller.Banco;

import javax.swing.JOptionPane;

public class Cuenta {

   protected double saldo;

   public double getSaldo() {
      return saldo;
   }

   public void setSaldo(double saldo) {
      this.saldo = saldo;
   }

   public Cuenta(double saldo) {
      this.saldo = saldo;
   }

   public void Deposito (double valor) {
      saldo += valor;
   }

   public void Retiro(double valor) {
      if (valor <= saldo) {
         saldo -= valor;
      } else {
         JOptionPane.showMessageDialog(null, " Saldo insuficientte" );
      }
   }

}
