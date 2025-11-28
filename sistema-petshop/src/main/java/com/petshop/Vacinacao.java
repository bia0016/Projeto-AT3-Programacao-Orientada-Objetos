package com.petshop;

public class Vacinacao extends Servico{
    private String nomeVacina;

    public Vacinacao(String nomeVacina) {
        super(null, "", 0.0, "", "", "", null);
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
        System.out.println("ID-Serviço: " + this.getId());
        System.out.println("Valor R$: " + this.getValor());
        System.out.println("Nome da vacina: " + this.nomeVacina);
        if(this.getPet() != null){
            System.out.println("ID-Pet: " + this.getPet().getIdAnimal() + " | Nome do pet: " + this.getPet().getNome());
        }
    }
}
