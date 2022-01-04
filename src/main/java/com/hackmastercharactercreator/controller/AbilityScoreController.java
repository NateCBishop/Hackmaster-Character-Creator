package com.hackmastercharactercreator.controller;

import com.hackmastercharactercreator.dto.abilityScore.AbilityScoreDto;
import com.hackmastercharactercreator.service.AbilityScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ability")
public class AbilityScoreController {

    @Autowired
    private AbilityScoreService abilityScoreService;

    @GetMapping("/strength/{abilityScore}")
    public ResponseEntity<AbilityScoreDto> getStrengthAbilityScoreStats(@PathVariable Double abilityScore) {
        AbilityScoreDto strengthAbilityScoreDto = abilityScoreService.getStrengthAbilityScoreStats(abilityScore);
        return strengthAbilityScoreDto != null ? new ResponseEntity<>(strengthAbilityScoreDto, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
