public class RecordsTraining extends CompetetiveSwimmer{
    double trainingResultTime;
    int trainingResultDay;
    int trainingResultMonth;
    int trainingResultYear;

    public RecordsTraining(int memberNumber,
                           String firstName,
                           String lastName,
                           int day,
                           int month,
                           int year, String gender,
                           boolean under18,
                           boolean over60,
                           boolean isMotionist,
                           boolean isActive,
                           boolean restance,
                           int price,
                           String swimDisciple,
                           double trainingResultTime,
                           int trainingResultDay,
                           int trainingResultMonth,
                           int trainingResultYear) {
        super(memberNumber, firstName, lastName, day, month, year, gender, under18, over60, isMotionist, isActive, restance, price, swimDisciple);
        this.trainingResultTime = trainingResultTime;
        this.trainingResultDay = trainingResultDay;
        this.trainingResultMonth = trainingResultMonth;
        this.trainingResultYear = trainingResultYear;

    }
    public double getTrainingResultTime() {
        return trainingResultTime;
    }
    public int getTrainingResultDay() {
        return trainingResultDay;
    }
    public int getTrainingResultMonth() {
        return trainingResultMonth;
    }
    public int getTrainingresultYear() {
        return trainingResultYear;
    }
}
