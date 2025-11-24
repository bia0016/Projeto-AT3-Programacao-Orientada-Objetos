package com.petshop;

public class Vacinacao extends Servico{
    private String nomeVacina;

    public Vacinacao(String nomeVacina) {
        super(id, nome, valor, horario, data, duracao, pet);
        this.nomeVacina = nomeVacina;
    }

    public String getNomeVacina() {
        return this.nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    @Override
    public void exibirServico(){
        System.out.println("Noma da vacina: " + this.nomeVacina);
    }
}
