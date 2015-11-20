package kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class GildedRoseTest
{
    @Test
    public void sellIn_and_quaity_of_normal_item_should_decrease_by_1_at_the_end_of_each_day()
    {
        // Given
        Item item = new Item("normal item", 10, 20);

        // When
        item.updateSellInAndQuality();

        // Then
        assertEquals(9, item.getSellIn());
        assertEquals(19, item.getQuality());
    }

    @Test
    public void quality_of_normal_item_should_decrease_by_2_when_sellIn_is_negative()
    {
        // Given
        Item item = new Item("normal item", 0, 20);

        // When
        item.updateSellInAndQuality();

        // Then
        assertEquals(-1, item.getSellIn());
        assertEquals(18, item.getQuality());
    }

    @Test
    public void quality_of_aged_brie_should_increase_by_1_when_sellIn_is_positive()
    {
        // Given
        Item item = new Item("aged brie", 10, 20);

        // When
        item.updateSellInAndQuality();

        // Then
        assertEquals(9, item.getSellIn());
        assertEquals(21, item.getQuality());
    }

    @Test
    public void quality_of_aged_brie_should_increase_by_2_when_sellIn_is_negative()
    {
        // Given
        Item item = new Item("aged brie", 0, 20);

        // When
        item.updateSellInAndQuality();

        // Then
        assertEquals(-1, item.getSellIn());
        assertEquals(22, item.getQuality());
    }

    @Test
    public void quality_of_sulfuras_should_always_be_80()
    {
        // Given
        Item item = new Item("sulfuras", 10, 80);

        // When
        item.updateSellInAndQuality();

        // Then
        assertEquals(10, item.getSellIn());
        assertEquals(80, item.getQuality());
    }

    @Test
    public void quality_of_backstage_pass_should_increase_by_1_when_sellIn_is_greater_than_10()
    {
        // Given
        Item item = new Item("backstage pass", 11, 20);

        // When
        item.updateSellInAndQuality();

        // Then
        assertEquals(10, item.getSellIn());
        assertEquals(21, item.getQuality());
    }

    @Test
    public void quality_of_backstage_pass_should_increase_by_2_when_sellIn_is_between_5_and_10()
    {
        // Given
        Item item = new Item("backstage pass", 6, 20);

        // When
        item.updateSellInAndQuality();

        // Then
        assertEquals(5, item.getSellIn());
        assertEquals(22, item.getQuality());
    }

    @Test
    public void quality_of_backstage_pass_should_increase_by_3_when_sellIn_is_between_0_and_5()
    {
        // Given
        Item item = new Item("backstage pass", 4, 20);

        // When
        item.updateSellInAndQuality();

        // Then
        assertEquals(3, item.getSellIn());
        assertEquals(23, item.getQuality());
    }

    @Test
    public void quality_of_backstage_pass_should_be_0_when_sellIn_is_less_than_1()
    {
        // Given
        Item item = new Item("backstage pass", 0, 20);

        // When
        item.updateSellInAndQuality();

        // Then
        assertEquals(-1, item.getSellIn());
        assertEquals(0, item.getQuality());
    }

    @Test
    public void sellIn_and_quaity_of_conjured_should_decrease_by_2_at_the_end_of_each_day()
    {
        // Given
        Item item = new Item("conjured", 10, 20);

        // When
        item.updateSellInAndQuality();

        // Then
        assertEquals(9, item.getSellIn());
        assertEquals(18, item.getQuality());

    }

}
