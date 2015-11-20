package kata;

/**
 * Created by twer on 11/20/15.
 */
public abstract class HandlerGildedRose {
    public HandlerGildedRose successor;

    public HandlerGildedRose(HandlerGildedRose successor) {
        this.successor = successor;
    }

    public abstract void handle(Item item);
}
