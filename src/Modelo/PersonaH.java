/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class PersonaH {
    private int idPersona;
    private String nombre;
    private String apellido;
    private String cedula;
    private int telefono;
    private String direccion;
    private String correoElectronico;
    private String sexo;
    private String fechaNacimiento;
    private String usuario;
    private String clave;
    public String Sexo;

    public PersonaH() {
    }

    public PersonaH(int idPersona, String nombre, String apellido, String cedula, int telefono, String direccion, String correoElectronico, String sexo, String fechaNacimiento, String usuario, String clave) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.usuario = usuario;
        this.clave = clave;
    }

    

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    public String imprimir(){
        return """
               --------Datos Persona-------- 
               id: """ +getIdPersona()+"\n"+
                "Nombre" +getNombre()+"\n"+
                "Apellido" +getApellido()+"\n"+
                "Cedula" +getCedula()+"\n"+
                "Telefono" +getTelefono()+"\n"+
                "Direccion" +getDireccion()+"\n"+
                "Usuario:"+getUsuario()+ "\n"+
                "Clave:" + "************\n"+
                "Correo Electronico" +getCorreoElectronico()+"\n"+
                "Sexo" +getSexo()+"\n"+
                "Fecha Nacimiento" +getFechaNacimiento();
    }

  
    
}
