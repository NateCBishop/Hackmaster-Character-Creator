package com.hackmastercharactercreator.dto.abilityScore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WisdomAbilityScoreDto extends AbilityScoreDto {
    private Double abilityScore;
    private Integer magicalDefenseAdjustment;
    private List<Integer> bonusSpells;
    private Integer chanceOfSpellFailure;
    private String spellImmunity;
    private Integer chanceToImproveSkill;
}
