package games.twinhead.morechests.comapt;

import games.twinhead.morechests.client.screen.NetheriteChestScreen;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.screen.ExclusionZones;
import me.shedaniel.rei.forge.REIPluginClient;

import java.util.List;

@REIPluginClient
public class ReiPlugin implements REIClientPlugin {

    public void registerExclusionZones(ExclusionZones zones) {
        zones.register(NetheriteChestScreen.class, screen -> {
            // screen is OurScreen
            // returns the list of rectangle
            return List.of(new Rectangle(((screen.width - screen.getBackgroundWidth()) / 2) - 24, (screen.height - screen.getBackgroundHeight()) / 2, screen.getBackgroundWidth()+ 46, screen.getBackgroundHeight()));
        });
    }
}
