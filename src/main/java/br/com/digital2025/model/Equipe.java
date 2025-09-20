package br.com.digital2025.model;

import java.util.List; // Importa List para armazenar membros da equipe

// Classe que representa uma equipe de trabalho vinculada a um projeto
public class Equipe {

    // Atributo: ID único da equipe
    private int id;

    // Atributo: Nome da equipe (ex: "Frontend", "Backend", "QA")
    private String nome;

    // Atributo: ID do projeto ao qual esta equipe pertence
    private int idProjeto;

    // Atributo: Lista de usuários (membros) que compõem esta equipe
    private List<Usuario> membros;

    // Construtor padrão
    public Equipe() {}

    // Construtor com parâmetros para criar uma nova equipe
    public Equipe(String nome, int idProjeto) {
        this.nome = nome;           // Define o nome da equipe
        this.idProjeto = idProjeto; // Define o projeto ao qual a equipe está vinculada
    }

    // Getter: Retorna o ID da equipe
    public int getId() { return id; }
    // Setter: Define o ID da equipe
    public void setId(int id) { this.id = id; }

    // Getter: Retorna o nome da equipe
    public String getNome() { return nome; }
    // Setter: Define o nome da equipe
    public void setNome(String nome) { this.nome = nome; }

    // Getter: Retorna o ID do projeto vinculado
    public int getIdProjeto() { return idProjeto; }
    // Setter: Define o ID do projeto vinculado
    public void setIdProjeto(int idProjeto) { this.idProjeto = idProjeto; }

    // Getter: Retorna a lista de membros da equipe
    public List<Usuario> getMembros() { return membros; }
    // Setter: Define os membros da equipe
    public void setMembros(List<Usuario> membros) { this.membros = membros; }
}