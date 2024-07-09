/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.PersonaH;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author LENOVO
 */
public class PersonaControlador {
    
    //Atributos 
    //modelo 
    private PersonaH persona;
   //conexion
    ConexionBDD conexion=new ConexionBDD();
    Connection connection=(Connection) conexion.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;
    
    //insertar filas en una tabla 
    public void crearPersona(PersonaH p){
        try {  //lanza que todo este correcto 
            String consultaSQL="INSERT INTO persona(nombres,apellidos,cedula,usuario,clave,direccion,correoElectronico,sexo,fechaNacimiento,telefono)VALUES ('"+p.getNombre()+"','"+p.getApellido()+"','"+p.getCedula()+"','"+p.getUsuario()+"','"+p.getClave()+"','"+p.getDireccion()+"','"+p.getCorreoElectronico()+"','"+p.getSexo()+"','"+p.getFechaNacimiento()+"'," +p.getTelefono()+ ")";
            
            ejecutar=(PreparedStatement)connection.prepareCall(consultaSQL);
            //dar click en el play en la consulta 
            int res=ejecutar.executeUpdate();
            if (res>0) {
                System.out.println("La persona ah sido creada con exito ");
                ejecutar.close();
                
            }else{
                System.out.println("Favor ingrese correctamente los datos solicitados ");
                ejecutar.close();
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        } //captura el error y pone que la consola se siga ejecutando 
        
        
    }
    
    
}
