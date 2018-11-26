package edu.insightr.gildedrose;

public class Aged_Brie extends Item {

    public Aged_Brie(String name, int sellIn, int quality)
    {
        super();
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void accept(IVisitor visitor)
    {
        visitor.visit(this);
    }

}
