public class BonusMilesService {

    public int calculate(int cost) {
        int milePercentCost = 20;
        int miles = cost / milePercentCost;
        return miles;
    }
}
