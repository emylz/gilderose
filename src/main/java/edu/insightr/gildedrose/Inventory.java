package edu.insightr.gildedrose;

import javax.xml.ws.BindingType;

public class Inventory {

    private Item[] items;

    public Item[] getItems() {
        return items;
    }

    public Inventory(Item[] items) {
        super();
        this.items = items;
    }

    public Inventory() {
        super();
        /*items = new Item[]{
                new Item("+5 Dexterity Vest", 10, 20),
                new Item("Aged Brie", 2, 0),
                new Item("Elixir of the Mongoose", 5, 7),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Conjured Mana Cake", 3, 6)
        };*/

    }

    public void printInventory() {
        System.out.println("***************");
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println("***************");
        System.out.println("\n");
    }

    public void updateQuality() {
      /*  for (int i = 0; i < items.length; i++) {
            if (items[i].getName() != "Aged Brie"
                    && items[i].getName() != "Backstage passes to a TAFKAL80ETC concert") {
                if (items[i].getQuality() > 0) {
                    if (items[i].getName() != "Sulfuras, Hand of Ragnaros") {
                        items[i].setQuality(items[i].getQuality() - 1);
                    }
                }
            } else {
                if (items[i].getQuality() < 50) {
                    items[i].setQuality(items[i].getQuality() + 1);

                    if (items[i].getName() == "Backstage passes to a TAFKAL80ETC concert") {
                        if (items[i].getSellIn() < 11) {
                            if (items[i].getQuality() < 50) {
                                items[i].setQuality(items[i].getQuality() + 1);
                            }
                        }

                        if (items[i].getSellIn() < 6) {
                            if (items[i].getQuality() < 50) {
                                items[i].setQuality(items[i].getQuality() + 1);
                            }
                        }
                    }
                }
            }

            if (items[i].getName() != "Sulfuras, Hand of Ragnaros") {
                items[i].setSellIn(items[i].getSellIn() - 1);
            }

            if (items[i].getSellIn() < 0) {
                if (items[i].getName() != "Aged Brie") {
                    if (items[i].getName() != "Backstage passes to a TAFKAL80ETC concert") {
                        if (items[i].getQuality() > 0) {
                            if (items[i].getName() != "Sulfuras, Hand of Ragnaros") {
                                items[i].setQuality(items[i].getQuality() - 1);
                            }
                        }
                    } else {
                        items[i].setQuality(items[i].getQuality() - items[i].getQuality());
                    }
                } else {
                    if (items[i].getQuality() < 50) {
                        items[i].setQuality(items[i].getQuality() + 1);
                    }
                }
            }
        }*/
    }

    public void updateSellin()
    {
        for(int i = 0; i < items.length; i++)
        {
            items[i].setSellIn(items[i].getSellIn() - 1);
        }
    }



    public static void main(String[] args) {
        DebugVisitor v = new DebugVisitor();

        Conjured_Mana_Cake c = new Conjured_Mana_Cake("conjured", 14, 15);
        v.visit(c);
        c.accept(v);

        Aged_Brie a = new Aged_Brie();
        v.visit(a);
        a.accept(v);

        Backstage_passes_to_a_TAFKAL80ETC_concert b = new Backstage_passes_to_a_TAFKAL80ETC_concert();
        v.visit(c);
        b.accept(v);

        Dexterity_Vest d = new Dexterity_Vest("Vest", 12, 14);
        v.visit(d);
        d.accept(v);

        Elixir_of_the_Mongoose e = new Elixir_of_the_Mongoose("ELixir", 17, 2);
        v.visit(e);
        e.accept(v);

        Sulfuras_Hand_of_Ragnaros s = new Sulfuras_Hand_of_Ragnaros();
        v.visit(s);
        s.accept(v);

    }
}
