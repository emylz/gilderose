package edu.insightr.gildedrose;

public class Dexterity_Vest extends Item{

    public Dexterity_Vest(String name, int sellIn, int quality)
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
