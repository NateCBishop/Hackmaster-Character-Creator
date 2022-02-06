package com.hackmastercharactercreator.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AbilityScorePostModel {
    private Double strengthAbilityScore;
    private Double dexterityAbilityScore;
    private Double constitutionAbilityScore;
    private Double intelligenceAbilityScore;
    private Double wisdomAbilityScore;
    private Double charismaAbilityScore;
    private Double comelinessAbilityScore;
    private Double luckAbilityScore;
}
