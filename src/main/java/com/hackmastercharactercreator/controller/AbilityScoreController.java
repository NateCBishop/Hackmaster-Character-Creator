package com.hackmastercharactercreator.controller;

import com.hackmastercharactercreator.dto.abilityScore.AggregateAbilityScoreDto;
import com.hackmastercharactercreator.models.AbilityScorePostModel;
import com.hackmastercharactercreator.service.AbilityScoreService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ability")
public class AbilityScoreController {

    private final AbilityScoreService abilityScoreService;

    public AbilityScoreController(AbilityScoreService abilityScoreService) {
        this.abilityScoreService = abilityScoreService;
    }

    @PostMapping("/getScores")
    public ResponseEntity<AggregateAbilityScoreDto> getAbilityScores(@RequestBody AbilityScorePostModel abilityScorePost) {
        AggregateAbilityScoreDto generatedScores = abilityScoreService.generateAbilityScores(abilityScorePost);
        return generatedScores != null ? new ResponseEntity<>(generatedScores, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
