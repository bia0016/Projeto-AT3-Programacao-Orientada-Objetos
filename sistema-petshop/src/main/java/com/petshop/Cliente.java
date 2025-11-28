package com.petshop;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("tbl_cliente")

public class Cliente extends Pessoa{
    private String endereco;

    public Cliente(){}

    public Cliente(String endereco) {
        super(null, "", "", endereco);
        this.endereco = endereco;
    }

    public Cliente(String nome, String telefone, String email, String endereco) {
        super(null, nome, telefone, email);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public void exibirInfo(){
        System.out.println("ID: " + this.getId());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Endereço: " + this.endereco);
    }
}
