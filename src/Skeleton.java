public class Skeleton extends Boss {
    private final int amountBowArrow = 250;

    public int getAmountBowArrow() {
        return amountBowArrow;
    }

    @Override
    public String printInfo(Boss nameSkeleton) {
        return super.printInfo(nameSkeleton) + "\n Amount bow arrow: [" + getAmountBowArrow() + "]";
    }
}
