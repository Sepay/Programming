/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

/**
 *
 * @author Spy
 */
public abstract class Veiculos implements iVeículos{
    private String nomeVeiculo;
    private String corVeiculo;
    private int numerodeApólice;
    private boolean estáDisponivel;
    private Empregado empregado;
    double consumoMédio;

   

    
    
    
    public Veiculos(String NomeVeiculo, String Cor, int numerodeApólice){
        this.nomeVeiculo = NomeVeiculo;
        this.corVeiculo = Cor;
        this.numerodeApólice= numerodeApólice;
        this.estáDisponivel = true;
    }
   
    
    @Override
    public String getNomeVeiculo(){
        return this.nomeVeiculo;
    }
    @Override
    public String getCor(){
        return this.corVeiculo;
    }
    @Override
    public int getNumeroApólice(){
        return this.numerodeApólice;
    }
    
    @Override
    public boolean getDisponibilidade(){
        return this.estáDisponivel;
    }
    
    @Override
    public Empregado getEmpregado(){
        return this.empregado;
    }
    
    @Override
    public void setDisponibilidadeVeiculo(boolean Disponivel){
        this.estáDisponivel = Disponivel;
    }
    @Override
    public void setEmpregado(Empregado empregado){
        this.empregado = empregado;
    }
    
    public double getConsumoMédio() {
        return consumoMédio;
    }
    public void setConsumoMédio(double consumoMédio) {
        this.consumoMédio = consumoMédio;
    }

    @Override
    public String toString(){
        return "Nome do Veiculo: " + this.nomeVeiculo + " | " + 
                "Cor do Veiculo: " + this.corVeiculo + " | " +
                "Disponibilidade: " + this.estáDisponivel;
                        
                 
    }
}
