package chapter02;

import java.util.List;

public abstract class DiscountPolicy {

    private List<DiscountCondition> conditions;

    public DiscountPolicy(DiscountCondition... conditions) {
        this.conditions = List.of(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition each : conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening Screening);
}
