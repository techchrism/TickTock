package me.techchrism.ticktock.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.server.world.ChunkTicketType;

@Mixin(ChunkTicketType.class)
public interface ChunkTicketTypeAccessor
{
    @Accessor("name")
    String getName();
}
