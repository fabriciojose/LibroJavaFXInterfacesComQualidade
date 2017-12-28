package formulariologin;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

                                            // cria clase para visualizacao e controle
public class LoginApp extends Application { // esta classe se estende a um application, do javafx

    private AnchorPane pane; // criar os componentes como variáveis globais
    private TextField txtLogin;
    private PasswordField txtSenha;
    private Button btnEntrar, btnSair;
    private static Stage stage; // variável global stage

       
    @Override
    public void start(Stage stage)throws Exception {
        
        initComponents();
        initListeners();
        
        Scene scene = new Scene(pane);                  // cria a cena e passa o painel 'pane'
        stage.setScene(scene);                          // indica qual cena utilizar no Stage
        
        stage.setResizable(false); // não maximizar a tela
        stage.setTitle("Login - GolFX"); // título para a tela
        
        stage.show();    
        initLayout();
        
        LoginApp.stage = stage; // indicar a variável global stage e seu método getter 
    }
    
    public static Stage getStage() { //criar o getter da variável global stage
        return stage;
    }

    private void initComponents() {

        pane = new AnchorPane();             //  criar painel
        pane.setPrefSize(400, 300);                      // double prefWidth double prefHeight
        /*CSS*/ 
        pane.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, blue 0%, silver 100%);");
      
        txtLogin = new TextField();          // cria caixa de texto
        txtLogin.setPromptText("Digite aqui seu login!");

        txtSenha = new PasswordField();   // cria caixa de senha
        txtSenha.setPromptText("Digite aqui sua senha!");

        btnEntrar = new Button("Entrar");       // cria botão 

        btnSair = new Button("Sair");           // cria botão

        pane.getChildren().addAll(txtLogin, txtSenha, btnEntrar, btnSair); // adicionar os componentes no painel
        
        
    }

    private void initLayout() {

        txtLogin.setLayoutX((pane.getWidth() - txtLogin.getWidth()) / 2);
        txtLogin.setLayoutY(50);

        txtSenha.setLayoutX((pane.getWidth() - txtSenha.getWidth()) / 2);
        txtSenha.setLayoutY(100);

        btnEntrar.setLayoutX((pane.getWidth() - btnEntrar.getWidth()) / 2);
        btnEntrar.setLayoutY(150);

        btnSair.setLayoutX((pane.getWidth() - btnSair.getWidth()) / 2);
        btnSair.setLayoutY(200);
    }

    private void initListeners() {
        btnSair.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                fecharAplicacao();
            }
        });
        btnEntrar.setOnAction (new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event) {
                logar();
            }
        
    });
    }

    private void fecharAplicacao() {
        System.exit(0);
    }
    private void logar(){
        if (txtLogin.getText().equals("admin") &&
        txtSenha.getText().equals("casadocodigo")) {
        // TODO Abrir a tela VitrineApp
        } else {
        JOptionPane.showMessageDialog(null, "Login e/ou senha inválidos", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
