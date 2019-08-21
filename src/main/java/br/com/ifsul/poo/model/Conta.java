package br.com.ifsul.poo.model;

import java.math.BigDecimal;

public class Conta {

    int numero;
    int agencia;
    String nomeProprietario;
    BigDecimal saldo;

    // Contrutor vazio tambem chamado de
    // construtor default
    public Conta() {
    }

    // Contrutor sobrecarregado onde passamos parametros
    // para ser contruido um objeto com valores
    public Conta(int numero, int agencia, String nomeProprietario, BigDecimal saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeProprietario = nomeProprietario;
        this.saldo = saldo;
    }

    // Abaixo getters e Setters, sao metodos que servem
    // para termos 'acesso' os nossos atributos 

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

}
