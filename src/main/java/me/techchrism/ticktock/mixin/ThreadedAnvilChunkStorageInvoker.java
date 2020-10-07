package me.techchrism.ticktock.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import net.minecraft.server.world.ChunkHolder;
import net.minecraft.server.world.ThreadedAnvilChunkStorage;
import net.minecraft.util.math.ChunkPos;

@Mixin(ThreadedAnvilChunkStorage.class)
public interface ThreadedAnvilChunkStorageInvoker
{
    @Invoker("isTooFarFromPlayersToSpawnMobs")
    boolean invokeIsTooFarFromPlayersToSpawnMobs(ChunkPos arg);
    
    @Invoker("entryIterator")
    Iterable<ChunkHolder> invokeEntryIterator();
    
    @Invoker("getTicketManager")
    ThreadedAnvilChunkStorage.TicketManager invokeGetTicketManager();
}
