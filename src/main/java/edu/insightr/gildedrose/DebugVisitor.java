package edu.insightr.gildedrose;

public class DebugVisitor implements IVisitor{

    public void visit(IVisitable o)
    {
        System.out.println("Not implemented yet");
    }

    public void visit(Dexterity_Vest o)
    {
        System.out.println(o.toString());
    }

    public void visit(Aged_Brie o)
    {
        System.out.println(o.toString());
    }

    public void visit(Backstage_passes_to_a_TAFKAL80ETC_concert o)
    {
        System.out.println(o.toString());
    }

    public void visit(Conjured_Mana_Cake o)
    {
        System.out.println(o.toString());
    }

    public void visit(Elixir_of_the_Mongoose o)
    {
        System.out.println(o.toString());
    }

    public void visit(Sulfuras_Hand_of_Ragnaros o)
    {
        System.out.println(o.toString());
    }

}
