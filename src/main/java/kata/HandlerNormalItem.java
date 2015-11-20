package kata;

/**
 * Created by twer on 11/20/15.
 */
public class HandlerNormalItem extends HandlerGildedRose {
    public HandlerNormalItem(HandlerGildedRose successor) {
        super(successor);
    }

    @Override
    public void handle(Item item) {
        if (item.getName().equals("normal item")) {
            if (item.getSellIn() > 0) {
                item.setQuality(item.getQuality() - 1);

                item.setSellIn(item.getSellIn() - 1);

                return;
            }
            item.setQuality(item.getQuality() - 2);

            item.setSellIn(item.getSellIn() - 1);

            return;
        }
        successor.handle(item);
    }
}
