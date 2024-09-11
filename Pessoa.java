package com.mycompany.exercicios;
import java.time.LocalDate;
import java.time.Period;

public class Pessoa{
    private String nome;
    private LocalDate dataDeNascimento;
    private double altura;

    public Pessoa(String nome, LocalDate dataDeNascimento, double altura){
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento(){
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento){
        this.dataDeNascimento = dataDeNascimento;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public int calcularIdade(){
        LocalDate dataAtual = LocalDate.now();
        if (dataDeNascimento != null) {
            return Period.between(dataDeNascimento, dataAtual).getYears();
        } else {
            return 0;
        }
    }

    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataDeNascimento);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Idade: " + calcularIdade() + " anos");
    }

    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Natividade", LocalDate.of(2005, 3, 18), 1.85);
        pessoa.imprimirDados();
    }
}