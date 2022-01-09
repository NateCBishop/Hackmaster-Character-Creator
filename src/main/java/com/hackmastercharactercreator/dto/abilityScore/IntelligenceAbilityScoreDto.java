package com.hackmastercharactercreator.dto.abilityScore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IntelligenceAbilityScoreDto extends AbilityScoreDto {
    private Double abilityScore;
    private Integer numberOfLang;
    private Integer spellLevel;
    private Integer learningAbility;
    private String maxNumberOfSpells;
    private String illusionImmunity;
    private Integer chanceOfSpellMishap;
}
