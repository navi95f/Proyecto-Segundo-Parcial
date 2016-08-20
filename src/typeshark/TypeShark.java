/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typeshark;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import typeshark.Menus.MenuInicio;
import typeshark.Menus.MenuPrincipal;

/**
 *
 * @author navi9
 */
public class TypeShark extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    MenuPrincipal pane = new MenuPrincipal();
    Scene scene = new Scene(pane.getRoot());
    
    primaryStage.setScene(scene);
    primaryStage.show();
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
