package com.company;

public class Bolsista extends Aluno{
    private String bolsa;

    public void rebovarBolsa(){
    System.out.println("Renovando bolsa de " + this.nome);

    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + "é bolsista! pagamento facilitado");
    }

}
