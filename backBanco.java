package CadasBancoEX;

public class backBanco {
    
    //Atributos
    private int nmrConta;
    private String nome;
    private double saldoConta;

    //Construtor
    public backBanco(int nmrConta, String nome, double saldoConta){
        this.nmrConta = nmrConta;
        this.nome = nome;
        this.saldoConta = saldoConta;
    }

    //Métodos para chamar os dados dos atributos
    public int getNmrConta(){
        return nmrConta;
    }

    public String getNome(){
        return nome;
    }

    public double getSaldoConta(){
        return saldoConta;
    }

    //métodos de adquirir dados
    public void setSaldoContaDeposito(double saldoConta){
        this.saldoConta = this.saldoConta + saldoConta;
    }

    public void setSaldoContaSaque(double saldoConta){
        this.saldoConta = this.saldoConta - saldoConta - 5;
    }

}
