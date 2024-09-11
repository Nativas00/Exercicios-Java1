package com.mycompany.exercicios;
import java.util.Scanner;

public class Professor {
    private String nome;
    private String cpf;
    private String titulacao;
    private double salario;
    private double contribuicao;

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

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
        calcularContribuicao();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        calcularContribuicao();
    }

    public double getContribuicao() {
        return contribuicao;
    }

    private void calcularContribuicao() {
        if (titulacao.equalsIgnoreCase("especialista")) {
            contribuicao = salario * 0.012;
        } else if (titulacao.equalsIgnoreCase("mestre")) {
            contribuicao = salario * 0.014;
        } else if (titulacao.equalsIgnoreCase("doutor")) {
            contribuicao = salario * 0.016;
        } else {
            contribuicao = 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalArrecadado = 0;
        int mestresCount = 0;
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            Professor professor = new Professor();

            System.out.print("Digite o nome do professor: ");
            professor.setNome(scanner.nextLine());

            System.out.print("Digite o CPF do professor: ");
            professor.setCpf(scanner.nextLine());

            System.out.print("Digite a titulação do professor (Doutor, Mestre, Especialista): ");
            professor.setTitulacao(scanner.nextLine());

            System.out.print("Digite o salário do professor: ");
            professor.setSalario(scanner.nextDouble());

            System.out.println("Nome: " + professor.getNome());
            System.out.println("CPF: " + professor.getCpf());
            System.out.println("Titulação: " + professor.getTitulacao());
            System.out.println("Salário: " + professor.getSalario());
            System.out.println("Contribuição sindical: " + professor.getContribuicao());

            totalArrecadado += professor.getContribuicao();
            if (professor.getTitulacao().equalsIgnoreCase("mestre")) {
                mestresCount++;
            }

            System.out.print("Deseja informar dados de outro professor? (s/n): ");
            continuar = scanner.next();
            scanner.nextLine();
        }

        System.out.println("Total arrecadado pelo sindicato: " + totalArrecadado);
        System.out.println("Quantidade de professores que são Mestres: " + mestresCount);

        scanner.close();
    }
}
