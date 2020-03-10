package com.cotefacil2.teste;

import java.io.*;
import java.net.Socket;

public class TesteEscrita3 {

    public static void main(String[] args) throws IOException {

        Socket s = new Socket();

        //Fluxo de entrada com arquivo
        InputStream fis = s.getInputStream(); //System.in; //new FileInputStream("lorem.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        //Fluxo de saída com arquivo
        OutputStream fos = s.getOutputStream();//System.out; // new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while (linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();
        }

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna\n" +
                "aliqua.");
        bw.newLine();
        bw.newLine();
        bw.write("uahsduwhqhwjdlasjdojwi");

//        OutputStream

        bw.close();

    }

}
