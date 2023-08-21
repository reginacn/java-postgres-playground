package com.example;

import java.util.Scanner;

public class AppScanner {
    
    public static void main(String[] args) {
        System.out.println("Criando classes");

        Cliente cliente1 = new Cliente();
        cliente1.setRenda(0.5);
        System.out.println("cliente1.renda" + cliente1.getRenda());
        System.out.println("cliente1.especial" + cliente1.isEspecial());
        System.out.println("cliente1.sexo" + cliente1.getSexo());

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite algo");
        var dadodigitado = scanner.nextLine();
        System.out.println("você digitou: " + dadodigitado);

    }
}
