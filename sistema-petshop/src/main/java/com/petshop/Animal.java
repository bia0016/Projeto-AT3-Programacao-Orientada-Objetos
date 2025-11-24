package com.petshop;

public class Animal {
    private Integer idAnimal;
    private String nome;
    private String especie;
    private String raca;
    //por @ManyToOne depois
    private Cliente dono;

    public Animal(Integer idAnimal, String nome, String especie, String raca, Cliente dono) {
        this.idAnimal = idAnimal;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.dono = dono;
    }

    public Integer getIdAnimal() {
        return this.idAnimal;
    }

    public void setIdAnimal(Integer idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Cliente getDono() {
        return this.dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public void exibirInfoPet(){
        System.out.println("ID-Pet: " + this.idAnimal);
        System.out.println("Nome: " + this.nome);
        System.out.println("Espécie: " + this.especie);
        System.out.println("Raça: " + this.raca);
        System.out.println("Dono: " + this.dono);
    }
}
