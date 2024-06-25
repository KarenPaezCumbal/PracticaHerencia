/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Administrativo;
import Modelo.Docente;
import Modelo.Persona;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        Persona x=new Persona();
        Docente d=new Docente();
        d.setIdPersona(1);
        d.setNombre("Karen");
        d.setApellido("Paez");
        d.setTitulo("Tecnologia");
        System.out.println(d.imprimir());
        
        Administrativo a=new Administrativo(12, 
                "Estudiante", 
                "Software",
                1, 
                "Karen",
                "Paez",
                "1004446702",
                978631727,
                "Ibarra",
                "karencumbal963@gmail.com",
                "Femenino",
                "2005/02/19");
        System.out.println(a.imprimir());
     
       
    }
}                             
