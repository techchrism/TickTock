package me.techchrism.ticktock.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import net.minecraft.server.world.ChunkHolder;
import net.minecraft.server.world.ChunkTicketManager;
import net.minecraft.server.world.ThreadedAnvilChunkStorage;
import net.minecraft.util.math.ChunkPos;

@Mixin(ThreadedAnvilChunkStorage.class)
public interface ThreadedAnvilChunkStorageInvoker
{
    @Invoker("shouldTick")
    boolean ticktock_invokeShouldTick(ChunkPos arg);
    
    @Invoker("entryIterator")
    Iterable<ChunkHolder> ticktock_invokeEntryIterator();
    
    @Invoker("getTicketManager")
    ChunkTicketManager ticktock_invokeGetTicketManager();
}
