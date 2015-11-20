package kata;

/**
 * Created by twer on 11/20/15.
 */
public class Item {
    private final String name;
    private int sellIn;
    private int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public int getSellIn() {
        return this.sellIn;
    }

    public int getQuality() {
        return this.quality;
    }

    public void updateSellInAndQuality() {


        HandlerGildedRose handlerConjured = new HandlerConjured(null);
        HandlerGildedRose handlerAgedBrie = new HandlerAgedBrie(handlerConjured);
        HandlerGildedRose handlerNormalItem = new HandlerNormalItem(handlerAgedBrie);
        HandlerGildedRose handlerBackstagePass = new HandlerBackstagePass(handlerNormalItem);
        HandlerGildedRose handlerSulfuras = new HandlerSulfuras(handlerBackstagePass);
        handlerSulfuras.handle(this);

    }

    public String getName() {
        return name;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }
}
