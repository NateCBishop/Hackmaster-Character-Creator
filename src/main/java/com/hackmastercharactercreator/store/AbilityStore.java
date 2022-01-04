package com.hackmastercharactercreator.store;

import com.hackmastercharactercreator.dto.abilityScore.AbilityScoreDto;
import com.hackmastercharactercreator.dto.abilityScore.StrengthAbilityScoreDto;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class AbilityStore {
    Map<Double, AbilityScoreDto> strengthMap = new HashMap<>();

    @PostConstruct
    public void initMaps() {
        initStrengthMap();
    }

    public Map<Double, AbilityScoreDto> getStrengthMap() {
        return strengthMap;
    }

    private void initStrengthMap() {
        strengthMap.put(1.0, new StrengthAbilityScoreDto(1.0, -3, -8, 1, 3, "1", 0));
        strengthMap.put(1.51, new StrengthAbilityScoreDto(1.51, -3, -8, 2, 4, "1", 0));
        strengthMap.put(2.0, new StrengthAbilityScoreDto(2.0, -3, -7, 3, 5, "1", 0));
        strengthMap.put(2.51, new StrengthAbilityScoreDto(2.51, -3, -7, 4, 7, "1", 0));
        strengthMap.put(3.0, new StrengthAbilityScoreDto(3.0, -3, -6, 5, 10, "2", 0));
        strengthMap.put(3.51, new StrengthAbilityScoreDto(3.51, -3, -6, 7, 20, "2", 0));
        strengthMap.put(4.0, new StrengthAbilityScoreDto(4.0, -2, -5, 9, 25, "3", 0));
        strengthMap.put(4.51, new StrengthAbilityScoreDto(4.51, -2, -5, 11, 35, "3", 0));
        strengthMap.put(5.0, new StrengthAbilityScoreDto(5.0, -2, -4, 13, 30, "3", 0));
        strengthMap.put(5.51, new StrengthAbilityScoreDto(5.51, -2, -4, 15, 40, "4", 0));
        strengthMap.put(6.0, new StrengthAbilityScoreDto(6.0, -2, -3, 18, 55, "4", 0));
        strengthMap.put(6.51, new StrengthAbilityScoreDto(6.51, -2, -3, 21, 60, "4", 0));
        strengthMap.put(7.0, new StrengthAbilityScoreDto(7.0, -1, -2, 24, 70, "4", 0));
        strengthMap.put(7.51, new StrengthAbilityScoreDto(7.51, -1, -2, 27, 80, "5", 0));
        strengthMap.put(8.0, new StrengthAbilityScoreDto(8.0, -1, -1, 30, 90, "5", 1));
        strengthMap.put(8.51, new StrengthAbilityScoreDto(8.51, -1, -1, 33, 95, "5", 1));
        strengthMap.put(9.0, new StrengthAbilityScoreDto(9.0, 0, -1, 36, 100, "5", 1));
        strengthMap.put(9.51, new StrengthAbilityScoreDto(9.51, 0, -1, 39, 110, "6", 1));
        strengthMap.put(10.0, new StrengthAbilityScoreDto(10.0, 0, 0, 43, 115, "6", 2));
        strengthMap.put(10.51, new StrengthAbilityScoreDto(10.51, 0, 0, 47, 125, "6", 3));
        strengthMap.put(11.0, new StrengthAbilityScoreDto(11.0, 0, 0, 51, 130, "6", 4));
        strengthMap.put(11.51, new StrengthAbilityScoreDto(11.51, 0, 0, 55, 135, "7", 4));
        strengthMap.put(12.0, new StrengthAbilityScoreDto(12.0, 0, 1, 59, 140, "7", 5));
        strengthMap.put(12.51, new StrengthAbilityScoreDto(12.51, 0, 1, 63, 145, "7", 5));
        strengthMap.put(13.0, new StrengthAbilityScoreDto(13.0, 1, 1, 67, 150, "7", 6));
        strengthMap.put(13.51, new StrengthAbilityScoreDto(13.51, 1, 1, 71, 160, "8", 6));
        strengthMap.put(14.0, new StrengthAbilityScoreDto(14.0, 1, 2, 76, 170, "8", 7));
        strengthMap.put(14.51, new StrengthAbilityScoreDto(14.51, 1, 2, 81, 175, "8", 8));
        strengthMap.put(15.0, new StrengthAbilityScoreDto(15.0, 1, 3, 86, 185, "9", 9));
        strengthMap.put(15.51, new StrengthAbilityScoreDto(15.51, 1, 3, 91, 190, "9", 10));
        strengthMap.put(16.0, new StrengthAbilityScoreDto(16.0, 2, 4, 97, 195, "10", 11));
        strengthMap.put(16.51, new StrengthAbilityScoreDto(16.51, 2, 4, 103, 220, "10", 12));
        strengthMap.put(17.0, new StrengthAbilityScoreDto(17.0, 2, 5, 109, 255, "11", 15));
        strengthMap.put(17.51, new StrengthAbilityScoreDto(17.51, 2, 5, 115, 290, "11", 20));
        strengthMap.put(18.0, new StrengthAbilityScoreDto(18.0, 3, 6, 130, 350, "12(3)", 25));
        strengthMap.put(18.51, new StrengthAbilityScoreDto(18.51, 3, 6, 160, 480, "14(6)", 35));
        strengthMap.put(19.0, new StrengthAbilityScoreDto(19.0, 3, 7, 200, 640, "15(8)", 50));
        strengthMap.put(19.51, new StrengthAbilityScoreDto(19.51, 3, 7, 300, 660, "16(9)", 55));
        strengthMap.put(20.0, new StrengthAbilityScoreDto(20.0, 3, 8, 400, 700, "17(10)", 60));
        strengthMap.put(20.51, new StrengthAbilityScoreDto(20.51, 3, 8, 500, 625, "17(11)", 65));
        strengthMap.put(21.0, new StrengthAbilityScoreDto(21.0, 4, 9, 600, 810, "17(12)", 70));
        strengthMap.put(21.51, new StrengthAbilityScoreDto(21.51, 4, 9, 700, 865, "18(13)", 75));
        strengthMap.put(22.0, new StrengthAbilityScoreDto(22.0, 4, 10, 800, 970, "18(14)", 80));
        strengthMap.put(22.51, new StrengthAbilityScoreDto(22.51, 4, 10, 900, 1050, "18(15)", 85));
        strengthMap.put(23.0, new StrengthAbilityScoreDto(23.0, 5, 11, 1000, 1130, "18(16)", 90));
        strengthMap.put(23.51, new StrengthAbilityScoreDto(23.51, 5, 11, 1100, 1320, "19(16)", 95));
        strengthMap.put(24.0, new StrengthAbilityScoreDto(24.0, 6, 12, 1200, 1440, "19(16)", 97));
        strengthMap.put(24.51, new StrengthAbilityScoreDto(24.51, 6, 12, 1300, 1540, "19(17)", 98));
        strengthMap.put(25.0, new StrengthAbilityScoreDto(25.0, 7, 14, 1500, 1750, "19(18)", 99));
    }
}
