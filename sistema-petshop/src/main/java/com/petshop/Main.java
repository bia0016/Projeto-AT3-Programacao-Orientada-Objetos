package com.petshop;
import java.util.Scanner;
import java.util.List;

import dao.AnimalDAO;
import dao.ClienteDAO;
import dao.FuncionarioDAO;
import hibernateUtil.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcao;
        ClienteDAO clienteDao = new ClienteDAO();
        AnimalDAO animalDao = new AnimalDAO();
        dao.ServicoDAO servicoDao = new dao.ServicoDAO();
        FuncionarioDAO funcionarioDao = new FuncionarioDAO();
        Funcionario f1 = new Funcionario("Calie", "00 98765-4321", "calievet.petshop@vet.com.br", "Médico Veterinário", 1234.56);
        funcionarioDao.save(f1);
        System.out.println("ID-Funcionário gerado: " + f1.getId());
        
        do{

            System.out.println("**----== Bem-Vindo(a) ao PetShop ==----**");
            System.out.println("---- Por favor digite uma opção ----");
            System.out.println("1. Cadastrar cliente");
            System.out.println("2. Cadastrar pet");
            System.out.println("3. Cadastrar serviço");
            System.out.println("4. Visualizar cliente cadastrado");
            System.out.println("5. Visualizar pet cadastrado");
            System.out.println("6. Visualizar serviço cadastrado");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            sc.nextLine();
            
            switch(opcao){
                case 1:
                System.out.println("-- Cadastro de Cliente --");
                System.out.println("Nome: ");
                String nomeC = sc.nextLine();
                System.out.println("Telefone: ");
                String telC = sc.nextLine();
                System.out.println("Email: ");
                String emailC = sc.nextLine();
                System.out.println("Endereço: ");
                String endC = sc.nextLine();
                Cliente c1 = new Cliente(nomeC, telC, emailC, endC);
                clienteDao.save(c1);
                System.out.println("Cliente cadastrado!");
                System.out.println("ID-Cliente gerado: " + c1.getId());
                break;

                case 2:
                System.out.println("-- Cadastro de Pet --");
                List<Cliente> clientes = clienteDao.listAll();
                if (clientes.isEmpty()) {
                    System.out.println("Nenhum cliente cadastrado. Cadastre um cliente antes de cadastrar o pet.");
                    break;
                }
                System.out.println("Clientes cadastrados:");
                for (Cliente cl : clientes) {
                    System.out.println(cl.getId() + " - " + cl.getNome());
                }
                System.out.println("Digite o ID do dono: ");
                Integer clienteID = sc.nextInt();
                sc.nextLine();
                Cliente donoP = clienteDao.findById(clienteID);
                if (donoP == null) {
                    System.out.println("Cliente não encontrado. Operação cancelada.");
                    break;
                }
                System.out.println("Nome do pet: ");
                String nomeP = sc.nextLine();
                System.out.println("Espécie: ");
                String esP = sc.nextLine();
                System.out.println("Raça: ");
                String racaP = sc.nextLine();
                Animal a1 = new Animal(nomeP, esP, racaP, donoP);
                animalDao.save(a1);
                System.out.println("Pet cadastrado!");
                System.out.println("ID-Pet gerado: " + a1.getIdAnimal());
                break;

                case 3:
                System.out.println("-- Cadastro de Serviço --");
                System.out.println("Tipo de serviço (1-Banho, 2-Tosa, 3-Vacinacao, 4-Consulta): ");
                int tipoServ = sc.nextInt();
                sc.nextLine();
                switch(tipoServ) {
                    case 1:
                        System.out.println("- Banho -");
                        System.out.println("Produto utilizado: ");
                        String produto = sc.nextLine();
                        Banho banho = new Banho(produto);
                        System.out.println("Serviço de Banho cadastrado!");
                        System.out.println("ID-Serviço-Banho gerado: " + banho.getId());
                        break;
                    case 2:
                        System.out.println("- Tosa -");
                        System.out.println("Tipo de tosa: ");
                        String tipo = sc.nextLine();
                        Tosa tosa = new Tosa(tipo);
                        System.out.println("Serviço de Tosa cadastrado!");
                        System.out.println("ID-Serviço-Tosa gerado: " + tosa.getId());
                        break;
                    case 3:
                        System.out.println("- Vacinação -");
                        System.out.println("Nome da vacina: ");
                        String vacina = sc.nextLine();
                        Vacinacao vacinacao = new Vacinacao(vacina);
                        System.out.println("Serviço de Vacinação cadastrado!");
                        System.out.println("ID-Serviço-Vacinação gerado: " + vacinacao.getId());
                        break;
                    case 4:
                        System.out.println("- Consulta -");
                        System.out.println("Especialidade: ");
                        String especialidade = sc.nextLine();
                        Consulta consulta = new Consulta(especialidade, f1);
                        System.out.println("Consulta cadastrada!");
                        System.out.println("ID-Serviço-Consulta gerado: " + consulta.getId());
                        System.out.println("ID-Vet: " + f1.getId() + " | Médico Veterinário: " + f1.getNome());
                        break;
                    default:
                        System.out.println("Tipo inválido!");
                }
                break;

                case 4:
                System.out.println("-- Visualizar clientes cadastrados --");
                List<Cliente> listaClientes = clienteDao.listAll();
                if(listaClientes.isEmpty()) {
                    System.out.println("Nenhum cliente cadastrado ainda.");
                }else{
                    for(Cliente c : listaClientes){
                        System.out.println("ID-Cliente: " + c.getId());
                        System.out.println("Nome: " + c.getNome());
                        System.out.println("Telefone: " + c.getTelefone());
                        System.out.println("Email: " + c.getEmail());
                        System.out.println("Endereço: " + c.getEndereco());
                        System.out.println("---------------------- == ----------------------");
                    }
                }
                break;

                case 5:
                System.out.println("-- Visualizar pets cadastrados --");
                List<Animal> listaAnimais = animalDao.listAll();
                if(listaAnimais.isEmpty()) {
                    System.out.println("Nenhum pet cadastrado ainda.");
                }else{
                    for(Animal a : listaAnimais){
                        System.out.println("ID-Pet: " + a.getIdAnimal());
                        System.out.println("Nome do pet: " + a.getNome());
                        System.out.println("Espécie: " + a.getEspecie());
                        System.out.println("Raça: " + a.getRaca());
                        System.out.println("Dono: " + a.getDono());
                        System.out.println("---------------------- == ----------------------");
                    }
                }
                break;

                case 6:
                System.out.println("-- Visualizar serviços cadastrados --");
                List<Servico> listaServicos = servicoDao.listAll();
                if(listaServicos.isEmpty()) {
                    System.out.println("Nenhum serviço cadastrado ainda.");
                }else{
                    for(Servico s : listaServicos){
                        System.out.println("ID-Serviço: " + s.getId());
                        System.out.println("Nome do serviço: " + s.getNome());
                        System.out.println("Valor: " + s.getValor());
                        System.out.println("Horário: " + s.getHorario());
                        System.out.println("Data: " + s.getData());
                        System.out.println("Duração: " + s.getDuracao());
                        System.out.println("Pet: " + s.getPet());
                        System.out.println("---------------------- == ----------------------");
                    }
                }
                break;

                case 0:
                System.out.println("Sistema fechado");
                    break;

                default:
                    System.out.println("Opção inválida!\n");
            }

        }while(opcao != 0);

        HibernateUtil.shutdown();
        sc.close();
    }
}

