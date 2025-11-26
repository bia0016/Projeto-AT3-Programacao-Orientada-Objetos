package com.petshop;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("funcionario")

public class Funcionario extends Pessoa{
    private String cargo;
    private Double salario;

    public Funcionario(String cargo, Double salario) {
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void exibirInfo(){
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salario: " + this.salario);
    }
}
