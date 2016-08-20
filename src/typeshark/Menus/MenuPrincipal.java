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
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import typeshark.Constantes;
import typeshark.Jugador;

/**
 *
 * @author navi9
 */
public class MenuPrincipal 
{
    private VBox menuPri; 
    private Button jugar;
    private Button puntuaciones;
    private Button salir;
    private Label titulo;
    private Label nom_Jugador;
    private Image imagen;
    private BackgroundImage imagenFondo;
    private Background fondo;
    
    
    public MenuPrincipal()
    {
        this.menuPri= new VBox();
        this.jugar= new Button("JUGAR");
        this.puntuaciones= new Button("PUNTUACIONES");
        this.salir= new Button("SALIR");
        this.titulo= new Label("BIENVENIDO A TYPERSHARK");
        this.nom_Jugador= new Label(Jugador.nombre);
        this.setUpBackground();
        this.setUpMenuPrincipal();
        this.setUpButtonHandlers();
        this.menuPri.getChildren().addAll(this.titulo,this.nom_Jugador, this.jugar, this.puntuaciones, this.salir);
    
    }
    
    public void setUpMenuPrincipal()
    {
        titulo.setAlignment(Pos.TOP_LEFT);
        titulo.setFont(Font.font("Verdana", 50));
        titulo.setTextFill(Color.YELLOW);
        titulo.setPadding(new Insets(20,20,20,20));
        nom_Jugador.setAlignment(Pos.CENTER);
        nom_Jugador.setFont(Font.font("Verdana", 50));
        nom_Jugador.setPadding(new Insets(20,20,20,20));
        jugar.setAlignment(Pos.CENTER);
        jugar.setPrefSize(Constantes.BUTT_WIDTH, Constantes.BUTT_HEIGHT);
        jugar.setFont(Font.font("Verdana", 13));
        puntuaciones.setAlignment(Pos.CENTER);
        puntuaciones.setPrefSize(150, Constantes.BUTT_HEIGHT);
        puntuaciones.setFont(Font.font("Verdana", 13));
        salir.setAlignment(Pos.CENTER);
        salir.setPrefSize(Constantes.BUTT_WIDTH, Constantes.BUTT_HEIGHT);
        salir.setFont(Font.font("Verdana", 13));
        menuPri.setAlignment(Pos.CENTER);
        menuPri.setMinSize(Constantes.APP_WIDTH, Constantes.APP_HEIGHT);
        menuPri.setSpacing(Constantes.MENU_SPACING);
        
    }
    
    public void setUpButtonHandlers()
    {
        jugar.setOnAction(new ClickHandler(1));
        puntuaciones.setOnAction(new ClickHandler(2));
        salir.setOnAction(new ClickHandler(3));
    }
    
    public void setUpBackground()
    {
        imagen= new Image("/MenuInicio.jpg");
        imagenFondo= new BackgroundImage(this.imagen,BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280,700, true, true, true, false));
        fondo= new Background(this.imagenFondo);
        menuPri.setBackground(this.fondo);
    }
    
    public VBox getRoot()
    {
        return this.menuPri;
    }
    

    private static class ClickHandler implements EventHandler<ActionEvent> {
        private int opcion;

        public ClickHandler(int opcion) {
            this.opcion=opcion;
        }

        @Override
        public void handle(ActionEvent event) {
            if (this.opcion==3){
                System.exit(0);
            }
        }
    }
}
