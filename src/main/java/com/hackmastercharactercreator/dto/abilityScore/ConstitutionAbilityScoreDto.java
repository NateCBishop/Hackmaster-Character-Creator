package com.hackmastercharactercreator.dto.abilityScore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConstitutionAbilityScoreDto extends AbilityScoreDto {
    private Double abilityScore;
    private Integer hitPointAdjustment;
    private Integer systemShock;
    private Integer resurrectionSurvival;
    private Integer poisonSave;
    private Integer immunityToDiseaseAlcohol;
    private String regenerationHealing;
}
