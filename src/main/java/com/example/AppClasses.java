package com.example;

public class AppClasses {
    
    public static void main(String[] args) {
        System.out.println("Criando classes");

        Cliente cliente1 = new Cliente();
        cliente1.setRenda(0.5);
        System.out.println("cliente1.renda" + cliente1.getRenda());
        System.out.println("cliente1.especial" + cliente1.isEspecial());
        System.out.println("cliente1.sexo" + cliente1.getSexo());

        System.out.println();
        Cliente cliente2 = new Cliente(-1000,'F');

        System.out.println("cliente2.renda" + cliente2.getRenda());
        System.out.println("cliente2.especial" + cliente2.isEspecial());
        System.out.println("cliente2.sexo" + cliente2.getSexo());

    }
}
