/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class Estudiante extends PersonaH {
    private int idEstudiante;
    private int numMatricula;
    private String horario;
    private String jornada;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, int numMatricula, String horario, String jornada, int idPersona, String nombre, String apellido, String cedula, int telefono, String direccion, String correoElectronico, String sexo, String fechaNacimiento, String usuario, String clave) {
        super(idPersona, nombre, apellido, cedula, telefono, direccion, correoElectronico, sexo, fechaNacimiento, usuario, clave);
        this.idEstudiante = idEstudiante;
        this.numMatricula = numMatricula;
        this.horario = horario;
        this.jornada = jornada;
    }

   
    

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    
    
    public String imprimir(){
        return """
               --------Datos Persona-------- 
               id: """ +getIdPersona()+"\n"+
                "Nombre:" +getNombre()+"\n"+
                "Apellido:" +getApellido()+"\n"+
                "Cedula:" +getCedula()+"\n"+
                "Telefono:" +getTelefono()+"\n"+
                "Direccion:" +getDireccion()+"\n"+
                "Correo Electronico:" +getCorreoElectronico()+"\n"+
                "Sexo:" +getSexo()+"\n"+
                "Fecha Nacimiento: " +getFechaNacimiento()+"\n"+
                "--------Datos Estudiante-------"+"\n"+
                "id Estudiante: "+getIdEstudiante()+"\n"+
                "Numero Matricula: "+getNumMatricula()+"\n"+
                "Horario: "+getHorario()+"\n"+
                "Jornada:"+getJornada();

    }
}
