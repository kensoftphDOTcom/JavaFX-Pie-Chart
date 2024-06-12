module com.kensoftph.javafxpiechart {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kensoftph.javafxpiechart to javafx.fxml;
    exports com.kensoftph.javafxpiechart;
}