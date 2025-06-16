package chapter02;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening Screening) {
        return Money.ZERO;
    }
}
