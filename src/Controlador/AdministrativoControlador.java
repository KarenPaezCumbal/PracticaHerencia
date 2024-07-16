/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Administrativo;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author LENOVO
 */
public class AdministrativoControlador {
    private Administrativo administrativo;
    ConexionBDD conexion=new ConexionBDD();
    Connection connection=(Connection) conexion.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;
    
    public void crearAdministrativo(Administrativo a, int idPersona){
        try {
            String consulta = "INSERT INTO administrativos(cargo, area, idPersona)VALUES ('" + a.getCargo() + "','" + a.getArea() + "', " + idPersona + ");";
            
            ejecutar =(PreparedStatement) connection.prepareCall(consulta);
            
            int res = ejecutar.executeUpdate();
            
            if(res > 0){
                System.out.println("ADMINISTRATIVO HA SIDO CREADO CON EXITO");
                ejecutar.close();
            }else{
                System.out.println("ERROR INGRESE CORRECTAMENTE LOS DATOS SOLICITADOS");
                ejecutar.close();
            }
            
        } catch(Exception e){
            System.out.println("ERROR COMUNIQUESE CON EL ADMINISTRADOR\n"
                     + "PARA SOLUCIONAR SU PROBLEMA: " + e);
        }
    }


        }
    

   
    
