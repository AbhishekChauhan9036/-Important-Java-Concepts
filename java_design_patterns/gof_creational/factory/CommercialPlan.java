package java_design_patterns.gof_creational.factory;

public class CommercialPlan extends Plan {

    @Override
    protected void setRate() {
        rate = 2.5;
    }
}
