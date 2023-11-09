package br.ggg.gerenciadortarefasescolares;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

     @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader Login = new FXMLLoader(Main.class.getResource("Login.fxml"));
        Scene TelaLogin = new Scene(Login.load());
        FXMLLoader Relatorios = new FXMLLoader(Main.class.getResource("Relatorios.fxml"));
        Scene TelaRelatorios = new Scene(Relatorios.load());
         stage.setTitle("Login");
         stage.setScene(TelaLogin);
         stage.show();

         /* public static void mudarTela(){
         stage.setTitle("Relatorios");
         stage.setScene(TelaRelatorios);
        }
        */


     }
 //https://dontpad.com/javafxcodigoigor



    public static void main(String[] args) {
        launch();
    }
}