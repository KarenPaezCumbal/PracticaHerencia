/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class Administrativo extends PersonaH {
    private int idAdministrativo;
    private String cargo;
    private String area;

    public Administrativo() {
    }

    public Administrativo(int idAdministrativo, String cargo, String area, int idPersona, String nombre, String apellido, String cedula, int telefono, String direccion, String correoElectronico, String sexo, String fechaNacimiento) {
        super(idPersona, nombre, apellido, cedula, telefono, direccion, correoElectronico, sexo, fechaNacimiento);
        this.idAdministrativo = idAdministrativo;
        this.cargo = cargo;
        this.area = area;
    }

    public int getIdAdministrativo() {
        return idAdministrativo;
    }

    public void setIdAdministrativo(int idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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
                "--------Datos Administrativos--------"+"\n"+
                "id Administrativo: " +getIdAdministrativo()+"\n"+
                "Cargo: "+getCargo()+"\n"+
                "Area: "+getArea();
                
                        
    }
    
}
