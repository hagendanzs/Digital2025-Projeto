package br.com.digital2025.model;

// Classe que representa um usuário do sistema (Administrador, Gerente ou Colaborador)
public class Usuario {

    // Atributo: ID único gerado pelo banco de dados
    private int id;

    // Atributo: Nome completo do usuário
    private String nome;

    // Atributo: E-mail do usuário (único no sistema)
    private String email;

    // Atributo: Senha do usuário (armazenada criptografada em produção)
    private String senha;

    // Atributo: Cargo do usuário no sistema ("ADMIN", "GERENTE", "COLABORADOR")
    private String cargo;

    // Atributo: Indica se o usuário está ativo (true) ou desativado (false)
    private boolean ativo;

    // Construtor padrão (sem parâmetros) - necessário para frameworks como Hibernate ou reflexão
    public Usuario() {}

    // Construtor com parâmetros para criar um novo usuário com dados iniciais
    public Usuario(String nome, String email, String senha, String cargo) {
        this.nome = nome;           // Atribui o nome recebido ao atributo da classe
        this.email = email;         // Atribui o e-mail recebido ao atributo da classe
        this.senha = senha;         // Atribui a senha recebida ao atributo da classe
        this.cargo = cargo;         // Atribui o cargo recebido ao atributo da classe
        this.ativo = true;          // Define o usuário como ativo por padrão ao ser criado
    }

    // Getter: Retorna o ID do usuário
    public int getId() { return id; }
    // Setter: Define o ID do usuário (geralmente usado pelo DAO após inserção no banco)
    public void setId(int id) { this.id = id; }

    // Getter: Retorna o nome do usuário
    public String getNome() { return nome; }
    // Setter: Define o nome do usuário
    public void setNome(String nome) { this.nome = nome; }

    // Getter: Retorna o e-mail do usuário
    public String getEmail() { return email; }
    // Setter: Define o e-mail do usuário
    public void setEmail(String email) { this.email = email; }

    // Getter: Retorna a senha do usuário
    public String getSenha() { return senha; }
    // Setter: Define a senha do usuário
    public void setSenha(String senha) { this.senha = senha; }

    // Getter: Retorna o cargo do usuário (ADMIN, GERENTE, COLABORADOR)
    public String getCargo() { return cargo; }
    // Setter: Define o cargo do usuário
    public void setCargo(String cargo) { this.cargo = cargo; }

    // Getter: Retorna se o usuário está ativo (true) ou inativo (false)
    public boolean isAtivo() { return ativo; }
    // Setter: Define o status de ativo/inativo do usuário
    public void setAtivo(boolean ativo) { this.ativo = ativo; }

    // Método toString: Retorna uma representação textual do objeto (útil para debug e logs)
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cargo='" + cargo + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}