package com.example;

public class Cliente{
    private String nome;
    private double renda;
    private char sexo;
    private int anoNascimento;
    private boolean especial;

    public Cliente(){
        System.out.println("Usando o constructor sem parametros");
        double aleatorio = Math.random();
        if (aleatorio > 0.5){
            especial = true;
        } else {
            especial = false;
        }
    }

    public Cliente(double renda, char sexo){
        this();
        System.out.println("Usando o constructor com parametros");
        setRenda(renda);
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        //this.nome = nome.toUpperCase();
        this.nome = nome.toLowerCase().trim();
    }


    public double getRenda() {
        return renda;
    }
    public void setRenda(double renda) {
        if (renda <= 0){
            System.out.println("A renda deve ser maior que 0");
        } else {
            this.renda = renda;
        }        
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public boolean isEspecial() {
        return especial;
    }
    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
}