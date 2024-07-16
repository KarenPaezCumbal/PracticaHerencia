/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class Docente extends PersonaH{
    //Atributos propios
    private int idDocente;
    private String especialidad;
    private String titulo;
    private String resgistroSenescyt;
    private String escalaSalarial;

    public Docente() {
    }

    public Docente(int idDocente, String especialidad, String titulo, String resgistroSenescyt, String escalaSalarial) {
        this.idDocente = idDocente;
        this.especialidad = especialidad;
        this.titulo = titulo;
        this.resgistroSenescyt = resgistroSenescyt;
        this.escalaSalarial = escalaSalarial;
    }
    
    // constructor superclase 

    public Docente(int idDocente, String especialidad, String titulo, String resgistroSenescyt, String escalaSalarial, int idPersona, String nombre, String apellido, String cedula, int telefono, String direccion, String correoElectronico, String sexo, String fechaNacimiento, String usuario, String clave) {
        super(idPersona, nombre, apellido, cedula, telefono, direccion, correoElectronico, sexo, fechaNacimiento, usuario, clave);
        this.idDocente = idDocente;
        this.especialidad = especialidad;
        this.titulo = titulo;
        this.resgistroSenescyt = resgistroSenescyt;
        this.escalaSalarial = escalaSalarial;
    }

   

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResgistroSenescyt() {
        return resgistroSenescyt;
    }

    public void setResgistroSenescyt(String resgistroSenescyt) {
        this.resgistroSenescyt = resgistroSenescyt;
    }

    public String getEscalaSalarial() {
        return escalaSalarial;
    }

    public void setEscalaSalarial(String escalaSalarial) {
        this.escalaSalarial = escalaSalarial;
    }
   
    public String imprimir(){
        return """
               --------Persona-------- 
               id: """ +getIdPersona()+"\n"+
                "Nombre:" +getNombre()+"\n"+
                "Apellido:" +getApellido()+"\n"+
                "Cedula:" +getCedula()+"\n"+
                "Telefono:" +getTelefono()+"\n"+
                "Direccion:" +getDireccion()+"\n"+
                "Correo Electronico:" +getCorreoElectronico()+"\n"+
                "Sexo:" +getSexo()+"\n"+
                "Fecha Nacimiento: " +getFechaNacimiento()+"\n"+
                "-------Datos Docentes--------\n"+
                "id Docente: " +getIdDocente()+"\n"+
                "Especialidad: " +getEspecialidad()+"\n"+
                "Titulo: " +getTitulo()+"\n"+
                "Registro Senescyt: " +getResgistroSenescyt()+"\n"+
                "Escala Salarial: " +getEscalaSalarial();
    }

    public String getRegistroSenecyt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
