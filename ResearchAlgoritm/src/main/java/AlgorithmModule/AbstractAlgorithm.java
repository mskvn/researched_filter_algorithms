package AlgorithmModule;



import FilterRuleModule.FilterRules;




public abstract class AbstractAlgorithm {


    public FilterRules filterRules;



    public void setFilterRules(FilterRules filterRules){
        this.filterRules = filterRules;
    }



    protected abstract String applyAlgorithm(Object packet);

    protected abstract Object preparePacket(byte [] packet);


}
