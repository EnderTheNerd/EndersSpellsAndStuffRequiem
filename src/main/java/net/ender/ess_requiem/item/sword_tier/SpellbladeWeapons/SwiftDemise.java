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
import net.neoforged.neoforge.registries.DeferredRegister;

public class SwiftDemise extends MagicSwordItem {
    public SwiftDemise() {
        super(GGSwordTier.SWIFT_DEMISE, ItemPropertiesHelper.equipment().component(DataComponents.UNBREAKABLE, new Unbreakable(true)).fireResistant().rarity(ASRarities.COSMIC_RARITY_PROXY.getValue()).attributes(ExtendedSwordItem.createAttributes(GGSwordTier.SWIFT_DEMISE)),
                SpellDataRegistryHolder.of
                        (new SpellDataRegistryHolder(GGSpellRegistry.DISMANTLE, 1),
                                new SpellDataRegistryHolder(GGSpellRegistry.QUICK_SLICE, 6)

                        ));
    }
}
