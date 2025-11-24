package com.petshop;

public class Banho extends Servico {
    private String produtoUtilizado;

    public Banho(String produtoUtilizado) {
        super(id, nome, valor, horario, data, duracao, pet);
        this.produtoUtilizado = produtoUtilizado;
    }

    public String getProdutoUtilizado() {
        return this.produtoUtilizado;
    }

    public void setProdutoUtilizado(String produtoUtilizado) {
        this.produtoUtilizado = produtoUtilizado;
    }

    @Override
    public void exibirServico(){
        System.out.println("Produto utilizado: " + this.produtoUtilizado);
    }
}
