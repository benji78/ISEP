module main.java.com.benji.harrypoterproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires annotations;


    opens com.benji.harryPotterProject to javafx.fxml;
    exports com.benji.harryPotterProject;
    exports com.benji.harryPotterProject.model.spells;
    opens com.benji.harryPotterProject.model.spells to javafx.fxml;
    exports com.benji.harryPotterProject.controller;
    opens com.benji.harryPotterProject.controller to javafx.fxml;
    exports com.benji.harryPotterProject.model.characters;
    opens com.benji.harryPotterProject.model.characters to javafx.fxml;
    exports com.benji.harryPotterProject.model;
    opens com.benji.harryPotterProject.model to javafx.fxml;
}