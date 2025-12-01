package taller.Vehiculo;
import javax.swing.JOptionPane;

public abstract class Vehiculo {
   String color, tamaño, placa, numeroSerie, marca, tipoMotor;
   Double peso, ancho, altura, cilindraje;

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public String getTamaño() {
      return tamaño;
   }

   public void setTamaño(String tamaño) {
      this.tamaño = tamaño;
   }

   public String getPlaca() {
      return placa;
   }

   public void setPlaca(String placa) {
      this.placa = placa;
   }

   public String getNumeroSerie() {
      return numeroSerie;
   }

   public void setNumeroSerie(String numeroSerie) {
      this.numeroSerie = numeroSerie;
   }

   public String getMarca() {
      return marca;
   }

   public void setMarca(String marca) {
      this.marca = marca;
   }

   public String getTipoMotor() {
      return tipoMotor;
   }

   public void setTipoMotor(String tipoMotor) {
      this.tipoMotor = tipoMotor;
   }

   public Double getPeso() {
      return peso;
   }

   public void setPeso(Double peso) {
      this.peso = peso;
   }

   public Double getAncho() {
      return ancho;
   }

   public void setAncho(Double ancho) {
      this.ancho = ancho;
   }

   public Double getAltura() {
      return altura;
   }

   public void setAltura(Double altura) {
      this.altura = altura;
   }

   public Double getCilindraje() {
      return cilindraje;
   }

   public void setCilindraje(Double cilindraje) {
      this.cilindraje = cilindraje;
   }

   public Vehiculo(String color, String tamaño, String placa, String numeroSerie, String marca, String tipoMotor,
         Double peso, Double ancho, Double altura, Double cilindraje) {
      this.color = color;
      this.tamaño = tamaño;
      this.placa = placa;
      this.numeroSerie = numeroSerie;
      this.marca = marca;
      this.tipoMotor = tipoMotor;
      this.peso = peso;
      this.ancho = ancho;
      this.altura = altura;
      this.cilindraje = cilindraje;
   }

   public Vehiculo() {
   }

   public void Movimiento() {
      JOptionPane.showMessageDialog(null, "Estoy en Movimiento");
   }
}
