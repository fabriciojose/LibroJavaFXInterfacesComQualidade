
package formulariologin;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import javafx.stage.Stage;

                                            // cria clase para visualizacao e controle
public class LoginApp extends Application { // esta classe se estende a um application, do javafx
    @Override
    public void start (Stage stage) throws Exception { // sobrescreve o método start (onde desenvolve a lógia e cria
                                                        // componentes
    
    AnchorPane pane = new AnchorPane();             //  criar painel
    pane.setPrefSize(400,300);                      // double prefWidth double prefHeight
    

    
    TextField txtLogin = new TextField ();          // cria caixa de texto
    txtLogin.setPromptText("Digite aqui seu login!");
    
    PasswordField txtSenha = new PasswordField();   // cria caixa de senha
    txtSenha.setPromptText("Digite aqui sua senha!");
    
    Button btnEntrar = new Button ("Entrar");       // cria botão 
    
    Button btnSair = new Button ("Sair");           // cria botão
    
    pane.getChildren().addAll(txtLogin, txtSenha, btnEntrar, btnSair); // adicionar os componentes no painel
    
        Scene scene = new Scene(pane);                  // cria a cena e passa o painel 'pane'
    
        stage.setScene(scene);                          // indica qual cena utilizar no Stage
    
        stage.show();                                   // abrir o stage
    
    txtLogin.setLayoutX((pane.getWidth() - txtLogin.getWidth())/2);
    txtLogin.setLayoutY(50);
    
    txtSenha.setLayoutX((pane.getWidth() - txtSenha.getWidth())/2);
    txtSenha.setLayoutY(100);
    
    btnEntrar.setLayoutX((pane.getWidth() - btnEntrar.getWidth())/2);
    btnEntrar.setLayoutY(150);
    
    btnSair.setLayoutX((pane.getWidth() - btnSair.getWidth())/2);
    btnSair.setLayoutY(200);
    /* CSS */
    pane.setStyle("-fx-background-color: linear-gradient");
            
            //linear-gradient(from 0% 0% to 100& 100%, silver 100%);");
    
        
    }
    
    public static void main (String [] args) {
        launch(args);
    }
    
    
}
