package br.com.ifsul.poo;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.ifsul.poo.model.Conta;


public class App 
{
    public static void main( String[] args ) {
        
        // Estamos instanciando uma conta
        // onde o primeiro conta seguinifica o tipo
        // minhaConta o nome do meu objeto (pode se pensar como uma variavel)
        // e por ultimo estamos instanciando com new a Conta() 
        // utilizando o contrutor default
        Conta minhaConta = new Conta();
        
        // utilizamos nosso objeto minhaConta
        // para setar (colocar) valores dentro dos nossos
        // atributos - OBS (isso nao eh um boa pratica, mas depois
        // discutiremos sobre isso)
        minhaConta.setNumero(123458);
        minhaConta.setAgencia(0125);
        minhaConta.setNomeProprietario("Fulano Silva");
        minhaConta.setSaldo(BigDecimal.ZERO);
    

        // utilizando o construtor sobrecarregado para instanciar
        // a minhaContaSobrecarregada ja com valores nos atributos
        // que passamos nos parametros
        Conta minhaContaSobrecarregada = new Conta(8974, 01, "Rodrigo Freitas", 
         BigDecimal.ZERO);

         System.out.println("Cara essa conta foi criada com"
         + " o construtor default: " + minhaConta.getNomeProprietario());

         System.out.println("Cara essa conta foi criada com"
         + " o construtor sobrecarregada: " + minhaContaSobrecarregada.getNomeProprietario());

    }
}
