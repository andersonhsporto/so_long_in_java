package com.baby.server.controller;

import com.baby.server.model.GameLogic;
import com.baby.server.model.SecretEquations;
import com.baby.server.repository.EquationRepository;
import com.baby.server.service.DailyService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;

@RestController
public class DailyController {

    @Autowired
    public EquationRepository repository;

    public String getDailyEquation() {
        int dayOfMonth = LocalDate.now().getDayOfMonth();
        SecretEquations dbEquation = repository.findSecretEquationsById(dayOfMonth);
        return dbEquation.getEquation();
    }

    @CrossOrigin
    @GetMapping(value = "/")
    @ApiOperation(value = "returns information's about the game validation")
    public GameLogic getEquation(@RequestParam String equation) {
        return new DailyService().validateAll(equation, getDailyEquation());
    }
}
