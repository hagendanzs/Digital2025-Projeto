package br.com.digital2025.model;

import java.time.LocalDate;  // Importa a classe para manipular datas
import java.util.List;      // Importa a interface List para armazenar equipes

// Classe que representa um projeto gerenciado no sistema
public class Projeto {

    // Atributo: ID único do projeto
    private int id;

    // Atributo: Nome do projeto (ex: "Sistema de Vendas")
    private String nome;

    // Atributo: Descrição detalhada do projeto
    private String descricao;

    // Atributo: Data de início do projeto
    private LocalDate dataInicio;

    // Atributo: Data prevista ou real de término do projeto
    private LocalDate dataFim;

    // Atributo: Status atual do projeto ("EM_ANDAMENTO", "CONCLUIDO", "CANCELADO")
    private String status;

    // Atributo: ID do gerente responsável pelo projeto (relacionamento com Usuario)
    private int idGerente;

    // Atributo: Lista de equipes associadas a este projeto
    private List<Equipe> equipes;

    // Construtor padrão (sem parâmetros)
    public Projeto() {}

    // Construtor com parâmetros essenciais para criar um novo projeto
    public Projeto(String nome, String descricao, LocalDate dataInicio, LocalDate dataFim, int idGerente) {
        this.nome = nome;               // Define o nome do projeto
        this.descricao = descricao;     // Define a descrição do projeto
        this.dataInicio = dataInicio;   // Define a data de início
        this.dataFim = dataFim;         // Define a data de término
        this.status = "EM_ANDAMENTO";   // Define status inicial como "EM_ANDAMENTO"
        this.idGerente = idGerente;     // Define o ID do gerente responsável
    }

    // Getter: Retorna o ID do projeto
    public int getId() { return id; }
    // Setter: Define o ID do projeto
    public void setId(int id) { this.id = id; }

    // Getter: Retorna o nome do projeto
    public String getNome() { return nome; }
    // Setter: Define o nome do projeto
    public void setNome(String nome) { this.nome = nome; }

    // Getter: Retorna a descrição do projeto
    public String getDescricao() { return descricao; }
    // Setter: Define a descrição do projeto
    public void setDescricao(String descricao) { this.descricao = descricao; }

    // Getter: Retorna a data de início do projeto
    public LocalDate getDataInicio() { return dataInicio; }
    // Setter: Define a data de início do projeto
    public void setDataInicio(LocalDate dataInicio) { this.dataInicio = dataInicio; }

    // Getter: Retorna a data de término do projeto
    public LocalDate getDataFim() { return dataFim; }
    // Setter: Define a data de término do projeto
    public void setDataFim(LocalDate dataFim) { this.dataFim = dataFim; }

    // Getter: Retorna o status atual do projeto
    public String getStatus() { return status; }
    // Setter: Define o status do projeto
    public void setStatus(String status) { this.status = status; }

    // Getter: Retorna o ID do gerente responsável
    public int getIdGerente() { return idGerente; }
    // Setter: Define o ID do gerente responsável
    public void setIdGerente(int idGerente) { this.idGerente = idGerente; }

    // Getter: Retorna a lista de equipes associadas ao projeto
    public List<Equipe> getEquipes() { return equipes; }
    // Setter: Define a lista de equipes do projeto
    public void setEquipes(List<Equipe> equipes) { this.equipes = equipes; }
}