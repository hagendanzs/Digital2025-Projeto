package br.com.digital2025.view;

import javafx.application.Application; // Classe base para apps JavaFX
import javafx.fxml.FXMLLoader;         // Carrega arquivos .fxml
import javafx.scene.Parent;            // Representa a raiz da interface gráfica
import javafx.scene.Scene;             // Representa a cena (janela) exibida
import javafx.stage.Stage;             // Representa a janela principal da aplicação

// Classe principal que inicia a aplicação JavaFX
public class MainApp extends Application {

    // Método obrigatório da classe Application: é chamado ao iniciar a app
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Carrega o arquivo FXML da tela de login (localizado em /resources/view/)
        Parent root = FXMLLoader.load(getClass().getResource("/view/LoginView.fxml"));

        // Define o título da janela principal
        primaryStage.setTitle("Programação de Soluções Computacionais - Digital 2025 -2");

        // Cria uma nova cena com o conteúdo carregado (800x600 pixels)
        primaryStage.setScene(new Scene(root, 800, 600));

        // Exibe a janela principal
        primaryStage.show();
    }

    // Método main: ponto de entrada da aplicação Java (inicia a JavaFX Application)
    public static void main(String[] args) {
        launch(args); // Inicia a aplicação JavaFX
    }
}