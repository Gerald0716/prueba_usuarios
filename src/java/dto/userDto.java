/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author geral
 */
public class userDto {

    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public class registro {
    
    private String Nombre;
    private String Apellido;
    private String Email;
    private int Telefono;
    private String Ciudad;
    private String Pais;

        public registro(String Nombre, String Apellido, String Email, int Telefono, String Ciudad, String Pais) {
            this.Nombre = Nombre;
            this.Apellido = Apellido;
            this.Email = Email;
            this.Telefono = Telefono;
            this.Ciudad = Ciudad;
            this.Pais = Pais;
        }

        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String Nombre) {
            this.Nombre = Nombre;
        }

        public String getApellido() {
            return Apellido;
        }

        public void setApellido(String Apellido) {
            this.Apellido = Apellido;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String Email) {
            this.Email = Email;
        }

        public int getTelefono() {
            return Telefono;
        }

        public void setTelefono(int Telefono) {
            this.Telefono = Telefono;
        }

        public String getCiudad() {
            return Ciudad;
        }

        public void setCiudad(String Ciudad) {
            this.Ciudad = Ciudad;
        }

        public String getPais() {
            return Pais;
        }

        public void setPais(String Pais) {
            this.Pais = Pais;
        }
    
    

      
    
    }

  
    
   
    
}
