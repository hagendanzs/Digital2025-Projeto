package br.com.digital2025.model;

import java.time.LocalDate; // Importa LocalDate para manipular datas

// Classe que representa uma tarefa atribuída dentro de um projeto
public class Tarefa {

    // Atributo: ID único da tarefa
    private int id;

    // Atributo: Título curto da tarefa (ex: "Criar tela de login")
    private String titulo;

    // Atributo: Descrição detalhada da tarefa
    private String descricao;

    // Atributo: Data de criação da tarefa (preenchida automaticamente)
    private LocalDate dataCriacao;

    // Atributo: Data de conclusão da tarefa (pode ser nula se ainda não concluída)
    private LocalDate dataConclusao;

    // Atributo: Status da tarefa ("PENDENTE", "EM_PROGRESSO", "CONCLUIDA")
    private String status;

    // Atributo: ID do projeto ao qual a tarefa pertence
    private int idProjeto;

    // Atributo: ID do usuário responsável por executar a tarefa
    private int idResponsavel;

    // Construtor padrão
    public Tarefa() {}

    // Construtor com parâmetros essenciais para criar uma nova tarefa
    public Tarefa(String titulo, String descricao, int idProjeto, int idResponsavel) {
        this.titulo = titulo;                   // Define o título da tarefa
        this.descricao = descricao;             // Define a descrição da tarefa
        this.dataCriacao = LocalDate.now();     // Define a data de criação como hoje
        this.status = "PENDENTE";               // Define status inicial como "PENDENTE"
        this.idProjeto = idProjeto;             // Vincula a tarefa a um projeto
        this.idResponsavel = idResponsavel;     // Define quem é o responsável pela tarefa
    }

    // Getter: Retorna o ID da tarefa
    public int getId() { return id; }
    // Setter: Define o ID da tarefa
    public void setId(int id) { this.id = id; }

    // Getter: Retorna o título da tarefa
    public String getTitulo() { return titulo; }
    // Setter: Define o título da tarefa
    public void setTitulo(String titulo) { this.titulo = titulo; }

    // Getter: Retorna a descrição da tarefa
    public String getDescricao() { return descricao; }
    // Setter: Define a descrição da tarefa
    public void setDescricao(String descricao) { this.descricao = descricao; }

    // Getter: Retorna a data de criação
    public LocalDate getDataCriacao() { return dataCriacao; }
    // Setter: Define a data de criação (geralmente não alterado após criação)
    public void setDataCriacao(LocalDate dataCriacao) { this.dataCriacao = dataCriacao; }

    // Getter: Retorna a data de conclusão (pode ser null)
    public LocalDate getDataConclusao() { return dataConclusao; }
    // Setter: Define a data de conclusão (preenchido ao finalizar a tarefa)
    public void setDataConclusao(LocalDate dataConclusao) { this.dataConclusao = dataConclusao; }

    // Getter: Retorna o status atual da tarefa
    public String getStatus() { return status; }
    // Setter: Define o status da tarefa
    public void setStatus(String status) { this.status = status; }

    // Getter: Retorna o ID do projeto vinculado
    public int getIdProjeto() { return idProjeto; }
    // Setter: Define o ID do projeto vinculado
    public void setIdProjeto(int idProjeto) { this.idProjeto = idProjeto; }

    // Getter: Retorna o ID do responsável pela tarefa
    public int getIdResponsavel() { return idResponsavel; }
    // Setter: Define o ID do responsável
    public void setIdResponsavel(int idResponsavel) { this.idResponsavel = idResponsavel; }
}