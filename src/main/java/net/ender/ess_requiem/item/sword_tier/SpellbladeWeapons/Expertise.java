package net.ender.ess_requiem.item.sword_tier.SpellbladeWeapons;

import io.redspace.ironsspellbooks.api.item.weapons.ExtendedSwordItem;
import io.redspace.ironsspellbooks.api.item.weapons.MagicSwordItem;
import io.redspace.ironsspellbooks.api.registry.SpellDataRegistryHolder;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.ender.ess_requiem.item.GGSwordTier;
import net.ender.ess_requiem.registries.GGSpellRegistry;
import net.minecraft.world.item.Rarity;

public class Expertise extends MagicSwordItem {

    public Expertise() {
        super(GGSwordTier.EXPERTISE, ItemPropertiesHelper.equipment().rarity(Rarity.EPIC).attributes(ExtendedSwordItem.createAttributes(GGSwordTier.EXPERTISE)),
                SpellDataRegistryHolder.of(new SpellDataRegistryHolder(GGSpellRegistry.CLEAVE, 1),
                        new SpellDataRegistryHolder(GGSpellRegistry.DISMANTLE, 1))
        );
    }
}
