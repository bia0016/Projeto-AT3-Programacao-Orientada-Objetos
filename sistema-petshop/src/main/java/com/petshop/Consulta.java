package com.petshop;

public class Consulta extends Servico {
    private String especialidade;
    private Funcionario medicoVet;


    public Consulta(String especialidade, Funcionario medicoVet) {
        this.especialidade = especialidade;
        this.medicoVet = medicoVet;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Funcionario getMedicoVet() {
        return this.medicoVet;
    }

    public void setMedicoVet(Funcionario medicoVet) {
        this.medicoVet = medicoVet;
    }
    
    @Override
    public void exibirServico(){
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("Médico veterinário: " + this.medicoVet);
    }
}
