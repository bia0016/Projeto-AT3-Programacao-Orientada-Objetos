package com.petshop;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_servico")
public abstract class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Double valor;
    private String horario;
    private String data;
    private String duracao;
    @ManyToOne
    private Animal pet;

    public abstract void exibirServico();

    protected Servico(){}
    
    public Servico(Integer id, String nome, Double valor, String horario, String data, String duracao, Animal pet) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.horario = horario;
        this.data = data;
        this.duracao = duracao;
        this.pet = pet;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDuracao() {
        return this.duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public Animal getPet() {
        return this.pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    @Override
    public String toString(){
        return "ID: " + getId() + "\nNome: " + getNome() + "Valor: " + getValor() + "Horário: " +  getHorario() + "Data: " + getData() + "Duração: " + getDuracao() + "Pet: " + getPet();
    }
}
