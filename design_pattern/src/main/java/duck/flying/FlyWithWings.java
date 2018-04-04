package duck.flying;

import java.util.logging.Logger;

public class FlyWithWings implements FlyBehavior {
    private static final Logger LOGGER = Logger.getLogger(FlyWithWings.class.getName());

    public void fly() {
        LOGGER.info("I'm flying");
    }
}
