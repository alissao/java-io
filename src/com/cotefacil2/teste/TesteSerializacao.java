package com.cotefacil2.teste;

import com.cotefacil2.modelos.Cliente;

import java.io.*;


public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Cliente cliente = new Cliente();
//        cliente.setNome("Nico");
//        cliente.setProfissao("Dev");
//        cliente.setCpf("12356445612");

//        String nome = "Nico Steppat";
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//        oos.writeObject(cliente);
//        oos.close();
//        System.out.println(cliente);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getCpf());

    }

}
