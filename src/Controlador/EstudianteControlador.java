/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Estudiante;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author LENOVO
 */
public class EstudianteControlador {

    private Estudiante estudiante;

    ConexionBDD conexion = new ConexionBDD();
    Connection connection = (Connection) conexion.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public void crearEstudainte(Estudiante es) {
        try {
            String consultaSQL="INSERT INTO estudiantes (numeroMatricula,jornada,idpersona) VALUES ('"+es.getNumMatricula()+"','"+es.getJornada()+")";
            PreparedStatement ejecutar=(PreparedStatement)connection.prepareCall(consultaSQL);
            int resultado=ejecutar.executeUpdate();
            if (resultado>0) {
                
                System.out.println("EL ESTUDIANTE FUE CREADO CON EXITO");
            }else{
                System.out.println("INGRESE LOS DATOS DE MANERA CORRECTA");
            }
            

        } catch (Exception e) {
            System.out.println("ERROR CONSULTE CON ADMINISTRADOR");
        }

    }

    public void crearEstudiante(Estudiante est) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
