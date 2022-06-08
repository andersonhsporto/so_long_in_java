package com.baby.server.controller;

import com.baby.server.model.GameLogic;
import com.baby.server.service.BabyService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BabyController {
    @CrossOrigin
    @GetMapping(value = "/")
    @ApiOperation(value = "returns information's about the game validation")
    public GameLogic getEquation(@RequestParam String equation) {
        return new BabyService().validateAll(equation);
    }
}
