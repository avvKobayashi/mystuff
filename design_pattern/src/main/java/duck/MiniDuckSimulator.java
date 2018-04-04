package duck;

import duck.flying.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        // il comportamento e' dato per delega
        mallard.performQuack();
        mallard.perfomFly();

        Duck model = new ModelDuck();

        model.performQuack();
        model.perfomFly(); // delega a FlyNoWay (da costruttore)
        model.setFlyBehavior(new FlyRocketPowered());
        model.perfomFly(); // delga a FlyRocketPowered (da setter)
    }
}
