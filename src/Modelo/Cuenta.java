/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class Cuenta {
    private double saldo;
    private int numeroConsignaciones;
    private int numeroRetiros;
    private double tasaAnual;
    private int comicionMensual;

    public Cuenta() {
    }

    public Cuenta(double saldo, int numeroConsignaciones, int numeroRetiros, double tasaAnual, int comicionMensual) {
        this.saldo = saldo;
        this.numeroConsignaciones = numeroConsignaciones;
        this.numeroRetiros = numeroRetiros;
        this.tasaAnual = tasaAnual;
        this.comicionMensual = comicionMensual;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConsignaciones() {
        return numeroConsignaciones;
    }

    public void setNumeroConsignaciones(int numeroConsignaciones) {
        this.numeroConsignaciones = numeroConsignaciones;
    }

    public int getNumeroRetiros() {
        return numeroRetiros;
    }

    public void setNumeroRetiros(int numeroRetiros) {
        this.numeroRetiros = numeroRetiros;
    }

    public double getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(double tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public int getComicionMensual() {
        return comicionMensual;
    }

    public void setComicionMensual(int comicionMensual) {
        this.comicionMensual = comicionMensual;
    }

    public void imprimir(){
        System.out.println("""
                           ------ DATOS CUENTA BANCARIA ------
                           Nro. Consignaciones: """ + getNumeroConsignaciones()+ "\n" +
                "Nro. Retiros: " + getNumeroRetiros()+ "\n" +
                "Tasa Anual: " + getTasaAnual()+ "\n" +
                "Comision Anual: " + getComicionMensual()+ "\n");
    }
      public void deposito(double valorDepositar){
        setSaldo(getSaldo()+valorDepositar);
        setNumeroConsignaciones(getNumeroConsignaciones()+1);
    }
    public void retiro(double valorRetirar){
        if(valorRetirar>getSaldo()){
            System.out.println("No cuenta con los fondos suficientes"
                    + " para realizar el retiro");
        }else{        
            setSaldo(getSaldo()-valorRetirar);
            setNumeroRetiros(getNumeroRetiros()+1);
        }
    
    }
    public double calculoInteres(){
        double valorRendimiento=0;
        valorRendimiento=(getSaldo()*((getTasaAnual()/100)/12));
        //setSaldo(valorRendimiento+getSaldo());
        return valorRendimiento;
    }
       
        public void extractoMensual(){
        double interes = this.calculoInteres();
        setSaldo(getSaldo() - getNumeroConsignaciones()+ interes);
            System.out.println("Estado de cuenta\n"+
                    "saldo:"+getSaldo()+"\n"+
                    "comision mensual:"+getComicionMensual()+"\n"+
                    "interes ganado del mes:"+interes);
    }
        
    }
          
        
    
    

