import java.util.HashMap;

public class CreateCompetitiveSwimmers extends Member {
    int swimDisciple;
    int swimDiscipleDay;
    int swimDiscipleMonth;
    int swimDiscipleYear;


    public CreateCompetitiveSwimmers(int memberNumber, String firstName, String lastName, int day, int month, int year, String gender, boolean under18,boolean over60, boolean isMotionist, boolean isActive, boolean restance, int price, int swimDisciple, int swimDisicpleDay, int swimdiscipleMonth, int swimDiscipleYear) {
        super(memberNumber, firstName, lastName, day, month, year,gender, under18, over60, isMotionist, isActive,restance,price);
        this.swimDisciple = swimDisciple;
        this.swimDiscipleDay = swimDiscipleDay;
        this.swimDiscipleMonth = swimDiscipleMonth;
        this.swimDiscipleYear = swimDiscipleYear;
        }
    public int getSwimdisciple () {
        return this.swimDisciple;
    }

    public String getFulldate() {
        return swimDiscipleDay + "/" + swimDiscipleMonth + "/" + swimDiscipleYear;

    }

    }