/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cv_digital_01;

/**
 *
 * @author joaoc
 */

public class Pessoa {
    private String nome;
    private String email;
    private String eventos;

    public Pessoa(String nome, String email, String eventos) {
        this.nome = nome;
        this.email = email;
        this.eventos = eventos;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getEventos() {
        return eventos;
    }
}
