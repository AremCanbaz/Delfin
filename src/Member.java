import javax.swing.*;

public class Member {

    int memberNumber;
    String firstName;
    String lastName;
    int day;
    int month;
    int year;
    boolean motionist;
    boolean medlemskab;
    boolean svimteam;
    boolean under18;

    public Member(int memberNumber, String firstName, String lastName, int day, int month, int year,boolean under18, boolean isMotionist, boolean isActive, boolean svimteam ) {
        this.memberNumber = memberNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.under18 = under18;
        this.motionist = motionist;
        this.medlemskab = medlemskab;
    }
    public int getMemberNumber() {
        return memberNumber;
    }
    public String getFirstName() {
        return firstName;

    }
    public String getLastName() {
        return lastName;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;

    }
    public boolean under18(){
        boolean under18;
        if (year - 2024 > 18) {
            under18 = true;
        }
        else {
            under18 = false;
        }
        return under18;
    }
    public boolean isMotionist() {
        return motionist;
    }

    public boolean isMedlemskab() {
        return medlemskab;
    }
    public boolean isSvimteam() {
        return svimteam;
    }
}
