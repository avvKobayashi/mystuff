package duck.quacking;

import java.util.logging.Logger;

public class MuteQuack implements QuackBehavior {
    private static final Logger LOGGER = Logger.getLogger(MuteQuack.class.getName());

    public void quack() {
        LOGGER.info("Silence");
    }
}
