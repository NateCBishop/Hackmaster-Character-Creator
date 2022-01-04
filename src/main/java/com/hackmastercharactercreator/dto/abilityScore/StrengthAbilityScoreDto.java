package com.hackmastercharactercreator.dto.abilityScore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StrengthAbilityScoreDto extends AbilityScoreDto {
    private Double abilityScore;
    private int hitProbability;
    private int damageAdjustment;
    private int weightAllowance;
    private int maxPress;
    private String openDoors;
    private int bendBarsLiftGates;
}
