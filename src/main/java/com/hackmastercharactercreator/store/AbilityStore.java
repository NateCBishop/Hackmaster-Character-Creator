package com.hackmastercharactercreator.store;

import com.hackmastercharactercreator.dto.abilityScore.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Component
public class AbilityStore {
    private final Map<Double, AbilityScoreDto> strengthMap = new HashMap<>();
    private final Map<Double, AbilityScoreDto> dexterityMap = new HashMap<>();
    private final Map<Double, AbilityScoreDto> constitutionMap = new HashMap<>();
    private final Map<Double, AbilityScoreDto> intelligenceMap = new HashMap<>();
    private final Map<Double, AbilityScoreDto> wisdomMap = new HashMap<>();
    private final Map<Double, AbilityScoreDto> charismaMap = new HashMap<>();
    private final Map<Double, AbilityScoreDto> luckMap = new HashMap<>();


    @PostConstruct
    public void initMaps() {
        initStrengthMap();
        initDexterityMap();
        initConstitutionMap();
        initIntelligenceMap();
        initWisdomMap();
        initCharismaMap();
    }

    public Map<Double, AbilityScoreDto> getStrengthMap() {
        return strengthMap;
    }

    public Map<Double, AbilityScoreDto> getDexterityMap() {
        return dexterityMap;
    }

    public Map<Double, AbilityScoreDto> getConstitutionMap() {
        return constitutionMap;
    }

    public Map<Double, AbilityScoreDto> getIntelligenceMap() {
        return intelligenceMap;
    }

    public Map<Double, AbilityScoreDto> getWisdomMap() {
        return wisdomMap;
    }

    public Map<Double, AbilityScoreDto> getCharismaMap() {
        return charismaMap;
    }

    public Map<Double, AbilityScoreDto> getLuckMap() {
        return luckMap;
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

    private void initDexterityMap() {
        dexterityMap.put(1.0, new DexterityAbilityScoreDto(1.0, 5, -5, -6));
        dexterityMap.put(1.51, new DexterityAbilityScoreDto(1.51, 5, -5, -5));
        dexterityMap.put(2.0, new DexterityAbilityScoreDto(2.0, 4, -5, -5));
        dexterityMap.put(2.51, new DexterityAbilityScoreDto(2.51, 4, -4, -5));
        dexterityMap.put(3.0, new DexterityAbilityScoreDto(3.0, 4, -4, -4));
        dexterityMap.put(3.51, new DexterityAbilityScoreDto(3.51, 3, -4, -4));
        dexterityMap.put(4.0, new DexterityAbilityScoreDto(4.0, 3, -3, -4));
        dexterityMap.put(4.51, new DexterityAbilityScoreDto(4.51, 3, -3, -3));
        dexterityMap.put(5.0, new DexterityAbilityScoreDto(5.0, 2, -3, -3));
        dexterityMap.put(5.51, new DexterityAbilityScoreDto(5.51, 2, -2, -3));
        dexterityMap.put(6.0, new DexterityAbilityScoreDto(6.0, 2, -2, -2));
        dexterityMap.put(6.51, new DexterityAbilityScoreDto(6.51, 1, -2, -2));
        dexterityMap.put(7.0, new DexterityAbilityScoreDto(7.0, 1, -1, -2));
        dexterityMap.put(7.51, new DexterityAbilityScoreDto(7.51, 1, -1, -1));
        dexterityMap.put(8.0, new DexterityAbilityScoreDto(8.0, 0, -1, -1));
        dexterityMap.put(8.51, new DexterityAbilityScoreDto(8.51, 0, 0, -1));
        dexterityMap.put(9.0, new DexterityAbilityScoreDto(9.0, 0, 0, 0));
        dexterityMap.put(9.51, new DexterityAbilityScoreDto(9.51, 0, 0, 0));
        dexterityMap.put(10.0, new DexterityAbilityScoreDto(10.0, 0, 0, 0));
        dexterityMap.put(10.51, new DexterityAbilityScoreDto(10.51, 0, 0, 0));
        dexterityMap.put(11.0, new DexterityAbilityScoreDto(11.0, 0, 0, 0));
        dexterityMap.put(11.51, new DexterityAbilityScoreDto(11.51, 0, 0, 0));
        dexterityMap.put(12.0, new DexterityAbilityScoreDto(12.0, 0, 0, 0));
        dexterityMap.put(12.51, new DexterityAbilityScoreDto(12.51, 0, 0, 1));
        dexterityMap.put(13.0, new DexterityAbilityScoreDto(13.0, 0, 1, 1));
        dexterityMap.put(13.51, new DexterityAbilityScoreDto(13.51, -1, 1, 1));
        dexterityMap.put(14.0, new DexterityAbilityScoreDto(14.0, -1, 1, 2));
        dexterityMap.put(14.51, new DexterityAbilityScoreDto(14.51, -1, 2, 2));
        dexterityMap.put(15.0, new DexterityAbilityScoreDto(15.0, -2, 2, 2));
        dexterityMap.put(15.51, new DexterityAbilityScoreDto(15.51, -2, 2, 3));
        dexterityMap.put(16.0, new DexterityAbilityScoreDto(16.0, -2, 3, 3));
        dexterityMap.put(16.51, new DexterityAbilityScoreDto(16.51, -3, 3, 3));
        dexterityMap.put(17.0, new DexterityAbilityScoreDto(17.0, -3, 3, 4));
        dexterityMap.put(17.51, new DexterityAbilityScoreDto(17.51, -3, 4, 4));
        dexterityMap.put(18.0, new DexterityAbilityScoreDto(18.0, -4, 4, 4));
        dexterityMap.put(18.51, new DexterityAbilityScoreDto(18.51, -4, 4, 5));
        dexterityMap.put(19.0, new DexterityAbilityScoreDto(19.0, -4, 5, 5));
        dexterityMap.put(19.51, new DexterityAbilityScoreDto(19.51, -5, 5, 5));
        dexterityMap.put(20.0, new DexterityAbilityScoreDto(20.0, -5, 5, 6));
        dexterityMap.put(20.51, new DexterityAbilityScoreDto(20.51, -5, 5, 6));
        dexterityMap.put(21.0, new DexterityAbilityScoreDto(21.0, -5, 5, 6));
        dexterityMap.put(21.51, new DexterityAbilityScoreDto(21.51, -5, 6, 6));
        dexterityMap.put(22.0, new DexterityAbilityScoreDto(22.0, -6, 6, 6));
        dexterityMap.put(22.51, new DexterityAbilityScoreDto(22.51, -6, 6, 7));
        dexterityMap.put(23.0, new DexterityAbilityScoreDto(23.0, -6, 7, 7));
        dexterityMap.put(23.51, new DexterityAbilityScoreDto(23.51, -7, 7, 7));
        dexterityMap.put(24.0, new DexterityAbilityScoreDto(24.0, -7, 7, 8));
        dexterityMap.put(24.51, new DexterityAbilityScoreDto(24.51, -7, 8, 8));
        dexterityMap.put(25.0, new DexterityAbilityScoreDto(25.0, -8, 8, 8));
    }

    private void initConstitutionMap() {
        constitutionMap.put(1.0, new ConstitutionAbilityScoreDto(1.0, -5, 25, 30, -2, 30, "Nil/ 1 HP every 2 weeks"));
        constitutionMap.put(2.0, new ConstitutionAbilityScoreDto(2.0, -4, 30, 35, -1, 25, "Nil/ 1 HP every week"));
        constitutionMap.put(3.0, new ConstitutionAbilityScoreDto(3.0, -4, 40, 40, 0, 20, "Nil/ 1 HP every 2 days"));
        constitutionMap.put(4.0, new ConstitutionAbilityScoreDto(4.0, -3, 40, 45, 0, 15, "Nil/ 1 HP every 2 days"));
        constitutionMap.put(5.0, new ConstitutionAbilityScoreDto(5.0, -3, 45, 50, 0, 10, "Nil/ 1 HP every 2 days"));
        constitutionMap.put(6.0, new ConstitutionAbilityScoreDto(6.0, -2, 50, 55, 0, 5, "Nil/ 1 HP every 2 days"));
        constitutionMap.put(7.0, new ConstitutionAbilityScoreDto(7.0, -2, 55, 60, 0, 0, "Nil/ 1 HP day"));
        constitutionMap.put(8.0, new ConstitutionAbilityScoreDto(8.0, -1, 60, 65, 0, -5, "Nil/ 1 HP day"));
        constitutionMap.put(9.0, new ConstitutionAbilityScoreDto(9.0, -1, 65, 70, 0, -10, "Nil/ 1 HP day"));
        constitutionMap.put(10.0, new ConstitutionAbilityScoreDto(10.0, 0, 70, 75, 0, -20, "Nil/ 1 HP day"));
        constitutionMap.put(11.0, new ConstitutionAbilityScoreDto(11.0, 0, 75, 80, 0, -25, "Nil/ 1 HP day"));
        constitutionMap.put(12.0, new ConstitutionAbilityScoreDto(12.0, 1, 80, 85, 0, -30, "Nil/ 1 HP day"));
        constitutionMap.put(13.0, new ConstitutionAbilityScoreDto(13.0, 1, 85, 90, 0, -35, "Nil/ 1 HP day"));
        constitutionMap.put(14.0, new ConstitutionAbilityScoreDto(14.0, 2, 88, 92, 0, -40, "Nil/ 1 HP day"));
        constitutionMap.put(15.0, new ConstitutionAbilityScoreDto(15.0, 2, 90, 94, 0, -45, "Nil/ 1 HP day"));
        constitutionMap.put(16.0, new ConstitutionAbilityScoreDto(16.0, 3, 95, 96, 0, -50, "Nil/ 1 HP day"));
        constitutionMap.put(17.0, new ConstitutionAbilityScoreDto(17.0, 3, 97, 98, 0, -55, "Nil/ 1 HP day"));
        constitutionMap.put(18.0, new ConstitutionAbilityScoreDto(18.0, 4, 99, 100, 0, -60, "Nil/ 1 HP every 18 hours"));
        constitutionMap.put(19.0, new ConstitutionAbilityScoreDto(19.0, 4, 99, 100, 1, -65, "Nil/ 1 HP every 12 hours"));
        constitutionMap.put(20.0, new ConstitutionAbilityScoreDto(20.0, 5, 99, 100, 1, -70, "1 HP/6 turns"));
        constitutionMap.put(21.0, new ConstitutionAbilityScoreDto(21.0, 5, 99, 100, 2, -75, "1 HP/5 turns"));
        constitutionMap.put(22.0, new ConstitutionAbilityScoreDto(22.0, 6, 99, 100, 2, -85, "1 HP/4 turns"));
        constitutionMap.put(23.0, new ConstitutionAbilityScoreDto(23.0, 6, 99, 100, 3, -90, "1 HP/3 turns"));
        constitutionMap.put(24.0, new ConstitutionAbilityScoreDto(24.0, 7, 99, 100, 3, -95, "1 HP/2 turns"));
        constitutionMap.put(25.0, new ConstitutionAbilityScoreDto(25.0, 7, 99, 100, 4, -99, "1 HP/1 turns"));
    }

    private void initIntelligenceMap() {
        intelligenceMap.put(1.0, new IntelligenceAbilityScoreDto(1.0, 0, null, 1, null, null, null));
        intelligenceMap.put(2.0, new IntelligenceAbilityScoreDto(2.0, 1, null, 5, null, null, null));
        intelligenceMap.put(3.0, new IntelligenceAbilityScoreDto(3.0, 1, null, 10, null, null, null));
        intelligenceMap.put(4.0, new IntelligenceAbilityScoreDto(4.0, 1, null, 15, null, null, null));
        intelligenceMap.put(5.0, new IntelligenceAbilityScoreDto(5.0, 1, null, 20, null, null, null));
        intelligenceMap.put(6.0, new IntelligenceAbilityScoreDto(6.0, 1, null, 25, null, null, null));
        intelligenceMap.put(7.0, new IntelligenceAbilityScoreDto(7.0, 1, null, 30, null, null, null));
        intelligenceMap.put(8.0, new IntelligenceAbilityScoreDto(8.0, 1, 0, 30, "5", null, 35));
        intelligenceMap.put(9.0, new IntelligenceAbilityScoreDto(9.0, 2, 4, 35, "6", null, 20));
        intelligenceMap.put(10.0, new IntelligenceAbilityScoreDto(10.0, 2, 5, 40, "6", null, 15));
        intelligenceMap.put(11.0, new IntelligenceAbilityScoreDto(11.0, 2, 5, 45, "7", null, 10));
        intelligenceMap.put(12.0, new IntelligenceAbilityScoreDto(12.0, 3, 6, 50, "7", null, 5));
        intelligenceMap.put(13.0, new IntelligenceAbilityScoreDto(13.0, 3, 6, 55, "9", null, 0));
        intelligenceMap.put(14.0, new IntelligenceAbilityScoreDto(14.0, 4, 7, 60, "9", null, 0));
        intelligenceMap.put(15.0, new IntelligenceAbilityScoreDto(15.0, 4, 7, 65, "11", null, 0));
        intelligenceMap.put(16.0, new IntelligenceAbilityScoreDto(16.0, 5, 8, 70, "11", null, 0));
        intelligenceMap.put(17.0, new IntelligenceAbilityScoreDto(17.0, 6, 8, 75, "14", null, 0));
        intelligenceMap.put(18.0, new IntelligenceAbilityScoreDto(18.0, 7, 9, 85, "18", "Cantrips", 0));
        intelligenceMap.put(18.51, new IntelligenceAbilityScoreDto(18.5, 7, 9, 90, "20", "Cantrips", 0));
        intelligenceMap.put(19.0, new IntelligenceAbilityScoreDto(19.0, 8, 9, 95, "All", "1st-level", 0));
        intelligenceMap.put(20.0, new IntelligenceAbilityScoreDto(20.0, 9, 9, 96, "All", "2nd-level", 0));
        intelligenceMap.put(21.0, new IntelligenceAbilityScoreDto(21.0, 10, 9, 97, "All", "3rd-level", 0));
        intelligenceMap.put(22.0, new IntelligenceAbilityScoreDto(22.0, 11, 9, 98, "All", "4th-level", 0));
        intelligenceMap.put(23.0, new IntelligenceAbilityScoreDto(23.0, 12, 9, 99, "All", "5th-level", 0));
        intelligenceMap.put(24.0, new IntelligenceAbilityScoreDto(24.0, 15, 9, 100, "All", "6th-level", 0));
        intelligenceMap.put(25.0, new IntelligenceAbilityScoreDto(25.0, 20, 9, 100, "All", "7th-level", 0));
    }

    private void initWisdomMap() {
        wisdomMap.put(1.0, new WisdomAbilityScoreDto(1.0, -6, new ArrayList<>(), 80, null, null));
        wisdomMap.put(2.0, new WisdomAbilityScoreDto(2.0, -4, new ArrayList<>(), 60, null, null));
        wisdomMap.put(3.0, new WisdomAbilityScoreDto(3.0, -3, new ArrayList<>(), 50, null, 1));
        wisdomMap.put(4.0, new WisdomAbilityScoreDto(4.0, -2, new ArrayList<>(), 45, null, 2));
        wisdomMap.put(5.0, new WisdomAbilityScoreDto(5.0, -1, new ArrayList<>(), 40, null, 3));
        wisdomMap.put(6.0, new WisdomAbilityScoreDto(6.0, -1, new ArrayList<>(), 35, null, 3));
        wisdomMap.put(7.0, new WisdomAbilityScoreDto(7.0, -1, new ArrayList<>(), 30, null, 4));
        wisdomMap.put(8.0, new WisdomAbilityScoreDto(8.0, 0, new ArrayList<>(), 25, null, 4));
        wisdomMap.put(9.0, new WisdomAbilityScoreDto(9.0, 0, new ArrayList<>(), 20, null, 5));
        wisdomMap.put(10.0, new WisdomAbilityScoreDto(10.0, 0, new ArrayList<>(), 15, null, 5));
        wisdomMap.put(11.0, new WisdomAbilityScoreDto(11.0, 0, new ArrayList<>(), 10, null, 5));
        wisdomMap.put(12.0, new WisdomAbilityScoreDto(12.0, 0, new ArrayList<>(), 5, null, 5));
        wisdomMap.put(13.0, new WisdomAbilityScoreDto(13.0, 0, new ArrayList<>() {{add(1);}}, 5, null, 5));
        wisdomMap.put(14.0, new WisdomAbilityScoreDto(14.0, 0, new ArrayList<>() {{add(1); add(1);}}, 0, null, 6));
        wisdomMap.put(15.0, new WisdomAbilityScoreDto(15.0, 1, new ArrayList<>() {{add(1); add(1); add(2);}}, 0, null, 7));
        wisdomMap.put(16.0, new WisdomAbilityScoreDto(16.0, 2, new ArrayList<>() {{add(1); add(1); add(2); add(2);}}, 0, null, 8));
        wisdomMap.put(17.0, new WisdomAbilityScoreDto(17.0, 3, new ArrayList<>() {{add(1); add(1); add(2); add(2); add(3);}}, 0, null, 9));
        wisdomMap.put(18.0, new WisdomAbilityScoreDto(18.0, 4, new ArrayList<>() {{add(1); add(1); add(2); add(2); add(3); add(4);}}, 0, null, 10));
        wisdomMap.put(18.51, new WisdomAbilityScoreDto(18.51, 4, new ArrayList<>() {{add(1); add(1); add(2); add(2); add(3); add(4); add(5);}}, 0, "Befriend", 11));
        wisdomMap.put(19.0, new WisdomAbilityScoreDto(19.0, 4, new ArrayList<>() {{add(1); add(1); add(2); add(2); add(3); add(4); add(5); add(1); add(3);}}, 0, "Befriend, Cause fear, Charm person, Command, Hypnotism", 12));
        wisdomMap.put(20.0, new WisdomAbilityScoreDto(20.0, 4, new ArrayList<>() {{add(1); add(1); add(2); add(2); add(3); add(4); add(5); add(1); add(3); add(2); add(4);}}, 0, "Befriend, Cause fear, Charm person, Command, Hypnotism, Forget, Hold Person, Ray of Enfeeblement, Scare", 13));
        wisdomMap.put(21.0, new WisdomAbilityScoreDto(21.0, 4, new ArrayList<>() {{add(1); add(1); add(2); add(2); add(3); add(4); add(5); add(1); add(3); add(2); add(4); add(3); add(5);}}, 0, "Befriend, Cause fear, Charm person, Command, Hypnotism, Forget, Hold Person, Ray of Enfeeblement, Scare, Fear", 14));
        wisdomMap.put(22.0, new WisdomAbilityScoreDto(22.0, 4, new ArrayList<>() {{add(1); add(1); add(2); add(2); add(3); add(4); add(5); add(1); add(3); add(2); add(4); add(3); add(5); add(4); add(5);}}, 0, "Befriend, Cause fear, Charm person, Command, Hypnotism, Forget, Hold Person, Ray of Enfeeblement, Scare, Fear, Charm Monster, Confusion, Emotion, Fumble, Suggestion", 15));
        wisdomMap.put(23.0, new WisdomAbilityScoreDto(23.0, 4, new ArrayList<>() {{add(1); add(1); add(2); add(2); add(3); add(4); add(5); add(1); add(3); add(2); add(4); add(3); add(5); add(4); add(5); add(1); add(6);}}, 0, "Befriend, Cause fear, Charm person, Command, Hypnotism, Forget, Hold Person, Ray of Enfeeblement, Scare, Fear, Charm Monster, Confusion, Emotion, Fumble, Suggestion, Chaos, Feeblemind, Hold Monster, Magic Jar, Quest", 16));
        wisdomMap.put(24.0, new WisdomAbilityScoreDto(24.0, 4, new ArrayList<>() {{add(1); add(1); add(2); add(2); add(3); add(4); add(5); add(1); add(3); add(2); add(4); add(3); add(5); add(4); add(5); add(1); add(6); add(5); add(6);}}, 0, "Befriend, Cause fear, Charm person, Command, Hypnotism, Forget, Hold Person, Ray of Enfeeblement, Scare, Fear, Charm Monster, Confusion, Emotion, Fumble, Suggestion, Chaos, Feeblemind, Hold Monster, Magic Jar, Quest, Geas, Mass Suggestion, Rod of Rulership", 18));
        wisdomMap.put(25.0, new WisdomAbilityScoreDto(25.0, 4, new ArrayList<>() {{add(1); add(1); add(2); add(2); add(3); add(4); add(5); add(1); add(3); add(2); add(4); add(3); add(5); add(4); add(5); add(1); add(6); add(5); add(6); add(6); add(7);}}, 0, "Befriend, Cause fear, Charm person, Command, Hypnotism, Forget, Hold Person, Ray of Enfeeblement, Scare, Fear, Charm Monster, Confusion, Emotion, Fumble, Suggestion, Chaos, Feeblemind, Hold Monster, Magic Jar, Quest, Geas, Mass Suggestion, Rod of Rulership, Antipathy/Sympathy, Death Spell, Mass Charm", 18));
    }

    private void initCharismaMap() {
        charismaMap.put(1.0, new CharismaAbilityScoreDto(1.0, 0, -8, -7, -8, -9));
        charismaMap.put(2.0, new CharismaAbilityScoreDto(2.0, 1, -7, -6, -8, -8));
        charismaMap.put(3.0, new CharismaAbilityScoreDto(3.0, 1, -6, -5, -5, -7));
        charismaMap.put(4.0, new CharismaAbilityScoreDto(4.0, 1, -5, -4, -3, -6));
        charismaMap.put(5.0, new CharismaAbilityScoreDto(5.0, 2, -4, -3, -3, -5));
        charismaMap.put(6.0, new CharismaAbilityScoreDto(6.0, 2, -3, -2, -1, -4));
        charismaMap.put(7.0, new CharismaAbilityScoreDto(7.0, 3, -2, -1, -1, -3));
        charismaMap.put(8.0, new CharismaAbilityScoreDto(8.0, 3, -1, 0, -1, -2));
        charismaMap.put(9.0, new CharismaAbilityScoreDto(9.0, 4, 0, 0, 0, -1));
        charismaMap.put(10.0, new CharismaAbilityScoreDto(10.0, 4, 0, 0, 0, 0));
        charismaMap.put(11.0, new CharismaAbilityScoreDto(11.0, 4, 0, 0, 0, 0));
        charismaMap.put(12.0, new CharismaAbilityScoreDto(12.0, 5, 0, 0, 0, 1));
        charismaMap.put(13.0, new CharismaAbilityScoreDto(13.0, 5, 0, 1, 1, 2));
        charismaMap.put(14.0, new CharismaAbilityScoreDto(14.0, 6, 1, 2, 1, 3));
        charismaMap.put(15.0, new CharismaAbilityScoreDto(15.0, 7, 3, 3, 1, 4));
        charismaMap.put(16.0, new CharismaAbilityScoreDto(16.0, 8, 4, 5, 2, 5));
        charismaMap.put(17.0, new CharismaAbilityScoreDto(17.0, 10, 6, 6, 2, 6));
        charismaMap.put(18.0, new CharismaAbilityScoreDto(18.0, 15, 8, 7, 3, 7));
        charismaMap.put(19.0, new CharismaAbilityScoreDto(19.0, 18, 10, 8, 4, 8));
        charismaMap.put(20.0, new CharismaAbilityScoreDto(20.0, 20, 12, 9, 4, 9));
        charismaMap.put(21.0, new CharismaAbilityScoreDto(21.0, 25, 14, 10, 5, 10));
        charismaMap.put(22.0, new CharismaAbilityScoreDto(22.0, 30, 16, 11, 5, 11));
        charismaMap.put(23.0, new CharismaAbilityScoreDto(23.0, 35, 18, 12, 6, 12));
        charismaMap.put(24.0, new CharismaAbilityScoreDto(24.0, 40, 20, 13, 7, 13));
        charismaMap.put(25.0, new CharismaAbilityScoreDto(25.0, 45, 20, 14, 8, 14));
    }

}
