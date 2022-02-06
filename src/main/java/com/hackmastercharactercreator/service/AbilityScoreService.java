package com.hackmastercharactercreator.service;

import com.hackmastercharactercreator.dto.abilityScore.AbilityScoreDto;
import com.hackmastercharactercreator.dto.abilityScore.AggregateAbilityScoreDto;
import com.hackmastercharactercreator.models.AbilityScorePostModel;
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

    public AggregateAbilityScoreDto generateAbilityScores(AbilityScorePostModel abilityScorePost) {
        AggregateAbilityScoreDto aggregateAbilityScoreDto = new AggregateAbilityScoreDto();
        aggregateAbilityScoreDto.setStrengthAbilityScoreStats(abilityStore.getStrengthMap().get(findClosestButNotMore(abilityScorePost.getStrengthAbilityScore(), abilityStore.getStrengthMap())));
        aggregateAbilityScoreDto.setDexterityAbilityScoreStats(abilityStore.getDexterityMap().get(findClosestButNotMore(abilityScorePost.getDexterityAbilityScore(), abilityStore.getDexterityMap())));
        aggregateAbilityScoreDto.setConstitutionAbilityScoreStats(abilityStore.getConstitutionMap().get(findClosestButNotMore(abilityScorePost.getConstitutionAbilityScore(), abilityStore.getConstitutionMap())));
        aggregateAbilityScoreDto.setIntelligenceAbilityScoreStats(abilityStore.getIntelligenceMap().get(findClosestButNotMore(abilityScorePost.getIntelligenceAbilityScore(), abilityStore.getIntelligenceMap())));
        aggregateAbilityScoreDto.setWisdomAbilityScoreStats(abilityStore.getWisdomMap().get(findClosestButNotMore(abilityScorePost.getWisdomAbilityScore(), abilityStore.getWisdomMap())));
        aggregateAbilityScoreDto.setCharismaAbilityScoreStats(abilityStore.getCharismaMap().get(findClosestButNotMore(abilityScorePost.getCharismaAbilityScore(), abilityStore.getCharismaMap())));
        aggregateAbilityScoreDto.setLuckAbilityScoreStats(abilityStore.getLuckMap().get(findClosestButNotMore(abilityScorePost.getLuckAbilityScore(), abilityStore.getLuckMap())));

        return aggregateAbilityScoreDto;
    }


    private Double findClosestButNotMore(Double abilityScore, Map<Double, AbilityScoreDto> abilityScoreMap) {
        return abilityScoreMap.keySet()
                .stream()
                .filter(key -> key <= abilityScore)
                .max(Comparator.naturalOrder())
                .orElse(null);
    }


}
