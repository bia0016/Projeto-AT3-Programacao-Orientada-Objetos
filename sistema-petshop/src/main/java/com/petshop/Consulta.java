package com.petshop;

public class Consulta extends Servico {
    private String especialidade;
    private Funcionario medicoVet;

    public Consulta(String especialidade, Funcionario medicoVet) {
        super(null, "", 0.0, "", "", "", null);
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
        System.out.println("Valor R$: " + this.getValor());
        System.out.println("Especialidade: " + this.especialidade);
        if(this.getMedicoVet() != null){
            System.out.println("ID-MédicoVet: " + this.medicoVet.getId() + " | Médico Veterinário: " + this.medicoVet.getNome());
        }
    }
}
