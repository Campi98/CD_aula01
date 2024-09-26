/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cv_digital_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author joaoc
 */
public class GerirPessoas {
    private LinkedList<Pessoa> pessoas = new LinkedList<>();

    public void addPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public Pessoa procurarPessoaPorEmail(String email) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getEmail().equals(email)) {
                return pessoa;
            }
        }
        return null;
    }

    public LinkedList<Pessoa> listarPessoas() {
        return pessoas;
    }
    
    public void guardarEmFicheiro() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("pessoas.txt"))) {
            for (Pessoa pessoa : pessoas) {
                writer.write(pessoa.getNome() + ";" + pessoa.getEmail() + ";" + pessoa.getEventos());
                writer.newLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void carregarDeFicheiro() {
        try (BufferedReader reader = new BufferedReader(new FileReader("pessoas.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                if (dados.length == 3) {
                    Pessoa pessoa = new Pessoa(dados[0], dados[1], dados[2]);
                    pessoas.add(pessoa);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
}

}
