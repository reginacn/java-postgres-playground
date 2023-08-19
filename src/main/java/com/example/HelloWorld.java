package com.example;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World: " + Math.random());

        System.out.println("Hello testando tipos núméricos");
        
        int idade = 10;        
        System.out.println("a idade é: " + idade);
        double peso = 80.5;
        System.out.println("o peso é: " + peso);

        int idadeInt = 85;
        //cast = conversão de tipo;
        byte idadeByteConvertida = (byte)idadeInt; //só converter se eu sei que realmente cabe pelo tamanho do tipo. Senão pode dar estouro
        System.out.println("* idadeInt: " + idadeInt + " * idadeByteConvertida: " + idadeByteConvertida);

        char sexo = 'F';
        System.out.println("sexo: " + sexo);      
          
        boolean necessidadesEspeciais = false;
        System.out.println("tem necessidades especiais: " + necessidadesEspeciais);

    }
}
