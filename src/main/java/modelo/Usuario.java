package modelo;
// Generated May 25, 2018 9:36:04 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {
     private int idusuario;
     private String nombre;
     private Date fechanac;
     private String correo;
     private Boolean administrador;
     private String contrasena;
     private Boolean aceptado;
     private String imagen;
     private String formato;
     private Set preguntas = new HashSet(0);
     private Set respuestas = new HashSet(0);

    public Usuario() {
    }
    
    public Usuario(String nombre,Date fechanac,String correo,Boolean administrador,String contrasena,Boolean aceptado){
        this.nombre = nombre;
        this.fechanac = fechanac;
        this.correo = correo;
        this.aceptado = aceptado;
        this.administrador = administrador;
        this.contrasena = contrasena;
    }

	
    public Usuario(int idusuario, String nombre, Date fechanac, String correo, String contrasena, String imagen) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.fechanac = fechanac;
        this.correo = correo;
        this.contrasena = contrasena;
        this.imagen = imagen;
    }
    
    public Usuario(int idusuario, String nombre, Date fechanac, String correo, Boolean administrador, String contrasena, Boolean aceptado,String imagen, String formato) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.fechanac = fechanac;
        this.correo = correo;
        this.administrador = administrador;
        this.contrasena = contrasena;
        this.imagen = imagen;
        this.formato = formato;
        this.aceptado = aceptado;
    }
    
    public Usuario(int idusuario, String nombre, Date fechanac, String correo, String contrasena, String imagen, String formato) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.fechanac = fechanac;
        this.correo = correo;
        this.contrasena = contrasena;
        this.imagen = imagen;
        this.formato = formato;
    }
    
    public Usuario(int idusuario, String nombre, Date fechanac, String correo, Boolean administrador, String contrasena, Boolean aceptado, String imagen, String formato, Set preguntas, Set respuestas) {
       this.idusuario = idusuario;
       this.nombre = nombre;
       this.fechanac = fechanac;
       this.correo = correo;
       this.administrador = administrador;
       this.contrasena = contrasena;
       this.aceptado = aceptado;
       this.imagen = imagen;
       this.formato = formato;
       this.preguntas = preguntas;
       this.respuestas = respuestas;
    }
   
    public int getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getFechanac() {
        return this.fechanac;
    }
    
    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Boolean getAdministrador() {
        return this.administrador;
    }
    
    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public Boolean getAceptado() {
        return this.aceptado;
    }
    
    public void setAceptado(Boolean aceptado) {
        this.aceptado = aceptado;
    }
    public String getImagen() {
        return this.imagen;
    }
    
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public String getFormato() {
        return this.formato;
    }
    
    public void setFormato(String formato) {
        this.formato = formato;
    }
    public Set getPreguntas() {
        return this.preguntas;
    }
    
    public void setPreguntas(Set preguntas) {
        this.preguntas = preguntas;
    }
    public Set getRespuestas() {
        return this.respuestas;
    }
    
    public void setRespuestas(Set respuestas) {
        this.respuestas = respuestas;
    }

    public String admin(){
        String s = (this.administrador)? "Sí":"No";
        return s;
    }
    
    public String verificado(){
        String s = (this.aceptado)? "Sí":"No";
        return s;
    }
}


