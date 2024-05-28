public class RecordsTournament extends CompetetiveSwimmer{ // suklasse til konkurrence svømmere
    String convention;
    double time;
    int tournementDay;
    int tournementMonth;
    int tournementYear;
    int placement;

    public RecordsTournament(int memberNumber,
                             String firstName,
                             String lastName,
                             int day,
                             int month,
                             int year,
                             String gender,
                             boolean under18,
                             boolean over60,
                             boolean isMotionist,
                             boolean isActive,
                             boolean restance,
                             int price,
                             String swimDisciple,
                             String convention,
                             int tournementDay,
                             int tournementMonth,
                             int tournementYear,
                             int placement) {
        super(memberNumber, firstName, lastName, day, month, year, gender, under18, over60, isMotionist, isActive, restance, price, swimDisciple);
        this.convention = convention;
        this.tournementDay = tournementDay;
        this.tournementMonth = tournementMonth;
        this.tournementYear = tournementYear;
        this.placement = placement;
    }
    public String getConvention() {
        return convention;
    }
    public int gettournementDay() {
        return tournementDay;
    }
    public int gettournementMonth() {
        return tournementMonth;
    }
    public int gettournementYear() {
        return tournementYear;
    }
    public int getplacement() {
        return placement;
    }
}
