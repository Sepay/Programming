package projetofinal;





public class Menu {

    private InputReader reader;
    private Empresa empresa;

    public Menu(Empresa empresa) {
        this.reader = new InputReader();
        this.empresa= empresa;
    }

    public void Menuprincipal() {
        System.out.println("                        ");
        System.out.println("***Projeto Final***");
        System.out.println("1 – Empresa");
        System.out.println("2 – Empregado");
        System.out.println("3 – Veiculo");
        System.out.println("0 – Sair");
        System.out.println("Escolha a sua opção:");
    }
    

    public int menus() {
        int opcao;
        do {
            Menuprincipal();
            opcao = reader.getIntegerNumber("opção");
            switch(opcao){
                case 1:
                    menuEmpresa();
                    break;
                case 2:
                    menuEmpregado();
                    break;
                case 3:
                    menuVeiculo();
                    break;
                     
            }
            
        } while (opcao > 0 && opcao <= 3);
        return opcao;
    }
    
    public int menuEmpresa(){
        System.out.println("                        ");
        System.out.println("***Empresa***");
        System.out.println("1 – Mostrar Salário base");
        System.out.println("2 – Mostrar Salário total a pagar");
        System.out.println("3 – Salário por categoria.");
        System.out.println("4 - Custos Empresa");
        System.out.println("5 - Definir o tipo de empregado");
        System.out.println("6 - Definir o numero de dias de trabalho de um empregado");
        System.out.println("7 - Definir o numero de vendas de um empregado comercial");
        System.out.println("8 - Guardar Empregados no ficheiro de texto");
        System.out.println("9 - Ler Ficheiro de texto");
        System.out.println("0 – Sair");
        System.out.println("Escolha a sua opção:");
        int opcao;
        do {
            opcao = reader.getIntegerNumber("opção");
            switch(opcao){
                case 1:
                    System.out.println(empresa.getSalario());
                    break;
                case 2:
                    System.out.println("O salario total é: " + empresa.SaláriosTotal() + " euros.");
                    break;
                case 3:
                    menuCategoria();
                    break;
                case 4:
                    menuCustos();
                    break;
                
                case 5:
                    int empregadoCodigo = reader.getIntegerNumber("Codigo do empregado?");
                    for(Empregado emp: empresa.getListaEmpregado()){
                        if(emp.getCodigoEmpregado()== empregadoCodigo){
                            int tipoEmpregado = reader.getIntegerNumber("Tipo de Empregado?");
                            emp.setTipo(tipoEmpregado);
                        }
                    }
                    break;
                case 6:
                    int codigoEmp = reader.getIntegerNumber("Codigo do empregado?"); 
                    for(Empregado emp: empresa.getListaEmpregado()){
                        if(emp.getCodigoEmpregado()== codigoEmp){
                            int numeroDias = reader.getIntegerNumber("Numero de dias que trabalhou?");
                            emp.setTrabalhoporMes(numeroDias);
                        }
                    }
                    break;
                case 7:
                    int codigoEmpregado = reader.getIntegerNumber("Codigo do empregado?");
                    for(Empregado emp: empresa.getListaEmpregado()){
                        if(emp.getCodigoEmpregado() == codigoEmpregado){
                            if(emp.getTipo().equals("Comercial")){
                                int numVendas = reader.getIntegerNumber("Numero de vendas efetuadas?");
                                emp.setNumeroVendasComercial(numVendas);
                            }
                        }
                    }
                    break;
                case 8:
                    empresa.enviarListaEmpregados();
                    break;

                case 9:
                    empresa.lerFicheiro();
                    break;
            }
            
        } while (opcao > 0 && opcao <= 9);
        return opcao;
    }
    public int menuEmpregado(){
        System.out.println("                        ");
        System.out.println("***Menu Empregados***");
        System.out.println("1 – Adicionar e verificar Empregado");
        System.out.println("2 – Mostrar todos os empregados");
        System.out.println("3 – Mostrar empregado por categoria");
        System.out.println("4 - Ficha de empregado");
        System.out.println("0 - Sair");
        System.out.println("Escolha a sua opção:");
        int opcao;
        do {
            opcao = reader.getIntegerNumber("opção");
            switch(opcao){
                case 1:
                    String nomeEmpregado = reader.getText("Nome?");
                    int codEmpregado = reader.getIntegerNumber("Codigo?");
                    Empregado empregado = new Empregado(nomeEmpregado, codEmpregado);
                    empresa.novoEmpregado(empregado);
                    break;
                case 2:
                    empresa.showList();
                    break;
                case 3:
                    String categoria = reader.getText("Categoria do Empregado?");
                    empresa.showListCategoria(categoria);
                    break;
                case 4:
                    int codEmpregado2 = reader.getIntegerNumber("Codigo do Empregado?");
                    for(Empregado emp : empresa.getListaEmpregado()){
                        if(emp.getCodigoEmpregado() == codEmpregado2){
                            emp.fichaEmpregado();
                        }
                    }
                    break;      
            }
            
        } while (opcao > 0 && opcao <= 4);
        return opcao;
    }
    public int menuVeiculo(){
        System.out.println("                        ");
        System.out.println("***Veiculos da Empresa***");
        System.out.println("1 – Todos os veiculos");
        System.out.println("2 – Veiculos disponiveis");
        System.out.println("3 – Atribuir Empregado a veiculo.");
        System.out.println("4 - Verificar um unico veiculo");
        System.out.println("5 - Definir o consumo médio dos veiculos");
        System.out.println("0 - Sair");
        System.out.println("Escolha a sua opção:");
        int opcao;
        do {
            opcao = reader.getIntegerNumber("opção");
            switch(opcao){
                case 1:
                    empresa.showListaVeiculos();
                    break;
                case 2:
                    empresa.showVeiculosDisponiveis();
                    break;
                case 3:
                    int codEmp = reader.getIntegerNumber("Codigo empregado: ");
                    for(Empregado empregado: empresa.getListaEmpregado()){
                        if(empregado.getCodigoEmpregado() == codEmp){
                           String nome_veiculo = reader.getText("Nome Veiculo: ");
                           for(Veiculos vei : empresa.getListaVeiculos()){
                               if(vei != null){
                                if(vei.getNomeVeiculo().equals(nome_veiculo)){
                                    empresa.atribuirEmpregadosaVeiculos(empregado, vei);
                                }

                                }
                           }
                        }
                    }
                    break;
                case 4:
                    String nomeVeiculo = reader.getText("Nome do Veiculo?");
                    for(Veiculos v : empresa.getListaVeiculos()){
                        if(v != null){
                        if(v.getNomeVeiculo().equals(nomeVeiculo)){
                            System.out.println(v);
                        }
                        }
                    }
                    break;
                    
                case 5:
                    String nomeVeiculoConsumo = reader.getText("Nome do Veiculo?");
                    for(Veiculos v : empresa.getListaVeiculos()){
                        if(v != null){
                        if(v.getNomeVeiculo().equals(nomeVeiculoConsumo)){
                            int consumo = reader.getIntegerNumber("Consumo médio do veiculo?");
                            v.setConsumoMédio(consumo);
                        }
                        }
                    }
            }
            
        } while (opcao > 0 && opcao <= 3);
        return opcao;
    }
    
    public int menuCustos(){
        System.out.println("                        ");
        System.out.println("***Custos da Empresa***");
        System.out.println("1 – Custos anuais");
        System.out.println("2 – Custos semestrais");
        System.out.println("3 – Custos trimestrais.");
        System.out.println("0 - Sair");
        System.out.println("Escolha a sua opção:");
        int opcao;
        do {
            opcao = reader.getIntegerNumber("opção");
            switch(opcao){
                case 1:
                    System.out.println(empresa.CustosAnuais() + " euros.");
                    break;
                case 2:
                    System.out.println(empresa.CustosSemestrais()+ " euros.");
                    break;
                case 3:
                    int trimestres = reader.getIntegerNumber("Trimestre");
                    System.out.println(empresa.Custostrimestrais(trimestres) + " euros.");
                    break;
            }
            
        } while (opcao > 0 && opcao <= 3);
        return opcao;
 
    }
    
    public int menuCategoria(){
        System.out.println("                        ");
        System.out.println("***Salário por categoria***");
        System.out.println("1 – Gestor");
        System.out.println("2 – Normal");
        System.out.println("3 – Comercial.");
        System.out.println("4 – Motorista");
        System.out.println("0 - Sair");
        System.out.println("Escolha a sua opção:");
        int opcao;
        do {
            opcao = reader.getIntegerNumber("opção");
            switch(opcao){
                case 1:
                    System.out.println(empresa.SalárioGestor() + " euros");
                    break;
                case 2:
                    System.out.println(empresa.SaláriosNormal()+ " euros" );
                    break;
                case 3:
                    System.out.println(empresa.SaláriosComerciais()+ " euros");
                    break;
                case 4:
                    System.out.println(empresa.SalárioMotorista()+ " euros");
                    break;
            }
            
        } while (opcao > 0 && opcao <= 4);
        return opcao;
    }
}

