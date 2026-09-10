package br.com.javabank.main;

import br.com.javabank.model.Agencia;
import br.com.javabank.model.Cliente;
import br.com.javabank.model.ContaBancaria;

public class App {
    public static void main(String[] args) throws Exception {


    Cliente cliente = new Cliente("123", "tomate", "tomate@gmail");

    Cliente cliente2 = new Cliente("123", "asdasd", "wdafe@gmail");

        if(cliente.equals(cliente2)){
            System.out.println("sao iguais");
        }else{

            System.out.println("sao diferentes");
        }


        ContaBancaria contabancaria = new ContaBancaria("123", 50, cliente);

        System.out.println(contabancaria.sacar(50.0));

        System.out.println(Agencia.getTotalContasAbertas());

    }
}
