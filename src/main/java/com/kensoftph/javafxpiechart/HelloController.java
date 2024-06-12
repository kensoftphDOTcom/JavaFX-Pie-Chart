package com.kensoftph.javafxpiechart;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private PieChart pieChart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        pieChart.setTitle("World Population");
        pieChart.setLegendVisible(true);
        pieChart.setLegendSide(Side.LEFT);
        pieChart.setData(PieChartData.getChartData());

        Platform.runLater(() -> {
            Scene scene = pieChart.getScene();
            String cssPath = Objects.requireNonNull(HelloController.class.getResource("pie.css")).toExternalForm();
            scene.getStylesheets().add(cssPath);
        });
    }
}