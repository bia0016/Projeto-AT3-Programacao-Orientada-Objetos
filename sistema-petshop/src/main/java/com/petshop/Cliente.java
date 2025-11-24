package com.petshop;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("cliente")

public class Cliente extends Pessoa{
    private String endereco;

    public Cliente(String endereco) {
        super(id, nome, telefone, email);
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
        System.out.println("Endereço: " + this.endereco);
    }
}
