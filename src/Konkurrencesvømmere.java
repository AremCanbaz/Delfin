public class Konkurrencesvømmere extends Member {
    int swimDisciple;
    int swimDiscipleDay;
    int swimDiscipleMonth;
    int swimDiscipleYear;


    public Konkurrencesvømmere(int memberNumber, String firstName, String lastName, int day, int month, int year, boolean under18, boolean motionist, boolean medlemskab, boolean svimteam, int swimDisciple, int swimDisicpleDay, int swimdiscipleMonth, int swimDiscipleYear) {
        super(memberNumber, firstName, lastName, day, month, year, under18, motionist, medlemskab, svimteam);
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
    // Husk ved print af format skal metoden laves i klassen for
}