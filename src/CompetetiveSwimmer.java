import javax.sound.midi.SysexMessage;

public class CompetetiveSwimmer extends Member { // Subklasse for konstrukøren member
// de yderligere oplysninger der er behov
        String swimDisciple;

    public CompetetiveSwimmer(int memberNumber, String firstName, String lastName, int day, int month, int year, String gender, boolean under18, boolean over60, boolean isMotionist, boolean isActive, boolean restance, int price, String  swimDisciple) {
        super(memberNumber,firstName,lastName,day,month,year,gender,under18,over60,isMotionist,isActive,restance,price);
        this.swimDisciple= swimDisciple;
    }
    // get metoder for at modtage oplysninger på subklassen
    public String getSwimDisciple() {
        return swimDisciple;
    }

}

