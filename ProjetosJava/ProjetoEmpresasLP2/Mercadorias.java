/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;


public class Mercadorias extends Veiculos {
    
    private int maxPeso;

    private final String matricula;

    public Mercadorias(String NomeVeiculo, String Cor, int numerodeApólice,  String matricula) {
        super(NomeVeiculo, Cor, numerodeApólice);
        this.maxPeso = 0;
        this.matricula = matricula;

    }
    public int getMaxPeso(){
        return this.maxPeso;
    }

    public void setMaxPeso(int peso){
        this.maxPeso = peso;
        if(peso%40 == 0){
            int consumoBonus = peso/400;      //Sobe 0.1 a cada 40 litros logo sobre 1 a cada 400
            super.consumoMédio += consumoBonus;
            }
        }
    
    @Override
    public String toString(){
        return super.toString() + " | " + "Peso máximo: " + this.maxPeso + " | " +
                "Consumo médio: " + this.consumoMédio + " litros aos 100";
    }
    
    
    
}
