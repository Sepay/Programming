/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;


public class Passageiros extends Veiculos {

       private String matricula;
       
       private int númeroMáxPassageiros;
       
       
    public Passageiros(String NomeVeiculo, String Cor, int numerodeApólice, String matricula) {
        super(NomeVeiculo, Cor, numerodeApólice);
        this.matricula = matricula;
        this.númeroMáxPassageiros = 0;
    }
    public String getMatricula(){
        return this.matricula;
    }

    public int getNumeroMax(){
        return this.númeroMáxPassageiros;
    }

    public void setNúmeroMax(int numero){
        if(numero>=0 && numero <5){
            switch(numero) {
            case 1:
                this.númeroMáxPassageiros = numero;
                super.consumoMédio = super.consumoMédio + 0.2;
                break;
            case 2:
                this.númeroMáxPassageiros = numero;
                super.consumoMédio = super.consumoMédio + 0.4;
                break;
            case 3:
                this.númeroMáxPassageiros = numero;
                super.consumoMédio = super.consumoMédio + 0.6;
                break;
            case 4:
                this.númeroMáxPassageiros = numero;
                super.consumoMédio = super.consumoMédio + 0.8;
                break;
            default:
                this.númeroMáxPassageiros = 0;
        }
        }
        else{
            return;
        }
    }
       @Override
    public String toString(){
        return super.toString() + " | " + "Matricula: " + this.matricula + " | " + "Numero de passageiros: " + this.númeroMáxPassageiros + " | " +
                "Consumo médio: " + super.consumoMédio + " litros aos 100";
    }

}
