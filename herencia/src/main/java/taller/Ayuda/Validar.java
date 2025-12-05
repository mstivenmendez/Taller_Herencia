package taller.Ayuda;

import javax.swing.JOptionPane;

public class Validar {

   public Integer solicitarEntero(String ingreso, int valor) {

      if (ingreso == null) {
         JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
         return -1;
      }

      ingreso = ingreso.trim();

      if (ingreso.isEmpty()) {
         JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
         return -1;
      }

      try {
         int numero = Integer.parseInt(ingreso);

         if (numero > valor || numero < 0) {
            JOptionPane.showMessageDialog(null, "Número fuera del rango.");
            return -1;
         }

         return numero;

      } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null, "Debe ingresar un número entero.");
         return -1;
      }
   }

   public Double solicitarDouble(String ingreso, double valor) {

      if (ingreso == null) {
         JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
         return -1.0;
      }

      ingreso = ingreso.trim();

      if (ingreso.isEmpty()) {
         JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
         return -1.0;
      }

      try {
         double numero = Double.parseDouble(ingreso);

         if (numero > valor || numero < 0) {
            JOptionPane.showMessageDialog(null, "Número fuera del rango.");
            return -1.0;
         }

         return numero;

      } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null, "Debe ingresar un número.");
         return -1.0;
      }
   }

}
