package com.example.ui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

    private final ReportFactory reportFactory;

    private Button button = new Button("Generate report", event -> generateReport());
    private VerticalLayout container = new VerticalLayout();

    public MainView(ReportFactory reportFactory) {
        this.reportFactory = reportFactory;

        add(
                new H2("Report generator"),
                button,
                container
        );
    }

    private void generateReport() {
        container.removeAll();
        container.add(reportFactory.getReport());
    }

}
