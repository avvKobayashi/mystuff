package duck.quacking;

import java.util.logging.Logger;

public class Quack implements QuackBehavior {
    private static final Logger LOGGER = Logger.getLogger(Quack.class.getName());

    public void quack() {
        LOGGER.info("Quack");
    }
}
