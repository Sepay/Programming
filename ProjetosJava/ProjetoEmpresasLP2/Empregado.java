/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import java.time.LocalDate;

/**
 *
 * @author Spy
 */
public class Empregado {
    private String Nome;
    private int codigoEmpregado;
    private LocalDate dataDeEntrada;
    private int trabalhoPorMês;
    private int[] trabalhoAno; //Esta lista irá guardar todos os dias por mês do empregado.
    private String tipoEmpregado;
    private double percentagemVendas;
    private double bonusMotorista;
    private double bonusMotoTotal;

    public Empregado(String Nome, int codigoEmpregado){
        this.Nome = Nome;
        this.codigoEmpregado = codigoEmpregado;
        this.dataDeEntrada = null;
        this.trabalhoPorMês = 0;
        this.tipoEmpregado = "Normal";
        this.percentagemVendas = 0.07; // 7% por venda.
        this.bonusMotorista = 0.5;   //0.5 euros por km
        this.bonusMotoTotal = 0;
    }
    
   
    public String getNome(){
        return this.Nome;
    }
    
    public int getCodigoEmpregado(){
        return this.codigoEmpregado;
    }
    
    public int getTrabalhoporMes(){
        return this.trabalhoPorMês;
    }
    
    public LocalDate getData(){
        return this.dataDeEntrada;
    }
    
    public double getVendas(){
        return this.percentagemVendas;
    }
    
    public String getTipo(){
        return this.tipoEmpregado;
    }
    
    public double getBonusMotorista(){
        return this.bonusMotorista;
    }
    
    public double getBonusMotoTotal(){
        return this.bonusMotoTotal;
    }
    
    public void setData(){
        this.dataDeEntrada = LocalDate.now();
    }
    public void setPercentagemVendas(double percentagemVendas){
        this.percentagemVendas = percentagemVendas;
    }
    
    public void setTrabalhoporMes(int x){
        this.trabalhoPorMês = x;
    }
    public void setTipo(int Tipo){
        switch (Tipo) {
            case 1:
                this.tipoEmpregado = "Gestor";
                break;
            case 2:
                this.tipoEmpregado = "Motorista";
                break;
            case 3:
                this.tipoEmpregado = "Comercial";
                break;
            default:
                break;
        }
    }
    
    
    public void fichaEmpregado(){
        System.out.println("Nome: " + this.Nome);
        System.out.println("Codigo: " + this.codigoEmpregado);
        System.out.println("Empregado desde: " + this.dataDeEntrada);
        System.out.println("Este mês fez " + this.trabalhoPorMês + " dias.");
    }
    
    public void setNumeroVendasComercial(int vendas){
        if(this.tipoEmpregado.equals("Comercial")){
           this.percentagemVendas *= vendas;
        }       
    }
    
    public void bonusMotoristaTotal(int km){
       if(this.tipoEmpregado.equals("Motorista")){
        this.bonusMotoTotal = this.bonusMotorista * km;
        }
    }

    
    @Override
    public String toString(){
        String print = this.Nome;
        print = print + "  " + this.dataDeEntrada + "  " + this.tipoEmpregado;
        return print;
    }
}
