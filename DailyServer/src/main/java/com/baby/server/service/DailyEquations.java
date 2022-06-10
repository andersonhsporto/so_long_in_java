package com.baby.server.service;

import com.baby.server.model.SecretEquations;
import com.baby.server.repository.EquationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.time.LocalDate;

public class DailyEquations {
    @Autowired
    private EquationRepository repository;

//    public String getDailyEquation() {
//        int dayOfMonth = LocalDate.now().getDayOfMonth();
//
//        SecretEquations dbEquation = this.repository.findSecretEquationsById(dayOfMonth);
//        return dbEquation.getEquation();
//    }
}