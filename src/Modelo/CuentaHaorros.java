/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class CuentaHaorros extends Cuenta{
    private boolean estado;

    public CuentaHaorros(boolean estado, double saldo, int numeroConsignaciones, int numeroRetiros, double tasaAnual, int comicionMensual) {
        super(saldo, numeroConsignaciones, numeroRetiros, tasaAnual, comicionMensual);
        this.estado = estado;
        this.definirEstado();
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

public void definirEstado(){
    
}
public void depositar(double valorDeposito){
    if (isEstado()){
        
    }
}
    public void calcularExtractoMensual(){
        if(getNumeroRetiros()>4){
            int npago=(getNumeroRetiros()-4)*1000;
            setComicionMensual(npago);
            super.extractoMensual();
        }else{
            this.extractoMensual();
            
           
        }
    }
public void imprimir(String mensaje){
    if (isEstado()){
        mensaje="Activa";
    }else{
        mensaje="inactiva";
        
    }
        System.out.println("""
                           ------ DATOS CUENTA AHORROS------
                           Nro. Consignaciones: """ + getNumeroConsignaciones()+ "\n" +
                "Nro. Retiros: " + getNumeroRetiros()+ "\n" +
                "Tasa Anual: " + getTasaAnual()+ "\n" +
                "Comision Anual: " + getComicionMensual()+ "\n");
}

    public void retirar(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
