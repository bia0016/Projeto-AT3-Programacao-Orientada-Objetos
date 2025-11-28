package com.petshop;

public class Tosa extends Servico{
    private String tipoTosa;

    public Tosa(String tipoTosa) {
        super(null, "", 0.0, "", "", "", null);
        this.tipoTosa = tipoTosa;
    }

    public String getTipoTosa() {
        return this.tipoTosa;
    }

    public void setTipoTosa(String tipoTosa) {
        this.tipoTosa = tipoTosa;
    }

    @Override
    public void exibirServico(){
        System.out.println("ID-Serviço: " + this.getId());
        System.out.println("Valor R$: " + this.getValor());
        System.out.println("Tipo de tosa: " + this.tipoTosa);
        if(this.getPet() != null){
            System.out.println("ID-Pet: " + this.getPet().getIdAnimal() + " | Nome do pet: " + this.getPet().getNome());
        }
    }
}
