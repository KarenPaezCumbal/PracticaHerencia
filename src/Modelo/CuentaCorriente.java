/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class CuentaCorriente extends Cuenta{
    private double sobregiro;

    public CuentaCorriente(int sobregiro, double saldo, int numeroConsignaciones, int numeroRetiros, double tasaAnual, int comicionMensual) {
        super(saldo, numeroConsignaciones, numeroRetiros, tasaAnual, comicionMensual);
        this.sobregiro = sobregiro;
    }

    public double getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(int sobregiro) {
        this.sobregiro = sobregiro;
    }
    
 public void retiroCorriente(double valorRetiro){
     if(valorRetiro>getSaldo()){
         setSobregiro((int) (valorRetiro-getSaldo()));
         setSaldo(0);
         System.out.println("");
     }else{
         this.retiro(valorRetiro);
         
     }
 }
 public void depositoCorriente(double valorDepositar){
     if (getSobregiro()>0){
         if(valorDepositar < getSaldo()){
             
         }
     }
 }   
 
}
