package taller.Persona;

import javax.swing.JOptionPane;

public class Estudiante extends Persona{

   private String grado;

   public Estudiante(String nombre, int edad, String grado) {
      super(nombre, edad);
      this.grado = grado;
   }

   public String getGrado() {
      return grado;
   }

   public void setGrado(String grado) {
      this.grado = grado;
   }

   public void estudiar() {
      JOptionPane.showMessageDialog(null, getNombre() + " está estudiando para el grado " + grado);
   }

}
