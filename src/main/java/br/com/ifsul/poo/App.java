package br.com.ifsul.poo;

import java.math.BigDecimal;

import br.com.ifsul.poo.model.Conta;
import br.com.ifsul.poo.model.Pessoa;


public class App 
{
    public static void main( String[] args ) {
        

        // Estamos instanciando uma Pessoa
        // onde o primeiro Pessoa seguinifica o tipo
        // proprietario o nome do meu objeto (pode se pensar como uma variavel)
        // e por ultimo estamos instanciando com new a Pessoa() 
        // utilizando o contrutor default
        Pessoa proprietario = new Pessoa();

        // Estamos instanciando uma conta
        // onde o primeiro conta seguinifica o tipo
        // minhaConta o nome do meu objeto (pode se pensar como uma variavel)
        // e por ultimo estamos instanciando com new a Conta() 
        // utilizando o contrutor sobrecarregado que temos acesso agora
        // onde devemos passar uma instancia de Pessoa que nesse caso chamos de
        // proprietario
        Conta minhaConta = new Conta(proprietario);
        
        // utilizamos nosso objeto minhaConta
        // para setar (colocar) valores dentro dos nossos
        // atributos - OBS (isso nao eh um boa pratica, mas depois
        // discutiremos sobre isso)
        minhaConta.setNumero(123458);
        minhaConta.setAgencia(0125);
        minhaConta.setSaldo(BigDecimal.ZERO);
    

        // utilizando o construtor sobrecarregado para instanciar
        // a minhaContaSobrecarregada ja com valores nos atributos
        // que passamos nos parametros
        Conta minhaContaSobrecarregada = 
            new Conta(8974, 01, BigDecimal.ZERO, proprietario);

    }
}
