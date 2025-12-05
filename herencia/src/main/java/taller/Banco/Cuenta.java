package taller.Banco;

import javax.swing.JOptionPane;

public class Cuenta {
   protected double saldo;
   protected String clave;

   public Cuenta(double saldo, String clave) {
      this.saldo = saldo;
      this.clave = clave;
   }

   public double getSaldo() {
      return saldo;
   }

   public void setSaldo(double saldo) {
      this.saldo = saldo;
   }

   public String getClave() {
      return clave;
   }

   public void setClave(String clave) {
      this.clave = clave;
   }

   public void Deposito(double valor) {
      saldo += valor;
   }

   public void Retiro(double valor) {
      if (valor <= saldo) {
         saldo -= valor;
      } else {
         JOptionPane.showMessageDialog(null, "Saldo insuficiente");
      }
   }
}
