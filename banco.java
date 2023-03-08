package CadasBancoEX;

import java.util.Scanner;

public class banco {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int nmrConta;
        String nome;
        double saldoConta;
        int operacoes;
        double depositos;
        double saques;

        System.out.println("-BEM VINDO AO BANCO ONLINE-");
        System.out.println("Cadastre-se:");
        System.out.print("Numero da Conta: ");
        nmrConta = input.nextInt();

        //resolvendo o problema de nao ler string
        input.nextLine();

        System.out.print("Nome titular da conta: ");
        nome = input.nextLine();
        System.out.print("Deseja fazer um depósito inicial? 1.Sim, 2.Não: ");
        saldoConta = input.nextInt();

        //Lógica de depósito para a criação da conta
        if (saldoConta == 1){
            System.out.print("Informe o valor do depósito: ");
            saldoConta = input.nextInt();
        } else if (saldoConta == 2){
            saldoConta = 0;
        }

        //Construtor
        backBanco cadastro = new backBanco(nmrConta, nome, saldoConta);

        System.out.println("Numero da conta: " + cadastro.getNmrConta());
        System.out.println("Nome do Titular da Conta: " + cadastro.getNome());
        System.out.println("Saldo da Conta: " + cadastro.getSaldoConta());

        //Operações
        System.out.print("Oque deseja fazer? 1.Depósito, 2.Saque: ");
        operacoes = input.nextInt();

        if (operacoes == 1){
            System.out.print("Valor do depósito: ");
            depositos = input.nextDouble();
            cadastro.setSaldoContaDeposito(depositos);
            
        } else if (operacoes == 2){
            System.out.print("Valor do saque: ");
            saques = input.nextDouble();
            cadastro.setSaldoContaSaque(saques);
        }

        System.out.println("Numero da conta: " + cadastro.getNmrConta());
        System.out.println("Nome do Titular da Conta: " + cadastro.getNome());
        System.out.print("Saldo da Conta: " + cadastro.getSaldoConta());
        
        input.close();
    }
}
