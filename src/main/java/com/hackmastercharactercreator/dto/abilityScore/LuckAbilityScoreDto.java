package com.hackmastercharactercreator.dto.abilityScore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LuckAbilityScoreDto extends AbilityScoreDto {
    private Double abilityScore;
    private Integer luckPoints;
    private Integer fatePoints;
    private Integer divineIntervention;
}
