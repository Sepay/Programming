/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;


public class Bicicletas extends Veiculos {
    
    private int autonomiaMax;
    private double valorPorKm;
    private boolean miniAtrelado;
    
    public Bicicletas(String NomeVeiculo, String Cor, int numerodeApólice) {
        super(NomeVeiculo, Cor, numerodeApólice);
        this.autonomiaMax = 0;
        this.valorPorKm = 0;
    }
    public int getAutonomiaMax(){
        return this.autonomiaMax;
    }
    public double getValorporKm(){
        return this.valorPorKm;
    }
    public boolean getAtrelado(){
        return this.miniAtrelado;
    }
    public void setAutonomia(int Autonomia){
        this.autonomiaMax = Autonomia;
    }
    public void setAutonomia(double valorporKM){
        this.valorPorKm = valorporKM;
    }
    public void setAtrelado(boolean Atrelado){
        this.miniAtrelado = Atrelado;
    }

    @Override
    public String toString(){
        return "Nome da Bicicleta: " + super.getNomeVeiculo() + " | " +
                "Cor da Bicicleta: " + super.getCor() + " | " +
                "Disponibilidade: " + super.getDisponibilidade() + " | " +
                "Mini atrelado: " + this.miniAtrelado;
                
    }
    
    
}
