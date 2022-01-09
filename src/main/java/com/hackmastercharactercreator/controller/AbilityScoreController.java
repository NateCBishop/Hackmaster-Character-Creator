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

    @GetMapping("/dexterity/{abilityScore}")
    public ResponseEntity<AbilityScoreDto> getDexterityAbilityScoreStats(@PathVariable Double abilityScore) {
        AbilityScoreDto dexterityAbilityScoreDto = abilityScoreService.getDexterityAbilityScoreStats(abilityScore);
        return dexterityAbilityScoreDto != null ? new ResponseEntity<>(dexterityAbilityScoreDto, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/constitution/{abilityScore}")
    public ResponseEntity<AbilityScoreDto> getConstitutionAbilityScoreStats(@PathVariable Double abilityScore) {
        AbilityScoreDto constitutionAbilityScoreStats = abilityScoreService.getConstitutionAbilityScoreStats(abilityScore);
        return constitutionAbilityScoreStats != null ? new ResponseEntity<>(constitutionAbilityScoreStats, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/intelligence/{abilityScore}")
    public ResponseEntity<AbilityScoreDto> getIntelligenceAbilityScoreStats(@PathVariable Double abilityScore) {
        AbilityScoreDto intelligenceAbilityScoreStats = abilityScoreService.getIntelligenceAbilityScoreStats(abilityScore);
        return intelligenceAbilityScoreStats != null ? new ResponseEntity<>(intelligenceAbilityScoreStats, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/wisdom/{abilityScore}")
    public ResponseEntity<AbilityScoreDto> getWisdomAbilityScoreStats(@PathVariable Double abilityScore) {
        AbilityScoreDto wisdomAbilityScoreStats = abilityScoreService.getWisdomAbilityScoreStats(abilityScore);
        return wisdomAbilityScoreStats != null ? new ResponseEntity<>(wisdomAbilityScoreStats, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/charisma/{abilityScore}")
    public ResponseEntity<AbilityScoreDto> getCharismaAbilityScoreStats(@PathVariable Double abilityScore) {
        AbilityScoreDto charismaAbilityScoreStats = abilityScoreService.getCharismaAbilityScoreStats(abilityScore);
        return charismaAbilityScoreStats != null ? new ResponseEntity<>(charismaAbilityScoreStats, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
