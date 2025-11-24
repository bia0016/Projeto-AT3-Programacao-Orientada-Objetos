package com.petshop;

public class Tosa extends Servico{
    private String tipoTosa;

    public Tosa(String tipoTosa) {
        super(id, nome, valor, horario, data, duracao, pet);
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
        System.out.println("Tipo de tosa: " + this.tipoTosa);
    }
}
