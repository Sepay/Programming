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
public class ProgramaPrincipal {

    /**
     * @param args the command line arguments
     */
    private static Menu menu;
    static Empresa empresa;
    static Bicicletas bike1;
    static Bicicletas bike2;
    static Bicicletas bike3;
    static Passageiros uber1;
    static Passageiros uber2;
    static Passageiros uber3;
    static Mercadorias estafeta1;
    static Mercadorias estafeta2;
    static Mercadorias estafeta3;
    static Mercadorias estafeta4;
    
    public static void main(String[] args) {
        

        bike1 = new Bicicletas("BMX","vermelho", 3);
        bike2 = new Bicicletas("BMX2","vermelho", 4);
        bike3 = new Bicicletas("BMX3","vermelho", 5);
        uber1 = new Passageiros("Mercedes", "Preto", 1,"GC43HV");
        uber2 = new Passageiros("Mercedes2", "Preto", 2,"GC43H2");
        uber3 = new Passageiros("Mercedes3", "Preto", 6,"GC43H3");
        estafeta1 = new Mercadorias("Fiat", "Preto", 7,"GC43H4");
        estafeta2 = new Mercadorias("Fiat2", "Preto", 8,"GC43H5");
        estafeta3 = new Mercadorias("Fiat3", "Preto", 9,"GC43H6");
        estafeta4 = new Mercadorias("Fiat4", "Preto", 10,"GC43H7");
        
        empresa = new Empresa();
        empresa.inserirVeiculo(bike1);
        empresa.inserirVeiculo(bike2);
        empresa.inserirVeiculo(bike3);
        empresa.inserirVeiculo(uber1);
        empresa.inserirVeiculo(uber2);
        empresa.inserirVeiculo(uber3);
        empresa.inserirVeiculo(estafeta1);
        empresa.inserirVeiculo(estafeta2);
        empresa.inserirVeiculo(estafeta3);
        empresa.inserirVeiculo(estafeta4);
        
        
        
        menu = new Menu(empresa);
        menu.menus();     
    }
    
}
