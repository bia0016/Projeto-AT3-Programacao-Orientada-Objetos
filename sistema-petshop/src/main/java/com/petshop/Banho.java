package com.petshop;

public class Banho extends Servico {
    private String produtoUtilizado;

    public Banho(String produtoUtilizado) {
        super(null, produtoUtilizado, 0.0, "", "", "", null);
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
        System.out.println("Valor R$: " + this.getValor());
        System.out.println("Produto utilizado: " + this.produtoUtilizado);
        if(this.getPet() != null){
            System.out.println("ID-Pet: " + this.getPet().getIdAnimal() + " | Nome do pet: " + this.getPet().getNome());
        }
    }
}
