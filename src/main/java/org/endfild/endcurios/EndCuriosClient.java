package org.endfild.endcurios;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(value = Endcurios.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = Endcurios.MODID, value = Dist.CLIENT)
public class EndCuriosClient {
    private static final Logger log = LoggerFactory.getLogger(EndCuriosClient.class);

    public EndCuriosClient(ModContainer container) {
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        log.info("HELLO FROM CLIENT SETUP");
        log.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
    }
}
