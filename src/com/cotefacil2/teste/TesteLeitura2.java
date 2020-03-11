package com.cotefacil2.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(new File("contas.csv"), "UTF-8");
        while (scan.hasNextLine()) {

            String linha = scan.nextLine();
            System.out.println(linha);
//            String[] valores = linha.split(",");
//            System.out.println(Arrays.toString(valores));
//            System.out.println(valores[3]);

            Scanner linhaScan = new Scanner(linha);
            linhaScan.useLocale(Locale.US);
            linhaScan.useDelimiter(",");

            String tipoConta = linhaScan.next();
            int agencia = linhaScan.nextInt();
            int numero = linhaScan.nextInt();
            String titular = linhaScan.next();
            double saldo = linhaScan.nextDouble();

            System.out.format(new Locale("pt", "BR") ,"%s - %04d-%d, %s: %f",
                    tipoConta, agencia, numero, titular, saldo);

        }

        scan.close();

    }

}
