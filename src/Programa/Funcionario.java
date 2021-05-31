package Programa;

public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;
    
    public Funcionario(String nome2, String cpf2, double salario2) {
	}
	public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "Funcionario [cpf=" + cpf + ", nome=" + nome + ", salario=" + salario + "]";
    }
