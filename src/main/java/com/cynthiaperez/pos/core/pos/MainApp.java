package com.cynthiaperez.pos.core.pos;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainApp extends Application {
    
    private final String PAQUETE_VISTA = "com/cynthiaperez/pos/core/view";
    private Stage escenarioPrincipal;

    @Override
    public void start(Stage escenarioPrincipal) throws Exception { //Stage = escenario principal
        
        this.escenarioPrincipal = escenarioPrincipal; //Capturo la refencia
        
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
        
        scene.getStylesheets().add("/styles/Styles.css");
        
        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }
    
    public void mostrarVentaPrincipal() throws IOException{
        
    }
    
    public Initializable cambiarEscena(String fxml, int ancho, int alto) throws IOException{
        Initializable resultado = null;
        
        FXMLLoader loader = new FXMLLoader();        
        Parent root = loader.load(getClass().getResource(PAQUETE_VISTA + "Scene.fxml"));
        
        Scene escena = new Scene(root,ancho,alto); // Creacion de la escena
        this.escenarioPrincipal.setScene(escena);
        this.escenarioPrincipal.sizeToScene();
        
        return resultado;
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
