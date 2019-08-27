package br.com.ifsul.poo.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Conta {

    private int numero;
    private int agencia;
    private BigDecimal saldo;
    private String tipoConta;
    private LocalDate dataAniversario;
    private Pessoa proprietario;
    private Pessoa gerente;

    // Contrutor vazio tambem chamado de
    // construtor default
    // deixamos esse como protected para nao ter acesso
    // fora do escopo da nossa classe conta
    // (OBS. é possivel acessar, mas via de regra não)
    protected Conta() {
    }

    // Construtur sobrecarregado, pois nao faz sentido termos uma conta sem
    // proprietario, esse será o construtor onde o programador poderá
    // criar instacias da classe conta
    public Conta(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    // Contrutor sobrecarregado onde passamos parametros
    // para ser contruido um objeto com valores
    public Conta(int numero, int agencia, BigDecimal saldo, Pessoa proprietario) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.proprietario = proprietario;
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



    public BigDecimal getSaldo() {
        return this.saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public LocalDate getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(LocalDate dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Pessoa getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    public Pessoa getGerente() {
        return this.gerente;
    }

    public void setGerente(Pessoa gerente) {
        this.gerente = gerente;
    }

}
