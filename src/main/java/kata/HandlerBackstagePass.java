package kata;

/**
 * Created by twer on 11/20/15.
 */
public class HandlerBackstagePass extends HandlerGildedRose {
    public HandlerBackstagePass(HandlerGildedRose successor) {
        super(successor);
    }

    @Override
    public void handle(Item item) {
        if (item.getName().equals("backstage pass")) {
            if (item.getSellIn() > 10) {
                item.setQuality(item.getQuality() + 1);

                item.setSellIn(item.getSellIn() - 1);

                return;
            }
            if (item.getSellIn() > 5 && item.getSellIn() <= 10) {
                item.setQuality(item.getQuality() + 2);

                item.setSellIn(item.getSellIn() - 1);

                return;
            }

            if (item.getSellIn() > 0 && item.getSellIn() <= 5) {
                item.setQuality(item.getQuality() + 3);

                item.setSellIn(item.getSellIn() - 1);

                return;
            }

            if (item.getSellIn() <= 0) {
                item.setQuality(0);

                item.setSellIn(item.getSellIn() - 1);

                return;
            }
        }
        successor.handle(item);
    }
}
