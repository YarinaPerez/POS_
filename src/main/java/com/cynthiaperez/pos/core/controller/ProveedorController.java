package com.cynthiaperez.pos.core.controller;

import com.cynthiaperez.pos.core.sistema.Principal;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

// FullPack de la clase: com.cynthiaperez.pos.core.controller.ProveedorController
public class ProveedorController implements Initializable {

    private Principal principal;    
    @FXML private TableView tblProveedor; //Relacionar la tabla de la vista con el controlador
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
    public void setPrincipal(Principal principal){
        this.principal = principal;
    }
    
    public void regresarVentanaPrincipal() throws IOException{
        this.principal.mostrarVentaPrincipal();
    }
}
