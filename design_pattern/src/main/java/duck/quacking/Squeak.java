package duck.quacking;

import java.util.logging.Logger;

public class Squeak implements QuackBehavior {
    private static final Logger LOGGER = Logger.getLogger(Squeak.class.getName());

    public void quack() {
        LOGGER.info("Squeak");
    }
}
