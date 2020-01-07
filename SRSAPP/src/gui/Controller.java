package gui;

import java.util.ArrayList;
import javafx.scene.layout.*;

/***************
* The controller talks to the gui and the other classes. It fetches
* info the gui needs to display or use from the other classes.
***************/
public class Controller {
    /**
    * Gui instance.
    */
    private SRSMain myGui;

    /**
    * initializes a controller and sets its gui.
    * @param myMain the main class that runs the program.
    */
    public Controller(SRSMain myMain) {
        myGui = myMain;
    }

}
