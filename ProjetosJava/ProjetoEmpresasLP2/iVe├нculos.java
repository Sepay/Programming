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
public interface iVeículos {
    
    public String getNomeVeiculo();
    
    public String getCor();
    
    public int getNumeroApólice();
    
    public boolean getDisponibilidade();
    
    public Empregado getEmpregado();
    
    public void setDisponibilidadeVeiculo(boolean g);
    
    public void setEmpregado(Empregado empregado);
    
   
}
