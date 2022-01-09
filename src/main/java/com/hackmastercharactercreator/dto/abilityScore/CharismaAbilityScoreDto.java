package com.hackmastercharactercreator.dto.abilityScore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharismaAbilityScoreDto extends AbilityScoreDto {
    private Double abilityScore;
    private Integer maximumHenchmen;
    private Integer loyaltyBase;
    private Integer reactionAdjustment;
    private Integer comelinessModifier;
    private Integer startingHonor;
}
