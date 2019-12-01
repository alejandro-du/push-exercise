package com.example.ui;

import com.example.domain.Call;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.reports.PrintPreviewReport;

import java.time.LocalTime;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Route
public class MainView extends VerticalLayout {

    private final ReportService reportService;
    private final ExecutorService executorService = Executors.newCachedThreadPool();

    private Button button = new Button("Generate report", event -> generateReport());
    private VerticalLayout container = new VerticalLayout();
    private PrintPreviewReport<Call> report = new PrintPreviewReport<>(
            Call.class, "client", "city", "phoneNumber", "startTime", "duration", "status");

    public MainView(ReportService reportService) {
        this.reportService = reportService;

        add(
                new H2("Report generator"),
                new HorizontalLayout(
                        button,
                        new Button("What time is it?", event -> Notification.show(LocalTime.now().toString()))
                ),
                container
        );
    }

    private void generateReport() {
        List<Call> calls = reportService.findAll();
        report.setItems(calls);
        container.removeAll();
        container.add(report);
    }

}
