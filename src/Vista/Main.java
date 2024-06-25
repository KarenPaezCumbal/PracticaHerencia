/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

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
     
       
    }
}
