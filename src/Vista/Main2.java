/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.PersonaControlador;
import Modelo.CuentaCorriente;
import Modelo.CuentaHaorros;
import Modelo.Persona;
import Modelo.PersonaH;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main2 {
    public static void main(String[] args) {
        
        ArrayList<CuentaHaorros> listaCuentaHaorro = new ArrayList<>();
        ArrayList<CuentaCorriente> listaCuentaCorriente = new ArrayList<>();
        Scanner es = new Scanner(System.in);
        int i = 1;
        do {
            System.out.println("BIENVENIDO AL BANCO PEPITO PÉREZ");
            System.out.println("Cuidando tu dinero desde 1992");
            System.out.println("Elija la opción que Usted requiera ejecutar:\n"
                    + "1.Crear Cuenta\n"
                    + "2.Consultar Saldo\n"
                    + "3.Imprimir Estado de Cuenta\n"
                    + "4.Depósitos\n"
                    + "5.Retiros\n"
                    +"6.Gestion de usuarios\n"
                    + "0.Salir");
            int op1 = es.nextInt();
            if (op1 == 1) {
                System.out.println("Elija el tipo de Cuenta que quiere Crear\n"
                        + "1.Cuenta de Ahorros\n"
                        + "2.Cuenta Corriente");
                int sm1 = es.nextInt();
                if (sm1 == 1 || sm1 == 2) {
                    if (sm1 == 1) {
                        System.out.println("---FORMULARIO DE CREACIÓN DE CUENTA DE AHORROS---");
                        System.out.println("Ingrese el monto de creación de la cuenta:");
                        double monto = es.nextDouble();
                        CuentaHaorros ca = new CuentaHaorros(false, monto, 1, 0, 12, (int) 1.35);
                        listaCuentaHaorro.add(ca);
                        ca.imprimir();
                    } else if (sm1 == 2) {
                        System.out.println("---FORMULARIO DE CREACIÓN DE CUENTA CORRIENTE---");
                        System.out.println("Ingrese el monto de creación de la cuenta:");
                        double monto = es.nextDouble();
                        CuentaCorriente cc = new CuentaCorriente(0, monto, 1, 0, 12, (int) 1.35);
                        listaCuentaCorriente.add(cc);
                        cc.imprimir();
                    }
                } else {
                    System.out.println("Ingrese una opción del menú");
                }
            } else if (op1 == 0) {
                i = 0;
            }else if (op1==6){
                System.out.println("Elija la Transaccion a realizar\n"+
                        "1.Crear Persona");
                int mp=es.nextInt();
                if(mp==1){
                    System.out.println("Ingrese los Siguientes informatios");
                    PersonaH p=new PersonaH();
                    System.out.println("Ingrese el nombre:");
                    p.setNombre(es.next());
                    System.out.println("Ingrese apellido: ");
                    p.setApellido(es.next());
                    System.out.println("Ingrese Cedula: ");
                    p.setCedula(es.next());
                    System.out.println("Ingrese Telefono: ");
                    p.setTelefono(es.nextInt());
                    System.out.println("Ingrese Usuario: ");
                    p.setUsuario(es.next());
                    System.out.println("Ingrese Clave: ");
                    p.setClave(es.next());
                    System.out.println("Ingrese Correo Electronico: ");
                    p.setCorreoElectronico(es.next());
                    System.out.println("Ingrese Sexo: ");
                    p.setSexo(es.next());
                    System.out.println("Ingrese Fecha Nacimineto : ");
                    p.setFechaNacimiento(es.next());
                    
                    //controlador 
                    PersonaControlador pc=new PersonaControlador();
                    pc.crearPersona(p);
                    
                    
                }
                
            }

        } while (i == 1);
    
   
    
    }
    }
    

