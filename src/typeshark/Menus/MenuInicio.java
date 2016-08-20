/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typeshark.Menus;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import typeshark.Constantes;

/**
 *
 * @author navi9
 */
public class MenuInicio {
    private VBox menuI;
    private Label titulop;
    private Label titulo;
    private TextField texto;
    private Button aceptar;
    private Image imagen;
    private BackgroundImage imagenFondo;
    private Background fondo;
    private String nombre;
    
    public MenuInicio()
    {
        this.menuI= new VBox();
        this.titulop= new Label("TYPERSHARK\n\n");
        this.titulo= new Label("INGRESE SU NOMBRE DE USUARIO: \n");
        this.texto=new TextField();
        this.aceptar=new Button("INGRESAR");
        this.aceptar.setOnAction(new ClickHandler());
        this.setUpMenuInicio();
        this.setUpBackground();
        menuI.getChildren().addAll(this.titulop, this.titulo, this.texto, this.aceptar);
       
    }
    
    public void setUpBackground()
    {
        imagen= new Image("/MenuInicio.jpg");
        imagenFondo= new BackgroundImage(this.imagen,BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280,700, true, true, true, false));
        fondo= new Background(this.imagenFondo);
        menuI.setBackground(this.fondo);
    }
    
    public void setUpMenuInicio()
    {
        titulop.setAlignment(Pos.CENTER);       
        titulop.setPadding(new Insets(20,20,20,20));
        titulop.setFont(Font.font("Verdana",60));
        titulop.setTextFill(Color.YELLOW);
        titulo.setAlignment(Pos.CENTER);
        titulo.setPadding(new Insets(10,10,10,10));
        titulo.setFont(Font.font("Verdana", 15)); 
        titulo.setTextFill(Color.BLACK);        
        texto.setMaxSize(210, 10);
        aceptar.setPrefSize(100, 40);
        aceptar.setFont(Font.font("Verdana", 13));
        menuI.setSpacing(Constantes.MENU_SPACING);
        menuI.setPrefSize(Constantes.APP_WIDTH, Constantes.APP_HEIGHT);
        menuI.setMaxSize(Constantes.APP_WIDTH, Constantes.APP_HEIGHT);
        menuI.setAlignment(Pos.CENTER);
        
    }
    
    public VBox getRoot(){
        return this.menuI;
    }

    private static class ClickHandler implements EventHandler<ActionEvent> {

        public ClickHandler() {
        }

        @Override
        public void handle(ActionEvent event) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
