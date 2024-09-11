package com.mycompany.exercicios;
import java.util.Scanner;

public class Aluno{
    private String matricula;
    private double nota;
    private String conceito;

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public double getNota(){
        return nota;
    }

    public void setNota(double nota){
        this.nota = nota;
        setConceito(nota); 
    }

    public String getConceito(){
        return conceito;
    }

    private void setConceito(double nota){
        if (nota >= 9 && nota <= 10){
            this.conceito = "A";
        } else if (nota >= 7 && nota < 9){
            this.conceito = "B";
        } else if (nota >= 5 && nota < 7){
            this.conceito = "C";
        } else if (nota >= 0 && nota < 5){
            this.conceito = "D";
        } else {
            this.conceito = "Nota inválida";
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")){
            Aluno aluno = new Aluno();

            System.out.print("Digite o número de matrícula do aluno: ");
            aluno.setMatricula(scanner.nextLine());

            System.out.print("Digite a nota do aluno: ");
            aluno.setNota(scanner.nextDouble());

            System.out.println("Aluno: " + aluno.getMatricula());
            System.out.println("Nota: " + aluno.getNota());
            System.out.println("Conceito: " + aluno.getConceito());

            System.out.print("Deseja informar dados de outro aluno? (s/n): ");
            continuar = scanner.next();
            scanner.nextLine(); 
        }

        scanner.close();
    }
}