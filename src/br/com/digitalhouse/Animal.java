package br.com.digitalhouse;

public abstract class Animal {

    private String tamanho;
    private String raca;

    public Animal(String novoTamanho, String novaRaca){
        tamanho = novoTamanho;
        raca = novaRaca;

    }

    public Animal(){


    }


    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        raca = raca;
    }

    public abstract boolean ehMamifero();




}
