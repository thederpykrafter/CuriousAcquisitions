package io.github.thederpykrafter.curiousacquisitions.item;

import io.github.thederpykrafter.curiousacquisitions.CuriousAcquisitions;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent STRANGE_DRINK = new FoodComponent.Builder()
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 200), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200), 0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 200), 0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN, 200), 0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 200), 0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 20), 0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200), 0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 200), 0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200), 0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 200), 0.1f)
            .build();
    public static void registerModFoodComponents() {
        CuriousAcquisitions.LOGGER.info("Registering Food Components for " + CuriousAcquisitions.MOD_ID);
    }
}
