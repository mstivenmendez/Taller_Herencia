package taller.Ave;

import javax.swing.JOptionPane;

public class Aguila extends Aves implements IAves {



   public Aguila(String nombre, String especie, String color, int peso) {
      super(nombre, especie, color, peso);
   }

   @Override
   public void Volar() {
      JOptionPane.showMessageDialog(null, " VOLAR ");
   }




}
