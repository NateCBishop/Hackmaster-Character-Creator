package com.hackmastercharactercreator.dto.abilityScore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AggregateAbilityScoreDto {
    private AbilityScoreDto strengthAbilityScoreStats;
    private AbilityScoreDto dexterityAbilityScoreStats;
    private AbilityScoreDto constitutionAbilityScoreStats;
    private AbilityScoreDto intelligenceAbilityScoreStats;
    private AbilityScoreDto wisdomAbilityScoreStats;
    private AbilityScoreDto charismaAbilityScoreStats;
    private AbilityScoreDto comelinessAbilityScoreStats;
    private AbilityScoreDto luckAbilityScoreStats;
}
