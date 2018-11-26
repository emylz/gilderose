package edu.insightr.gildedrose;

public class Sulfuras_Hand_of_Ragnaros extends Item{

    public Sulfuras_Hand_of_Ragnaros(String name, int sellIn, int quality)
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
