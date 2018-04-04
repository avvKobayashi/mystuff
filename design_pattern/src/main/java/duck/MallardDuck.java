package duck;

import duck.flying.FlyWithWings;
import duck.quacking.Quack;

import java.util.logging.Logger;

public class MallardDuck extends Duck {

    private static final Logger LOGGER = Logger.getLogger(MallardDuck.class.getName());

    MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        LOGGER.info("I'm a Mallard Duck");
    }


}
