package duck;

import duck.flying.FlyNoWay;
import duck.quacking.Quack;

import java.util.logging.Logger;

public class ModelDuck extends Duck {

    private static final Logger LOGGER = Logger.getLogger(ModelDuck.class.getName());

    ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        LOGGER.info("I'm a model Duck");
    }


}
