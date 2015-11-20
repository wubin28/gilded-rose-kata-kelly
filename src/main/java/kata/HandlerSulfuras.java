package kata;

/**
 * Created by twer on 11/20/15.
 */
public class HandlerSulfuras extends HandlerGildedRose {
    public HandlerSulfuras(HandlerGildedRose successor) {
        super(successor);
    }

    @Override
    public void handle(Item item) {
        if (item.getName().equals("sulfuras")) {
            return;
        }
        this.successor.handle(item);
    }
}
