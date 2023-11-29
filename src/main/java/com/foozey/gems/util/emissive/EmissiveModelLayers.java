package com.foozey.gems.util.emissive;

import com.foozey.gems.Gems;
import net.minecraft.client.model.geom.ModelLayerLocation;

public class EmissiveModelLayers {

    public static final ModelLayerLocation PLAYER_INNER_ARMOR_EMISSIVE = register("player", "inner_armor_emissive");
    public static final ModelLayerLocation PLAYER_OUTER_ARMOR_EMISSIVE = register("player", "outer_armor_emissive");
    public static final ModelLayerLocation PLAYER_SLIM_INNER_ARMOR_EMISSIVE = register("player_slim", "inner_armor_emissive");
    public static final ModelLayerLocation PLAYER_SLIM_OUTER_ARMOR_EMISSIVE = register("player_slim", "outer_armor_emissive");
    public static final ModelLayerLocation ENTITY_INNER_ARMOR_EMISSIVE = register("entity", "inner_armor_emissive");
    public static final ModelLayerLocation ENTITY_OUTER_ARMOR_EMISSIVE = register("entity", "outer_armor_emissive");

    private static ModelLayerLocation register(String path, String type) {
        return new ModelLayerLocation(Gems.rl(path), type);
    }

}
