package com.hackmastercharactercreator.dto.abilityScore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DexterityAbilityScoreDto extends AbilityScoreDto {
    private Double abilityScore;
    private int defenseAdjustment;
    private int reactionAdjustment;
    private int missileAdjustment;
}
