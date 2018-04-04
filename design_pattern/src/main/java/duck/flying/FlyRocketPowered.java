package duck.flying;

import java.util.logging.Logger;

public class FlyRocketPowered implements FlyBehavior {
    private static final Logger LOGGER = Logger.getLogger(FlyRocketPowered.class.getName());

    public void fly() {
        LOGGER.info("I'm flying with a rocket");
    }
}
