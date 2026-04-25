package com.addafurniture.item;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
/** BikeHelmetItem - Wearable helmet with armor protection */
public class BikeHelmetItem extends ArmorItem {
    public BikeHelmetItem(Settings settings) {
        super(ArmorMaterials.IRON, Type.HELMET, settings);
    }
}
