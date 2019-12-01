package com.example.ui;

import com.example.domain.Call;
import com.example.domain.CallRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.vaadin.reports.PrintPreviewReport;

@Service
public class ReportFactory {

    private final CallRepository callRepository;

    public ReportFactory(CallRepository callRepository) {
        this.callRepository = callRepository;
    }

    public PrintPreviewReport<Call> getReport() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        PrintPreviewReport<Call> report = new PrintPreviewReport<>(Call.class, "client", "city", "phoneNumber", "startTime", "duration", "status");
        report.setItems(callRepository.findAll(Sort.by("city", "status")));
        return report;
    }

}
