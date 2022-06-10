package com.baby.server.controller;

import com.baby.server.model.GameLogic;
import com.baby.server.model.SecretEquations;
import com.baby.server.repository.EquationRepository;
import com.baby.server.service.BabyService;
import com.baby.server.service.DailyEquations;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;

@RestController
public class BabyController {

    @Autowired
    private EquationRepository repository;

    @CrossOrigin
    @GetMapping(value = "/")
    @ApiOperation(value = "returns information's about the game validation")

    public GameLogic getEquation(@RequestParam String equation) {
        return new BabyService().validateAll(equation);
    }
}
