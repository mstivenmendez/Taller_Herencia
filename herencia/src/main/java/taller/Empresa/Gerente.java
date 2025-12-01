package taller.Empresa;

public class Gerente extends Empleado {
private String departamento;

   public Gerente(String nombre, int edad, double salario, String departamento) {
      super(nombre, edad, salario);
      this.departamento = departamento;
   }

   public String getDepartamento() {
      return departamento;
   }

   public void setDepartamento(String departamento) {
      this.departamento = departamento;
   }


}
