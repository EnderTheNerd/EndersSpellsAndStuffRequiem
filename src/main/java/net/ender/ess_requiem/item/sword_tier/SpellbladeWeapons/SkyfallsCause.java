package net.ender.ess_requiem.item.sword_tier.SpellbladeWeapons;

import io.redspace.ironsspellbooks.api.item.weapons.ExtendedSwordItem;
import io.redspace.ironsspellbooks.api.item.weapons.MagicSwordItem;
import io.redspace.ironsspellbooks.api.registry.SpellDataRegistryHolder;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.acetheeldritchking.aces_spell_utils.utils.ASRarities;
import net.ender.ess_requiem.item.GGSwordTier;
import net.ender.ess_requiem.registries.GGSpellRegistry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.component.Unbreakable;

public class SkyfallsCause extends MagicSwordItem {

    public SkyfallsCause() {
        super(GGSwordTier.SKYFALLS_CAUSE, ItemPropertiesHelper.equipment().component(DataComponents.UNBREAKABLE, new Unbreakable(true)).fireResistant().rarity(ASRarities.COSMIC_RARITY_PROXY.getValue()).attributes(ExtendedSwordItem.createAttributes(GGSwordTier.SKYFALLS_CAUSE)),
                SpellDataRegistryHolder.of
                        (new SpellDataRegistryHolder(GGSpellRegistry.CLEAVE, 1),
                                new SpellDataRegistryHolder(GGSpellRegistry.OVERWHELMING, 4)
                        ));
    }
}

