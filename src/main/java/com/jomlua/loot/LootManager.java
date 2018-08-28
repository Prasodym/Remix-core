package com.jomlua.loot;

import com.jomlua.testmod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.*;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import javax.annotation.Nonnull;
import java.util.Objects;

public class LootManager {

    private static final @Nonnull
    LootCondition[] NO_CONDITIONS = new LootCondition[0];
    private static LootManager INSTANCE = new LootManager();

    public static void init(@Nonnull FMLPostInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(INSTANCE);
    }

    private LootManager() {
    }
    public class LootTableLoadEvent extends Event
    {
        private final ResourceLocation name;
        private LootTable table;
        private LootTableManager lootTableManager;

        public LootTableLoadEvent(ResourceLocation name, LootTable table, LootTableManager lootTableManager)
        {
            this.name = name;
            this.table = table;
            this.lootTableManager = lootTableManager;
        }

        public ResourceLocation getName()
        {
            return this.name;
        }

        public LootTable getTable()
        {
            return this.table;
        }

        public LootTableManager getLootTableManager()
        {
            return this.lootTableManager;
        }

        public void setTable(LootTable table)
        {
            this.table = table;
        }
    }
}




