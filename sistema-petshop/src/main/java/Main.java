import java.util.ArrayList;
import java.util.Scanner;

import com.petshop.Pessoa;
import com.petshop.Servico;
import com.petshop.Cliente;
import com.petshop.Funcionario;
import com.petshop.Animal;
import com.petshop.Banho;
import com.petshop.Tosa;
import com.petshop.Vacinacao;
import com.petshop.Consulta;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        do{
            System.out.println("**----== Bem-Vindo(a) ao PetShop ==----**");
            System.out.println("---- Por favor digite uma opção ----");
            System.out.println("1. Cadastrar cliente");
            System.out.println("2. Cadastrar pet");
            System.out.println("3. Cadastrar serviço");
            System.out.println("4. Visualizar cliente cadastrado");
            System.out.println("5. Visualizar pet cadastrado");
            System.out.println("6. Visualizar serviço cadastrado");
            System.out.println("7. Remover cliente");
            System.out.println("8. Remover pet");
            System.out.println("9. Remover serviço");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            sc.nextLine();
            
            switch(opcao){
                case 1:
                System.out.println("-- Cadastro de Cliente --");
                System.out.println("Nome: ");
                String nomeU = sc.nextLine();
                System.out.println("Telefone: ");
                String telU = sc.nextLine();
                System.out.println("Email: ");
                String emailU = sc.nextLine();
                System.out.println("Endereço: ");
                String enderecoU = sc.nextLine();
                Cliente c1 = new Cliente(enderecoU);
                System.out.println("Cliente cadastrado!");
                break;

                case 2:
                System.out.println("-- Cadastro de Pet --");
                System.out.println("Nome do pet: ");
                String nomeP = sc.nextLine();
                System.out.println("Espécie: ");
                String esP = sc.nextLine();
                System.out.println("Raça: ");
                String racaP = sc.nextLine();
                System.out.println("Dono: ");
                String donoP = sc.nextLine();
                Animal a1 = new Animal(null, nomeP, esP, racaP, c1);
                System.out.println("Pet cadastrado!");
                break;

                case 3:
                System.out.println("-- Cadastro de Serviço --");
                System.out.println("Nome do serviço: ");
                String nomeS = sc.nextLine();
                System.out.println("Valor: ");
                Double valS = sc.nextDouble();
                System.out.println("Horário: ");
                String horaS = sc.nextLine();
                System.out.println("Data: ");
                String dataS = sc.nextLine();
                System.out.println("Duração: ");
                String tempoS = sc.nextLine();
                System.out.println("Pet: ");
                String petS = sc.nextLine();
                Servico s1 = new Servico(nomeS, valS, horaS, dataS, tempoS, a1);
                System.out.println("Serviço cadastrado!");
                break;

                case 4:
                System.out.println("-- Visualizar clientes cadastrados --");
                System.out.println("Nome: ");
                System.out.println("Telefone: ");
                System.out.println("Email: ");
                System.out.println("Endereço: ");
                System.out.println("---------------------- == ----------------------");
                break;

                case 5:
                System.out.println("-- Visualizar pets cadastrados --");
                System.out.println("Nome do pet: ");
                System.out.println("Espécie: ");
                System.out.println("Raça: ");
                System.out.println("Dono: ");
                System.out.println("---------------------- == ----------------------");
                break;

                case 6:
                System.out.println("-- Visualizar serviços cadastrados --");
                System.out.println("Nome do serviço: ");
                System.out.println("Valor: ");
                System.out.println("Horário: ");
                System.out.println("Data: ");
                System.out.println("Duração: ");
                System.out.println("Pet: ");
                System.out.println("---------------------- == ----------------------");
                break;

                case 7:
                System.out.println("-- Remover Cliente --");
                System.out.println("Nome: ");
                String nomeU = sc.nextLine();
                System.out.println("Telefone: ");
                String telU = sc.nextLine();
                System.out.println("Email: ");
                String emailU = sc.nextLine();
                System.out.println("Endereço: ");
                String enderecoU = sc.nextLine();
                Cliente c1 = new Cliente(enderecoU);
                System.out.println("Cliente cadastrado!");
                break;

                case 8:
                System.out.println("-- Remover Pet --");
                System.out.println("Nome: ");
                String nomeU = sc.nextLine();
                System.out.println("Telefone: ");
                String telU = sc.nextLine();
                System.out.println("Email: ");
                String emailU = sc.nextLine();
                System.out.println("Endereço: ");
                String enderecoU = sc.nextLine();
                Cliente c1 = new Cliente(enderecoU);
                System.out.println("Cliente cadastrado!");
                break;

                case 9:
                System.out.println("-- Remover Serviço --");
                System.out.println("Nome: ");
                String nomeU = sc.nextLine();
                System.out.println("Telefone: ");
                String telU = sc.nextLine();
                System.out.println("Email: ");
                String emailU = sc.nextLine();
                System.out.println("Endereço: ");
                String enderecoU = sc.nextLine();
                Cliente c1 = new Cliente(enderecoU);
                System.out.println("Cliente cadastrado!");
                break;

                case 0:
                System.out.println("Sistema fechado");
                    break;

                default:
                    System.out.println("Opção inválida!\n");
            }

        }while(opcao != 0);
    }
}
