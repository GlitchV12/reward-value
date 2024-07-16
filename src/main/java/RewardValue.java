public class RewardValue {

    private double cashValue;
    private double milesValue;
    private final double conversionRate = 0.0035;

    //constructors
    public RewardValue(double cashValue){
        //this constructor accepts cash value
        this.cashValue=cashValue;
        this.milesValue=cashValue / conversionRate;
    }

    public RewardValue(double milesValue, boolean isMiles){
        //this constructor accepts miles value
        if (isMiles) {
            this.milesValue=milesValue;
            this.cashValue=milesValue * conversionRate;
        }else{
            this.cashValue=cashValue;
            this.milesValue=cashValue / conversionRate;
        }
    }

    //methods
    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
