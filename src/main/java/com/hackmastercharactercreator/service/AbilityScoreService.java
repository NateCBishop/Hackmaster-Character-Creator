package com.hackmastercharactercreator.service;

import com.hackmastercharactercreator.dto.abilityScore.AbilityScoreDto;
import com.hackmastercharactercreator.store.AbilityStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.Map;

@Service
public class AbilityScoreService {

    @Autowired
    private AbilityStore abilityStore;

    public AbilityScoreDto getStrengthAbilityScoreStats(Double abilityScore) {
        Map<Double, AbilityScoreDto> strengthMap = abilityStore.getStrengthMap();
        return strengthMap.get(findClosestButNotLess(abilityScore, strengthMap));
    }


    private Double findClosestButNotLess(Double abilityScore, Map<Double, AbilityScoreDto> abilityScoreMap) {
        return abilityScoreMap.keySet()
                .stream()
                .filter(key -> key <= abilityScore)
                .max(Comparator.naturalOrder())
                .orElse(null);
    }
}
