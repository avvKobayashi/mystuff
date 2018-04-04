package duck.flying;

import java.util.logging.Logger;

public class FlyNoWay implements FlyBehavior {
    private static final Logger LOGGER = Logger.getLogger(FlyNoWay.class.getName());

    public void fly() {
        LOGGER.info("I can't fly");
    }
}
