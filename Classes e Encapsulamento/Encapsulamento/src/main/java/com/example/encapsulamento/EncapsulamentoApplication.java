package com.example.encapsulamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class EncapsulamentoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EncapsulamentoApplication.class, args);

       // Pessoa pessoa = new Pessoa();
       // pessoa.setNome("João");
       // pessoa.setIdade(20);

      //  System.out.println("Nome: " + pessoa.getNome());
      //  System.out.println("Idade: " + pessoa.getIdade());

        var pessoaRecord = new PessoaRecord("Joao", 20);
        System.out.println(pessoaRecord);
        
       
    }

}
