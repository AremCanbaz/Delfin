
public class Member { // parentklasse for konstruktøren  til medlemmer

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

    public Member(int memberNumber, String firstName, String lastName, int day, int month, int year, String gender, boolean under18, boolean over60, boolean isMotionist, boolean isActive, boolean restance, int price) {
        this.memberNumber = memberNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.under18 = under18;
        this.isMotionist = isMotionist;
        this.isActive = isActive;
        this.gender = gender;
        this.restance = restance;
        this.price = price;
        this.over60 = over60;
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

    public String getGender() {
        return gender;
    }

    public boolean isUnder18() {
        return under18;
    }

    public boolean isMotionist() {
        return isMotionist;
    }
    public boolean isActive() {
        return isActive;
    }

    public boolean isRestance(){
        return restance;
    }
    public int getPrice() {
        return price;
    }
    public boolean isOver60() {
        return over60;
    }
}
