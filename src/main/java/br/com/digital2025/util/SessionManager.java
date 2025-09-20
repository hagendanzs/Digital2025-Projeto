package br.com.digital2025.util;

import br.com.digital2025.model.Usuario;

// Classe utilitária para gerenciar a sessão do usuário logado no sistema
public class SessionManager {

    // Atributo estático: armazena o usuário atualmente logado (único na aplicação)
    private static Usuario usuarioLogado;

    // Método estático: "faz login" armazenando o usuário na sessão
    public static void login(Usuario usuario) {
        usuarioLogado = usuario; // Atribui o usuário recebido à variável de sessão
    }

    // Método estático: retorna o usuário logado (pode ser null se ninguém estiver logado)
    public static Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    // Método estático: "faz logout" limpando a sessão
    public static void logout() {
        usuarioLogado = null; // Remove a referência do usuário logado
    }

    // Método estático: verifica se existe algum usuário logado
    public static boolean isLoggedIn() {
        return usuarioLogado != null; // Retorna true se houver usuário logado
    }

    // Método estático: verifica se o usuário logado é ADMIN
    public static boolean isAdmin() {
        // Verifica se há usuário logado E se o cargo dele é "ADMIN"
        return usuarioLogado != null && "ADMIN".equals(usuarioLogado.getCargo());
    }

    // Método estático: verifica se o usuário logado é GERENTE
    public static boolean isGerente() {
        // Verifica se há usuário logado E se o cargo dele é "GERENTE"
        return usuarioLogado != null && "GERENTE".equals(usuarioLogado.getCargo());
    }
}