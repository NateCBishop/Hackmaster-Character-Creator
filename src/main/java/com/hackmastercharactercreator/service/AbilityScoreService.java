package com.hackmastercharactercreator.service;

import com.hackmastercharactercreator.dto.abilityScore.AbilityScoreDto;
import com.hackmastercharactercreator.store.AbilityStore;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.Map;

@Service
public class AbilityScoreService {

    private final AbilityStore abilityStore;

    public AbilityScoreService(AbilityStore abilityStore) {
        this.abilityStore = abilityStore;
    }

    public AbilityScoreDto getStrengthAbilityScoreStats(Double abilityScore) {
        Map<Double, AbilityScoreDto> strengthMap = abilityStore.getStrengthMap();
        return strengthMap.get(findClosestButNotMore(abilityScore, strengthMap));
    }

    public AbilityScoreDto getDexterityAbilityScoreStats(Double abilityScore) {
        Map<Double, AbilityScoreDto> agilityMap = abilityStore.getAgilityMap();
        return agilityMap.get(findClosestButNotMore(abilityScore, agilityMap));
    }

    public AbilityScoreDto getConstitutionAbilityScoreStats(Double abilityScore) {
        Map<Double, AbilityScoreDto> constitutionMap = abilityStore.getConstitutionMap();
        return constitutionMap.get(findClosestButNotMore(abilityScore, constitutionMap));
    }

    public AbilityScoreDto getIntelligenceAbilityScoreStats(Double abilityScore) {
        Map<Double, AbilityScoreDto> intelligenceMap = abilityStore.getIntelligenceMap();
        return intelligenceMap.get(findClosestButNotMore(abilityScore, intelligenceMap));
    }


    public AbilityScoreDto getWisdomAbilityScoreStats(Double abilityScore) {
        Map<Double, AbilityScoreDto> wisdomMap = abilityStore.getWisdomMap();
        return wisdomMap.get(findClosestButNotMore(abilityScore, wisdomMap));
    }

    public AbilityScoreDto getCharismaAbilityScoreStats(Double abilityScore) {
        Map<Double, AbilityScoreDto> charismaMap = abilityStore.getCharismaMap();
        return charismaMap.get(findClosestButNotMore(abilityScore, charismaMap));
    }

    private Double findClosestButNotMore(Double abilityScore, Map<Double, AbilityScoreDto> abilityScoreMap) {
        return abilityScoreMap.keySet()
                .stream()
                .filter(key -> key <= abilityScore)
                .max(Comparator.naturalOrder())
                .orElse(null);
    }

}
