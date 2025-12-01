package taller.Dispositivo;

import taller.Ayuda.IDescribir;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class Telefono extends Dispositivo implements IDescribir{

   String version;
   LocalDateTime fechaCreacion;



   public String getVersion() {
      return version;
   }

   public void setVersion(String version) {
      this.version = version;
   }

   public LocalDateTime getFechaCreacion() {
      return fechaCreacion;
   }

   public void setFechaCreacion(LocalDateTime fechaCreacion) {
      this.fechaCreacion = fechaCreacion;
   }

   public Telefono(String marca, String modelo, String sistemaOperativo, int almacenamiento, int ram, String version,
         LocalDateTime fechaCreacion) {
      super(marca, modelo, sistemaOperativo, almacenamiento, ram);
      this.version = version;
      this.fechaCreacion = fechaCreacion;
   }

   public void Describir() {
      JOptionPane.showMessageDialog(null, " soy un mac ");
   }



}
