/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Spy
 */
public class Empresa{
    private  ArrayList<Empregado> listaEmpregados;
    private final int Salários;
    private Veiculos[] listaVeiculos;
    private FileWriter fileW;
    
    public Empresa(){
        this.listaEmpregados = new ArrayList<>();
        this.Salários = 30; /*Salário por dia */ 
        this.listaVeiculos = new Veiculos[10];    
    
        
    }
    
    public String getSalario(){
        return "Salário base: " + this.Salários +  " euros";
    }
    
    public ArrayList<Empregado> getListaEmpregado(){
        return this.listaEmpregados;
    }
    public Veiculos[] getListaVeiculos(){
        return this.listaVeiculos;
    }
    
    
    public void novoEmpregado(Empregado empregado){
        for(Empregado emp : this.listaEmpregados){ 
            if(emp.getCodigoEmpregado() == empregado.getCodigoEmpregado()){
                System.out.println("Empregado ja existe");
                empregado.fichaEmpregado();
                return;
            }
        }
        empregado.setData();
        this.listaEmpregados.add(empregado);
        System.out.println("Adicionado com sucesso!");
    }
    public void showList(){
        System.out.println(this.listaEmpregados);
    }
    public void showListCategoria(String Categoria){ 
        int contador = 0;
        for (Empregado Emp : this.listaEmpregados) {
            if(Emp.getTipo().equals(Categoria)){
                System.out.println(this.listaEmpregados.get(contador).getNome());
            }
            contador++;
        }
    }
    public void enviarListaEmpregados(){
        try {
            File myObj = new File("C:\\Users\\Spy\\Desktop\\testepf");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                fileW = new FileWriter("C:\\Users\\Spy\\Desktop\\testepf");
                if(data != null){
                    fileW.write(data + this.listaEmpregados.toString());
                }
                else{
                    fileW.write(this.listaEmpregados.toString());
                }
            fileW.close();
            System.out.println("Escrito");
            }
        } catch (IOException e) {
            System.err.println("An error occurred.");
        }

    }
    public void lerFicheiro(){
      try {
        File myObj = new File("C:\\Users\\Spy\\Desktop\\testepf");
        Scanner myReader = new Scanner(myObj); 
              while (myReader.hasNextLine()) {
                  String data = myReader.nextLine();
                  System.out.println(data);
              }   
    } catch (FileNotFoundException e) {
        System.err.println("An error occurred.");
    }

    }
    
    public int SalárioGestor(){
        int contador = 0;
        int SalárioGestores = 0;
        ArrayList<Integer> Gestores = new ArrayList<>();
        for (Empregado Emp : this.listaEmpregados) {
            if(Emp.getTipo().equals("Gestor")){
                int SalárioEmp;
                int subsidio = 4 * Emp.getTrabalhoporMes();
                SalárioEmp = (int) (this.Salários * Emp.getTrabalhoporMes());
                SalárioEmp = (int) (SalárioEmp + (SalárioEmp * 0.15));
                SalárioEmp *= antiguidadeEmpregado(Emp);
                SalárioEmp += subsidio;
                Gestores.add(SalárioEmp);
            }
            contador++;
        }
        for(int index= 0; index < Gestores.size(); index++){
            SalárioGestores += Gestores.get(index);
            
            }
        return SalárioGestores;
    }
    public int SalárioMotorista(){
        int contador = 0;
        int SalárioMotorista = 0;
        ArrayList<Double> Motoristas = new ArrayList<>();
        for (Empregado Emp : this.listaEmpregados) {
            if(Emp.getTipo().equals("Motorista")){
                double SalárioEmp;
                int subsidio = 4 * Emp.getTrabalhoporMes();
                SalárioEmp = (double)(this.Salários * Emp.getTrabalhoporMes()) + Emp.getBonusMotoTotal();
                SalárioEmp *= antiguidadeEmpregado(Emp);
                SalárioEmp += subsidio;
                Motoristas.add(SalárioEmp);
            }
            contador++;
        }
        for(int index= 0; index < Motoristas.size(); index++){
            SalárioMotorista += Motoristas.get(index);
            
            }
        return SalárioMotorista;
    }   
    public int SaláriosComerciais(){
        int SalárioComercial = 0;
        int contador = 0;
        ArrayList<Integer> Comercial = new ArrayList<>();
        for (Empregado Emp : this.listaEmpregados) {
            if(Emp.getTipo().equals("Comercial")){
               int SalárioEmp;
               int subsidio = 4 * Emp.getTrabalhoporMes();
               Double Vendas = Emp.getVendas();
               SalárioEmp = (int)(this.Salários * Emp.getTrabalhoporMes());
               SalárioEmp = (int) (SalárioEmp + (SalárioEmp * Vendas));
               SalárioEmp *= antiguidadeEmpregado(Emp);
               SalárioEmp += subsidio;
               Comercial.add(SalárioEmp);
            }
            contador++;
        }
        for(int index= 0; index < Comercial.size(); index++){
            SalárioComercial += Comercial.get(index);
            
            }
        return SalárioComercial;

        

    }
    public int SaláriosNormal(){
        int SalárioNormal = 0;
        int contador = 0;
        ArrayList<Integer> Normal = new ArrayList<>();
        for (Empregado Emp : this.listaEmpregados) {
            if(Emp.getTipo().equals("Normal")){
                int SalárioEmp;
                int subsidio = 4 * Emp.getTrabalhoporMes();
                SalárioEmp = this.Salários * Emp.getTrabalhoporMes();
                SalárioEmp = SalárioEmp * antiguidadeEmpregado(Emp);
                SalárioEmp += subsidio;
                Normal.add(SalárioEmp);
            }
            contador++;
            }
        for(int index= 0; index < Normal.size(); index++){
            SalárioNormal += Normal.get(index);
            
            }
        return SalárioNormal;
    }
    public int SaláriosTotal(){
        int Sal1 = SalárioGestor();
        int Sal2 = SalárioMotorista();
        int Sal3 = SaláriosComerciais();
        int Sal4 = SaláriosNormal();
        int SalárioTotal = Sal1 + Sal2 + Sal3 +Sal4;
        return SalárioTotal;
    }
    
    
    public int antiguidadeEmpregado(Empregado emp){
        int antiguidade;
        antiguidade =  LocalDate.now().getYear() - emp.getData().getYear();
        if(antiguidade == 0){
            return 1;
        }
        else{
            int bónusAnti = (int) ((antiguidade * 0.5)/100);
            return bónusAnti;
        }
     
    }
    
    
    public int CustosAnuais(){
        int Custoanual = SaláriosTotal() * 14; /*Salarios de cada mes mais os 2 subsidios.*/
        return Custoanual;
    }
    public int CustosSemestrais(){
        int custoSemestral = SaláriosTotal() * 7; //Salários de meio ano com 1 subsidio adicionado
        return custoSemestral;
    }
    public int Custostrimestrais(int trimestre){
        if(trimestre == 2 || trimestre == 4){
            var custoTrimestre = SaláriosTotal() * 4;
            return custoTrimestre;
        }
        if(trimestre == 1 || trimestre == 3){
            int custoTrimestre = SaláriosTotal() * 3;
            return custoTrimestre;
        }
        else{
            System.out.println("Erro");
            return 0;
        }
 
    }
    public void inserirVeiculo(Veiculos v){
        for(int i = 0; i<this.listaVeiculos.length;i++){
            if(this.listaVeiculos[i]== null){
                this.listaVeiculos[i] = v;
                return;
            }
        }
    }
    public void showListaVeiculos(){
        int contador = 0;
        for(Veiculos v : this.listaVeiculos){
            if(this.listaVeiculos[contador] != null){
                System.out.println(this.listaVeiculos[contador]);
            }
            else{
                return;
            }
         contador++;
        }
    }
    public void showVeiculosDisponiveis(){
        int contador = 0;
        for(Veiculos v: this.listaVeiculos){
            if(this.listaVeiculos[contador] != null){
                if(v.getDisponibilidade() == true){
                    System.out.println(this.listaVeiculos[contador]);
                }
            }
        contador++;
        }
    }
    public void atribuirEmpregadosaVeiculos(Empregado emp, Veiculos v){
        if(v.getDisponibilidade()){
            v.setEmpregado(emp);
            v.setDisponibilidadeVeiculo(false);
        }
        else{
            System.out.println("Veiculo não está disponivel.");
        }
    }
    
    
}
