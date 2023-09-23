package com.cursedcauldron.wildbackport.core.mixinhelper;

import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.StructurePiece;

public record BeardifierLocals(
    int x,
    int y,
    int z,
    StructurePiece structurePiece,
    BoundingBox boundingBox,
    int l,
    int m
) {}
