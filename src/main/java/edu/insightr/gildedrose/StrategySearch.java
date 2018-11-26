package edu.insightr.gildedrose;

abstract public class StrategySearch implements IStrategy {

    public void solve() {
        while (true) {
            preProcess();
            if (search()) {
                break;
            }
            postProcess();
        }
    }

    abstract void preProcess();
    abstract boolean search();
    abstract void postProcess();

}
