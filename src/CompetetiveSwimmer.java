import javax.sound.midi.SysexMessage;

public class CompetetiveSwimmer extends Member {

        int memberNumber;
        String firstName;
        String lastName;
        int day;
        int month;
        int year;
        boolean isMotionist;
        boolean under18;
        boolean isActive;
        String gender;
        boolean restance;
        int price;
        boolean over60;
        int swimDisicpleDay;
        int swimdiscipleMonth;
        int swimDiscipleYear;
        int swimDisciple;

    public CompetetiveSwimmer(int memberNumber, String firstName, String lastName, int day, int month, int year, String gender, boolean under18, boolean over60, boolean isMotionist, boolean isActive, boolean restance, int price,int swimDisciple, int swimDisicpleDay, int swimdiscipleMonth, int swimDiscipleYear) {
        super(memberNumber,firstName,lastName,day,month,year,gender,under18,over60,isMotionist,isActive,restance,price);
        this.swimDisicpleDay = swimDisicpleDay;
        this.swimdiscipleMonth = swimdiscipleMonth;
        this.swimDiscipleYear = swimDiscipleYear;
        this.swimDisciple= swimDisciple;
    }

}

