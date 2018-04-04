package duck;

import duck.flying.FlyBehavior;
import duck.quacking.QuackBehavior;

import java.util.logging.Logger;

public abstract class Duck {
    private static final Logger LOGGER = Logger.getLogger(Duck.class.getName());
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    Duck() {
    }

    public abstract void display();


    void perfomFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        LOGGER.info("All Ducks can swim");
    }

    void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
