package com.kensoftph.javafxpiechart;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;

public class PieChartData {
    public static ObservableList<PieChart.Data> getChartData() {
        ObservableList<PieChart.Data> data = FXCollections.observableArrayList();
        data.add(new PieChart.Data("China", 1425000000));
        data.add(new PieChart.Data("India", 1419000000));
        data.add(new PieChart.Data("USA", 333500000));
        data.add(new PieChart.Data("Indonesia", 276700000));
        data.add(new PieChart.Data("Pakistan", 240500000));

        return data;
    }
}
