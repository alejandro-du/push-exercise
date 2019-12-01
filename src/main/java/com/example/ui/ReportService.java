package com.example.ui;

import com.example.domain.Call;
import com.example.domain.CallRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    private final CallRepository callRepository;

    public ReportService(CallRepository callRepository) {
        this.callRepository = callRepository;
    }

    public List<Call> findAll() {
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return callRepository.findAll(Sort.by("city", "status"));
    }

}
