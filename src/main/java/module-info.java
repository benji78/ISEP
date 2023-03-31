module main.java.com.benji.harrypoterproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires annotations;


    opens com.benji.harryPoterProject to javafx.fxml;
    exports com.benji.harryPoterProject;
    exports com.benji.harryPoterProject.model.spells;
    opens com.benji.harryPoterProject.model.spells to javafx.fxml;
    exports com.benji.harryPoterProject.controller;
    opens com.benji.harryPoterProject.controller to javafx.fxml;
    exports com.benji.harryPoterProject.model.characters;
    opens com.benji.harryPoterProject.model.characters to javafx.fxml;
    exports com.benji.harryPoterProject.model;
    opens com.benji.harryPoterProject.model to javafx.fxml;
}