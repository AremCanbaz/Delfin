public class Member {

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

    public Member(int memberNumber, String firstName, String lastName, int day, int month, int year, String gender, boolean under18, boolean isMotionist, boolean isActive, boolean restance, int price) {
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

    public boolean under18() {
        boolean under18;
        if (year - 2024 > 18) {
            under18 = true;
        } else {
            under18 = false;
        }
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
        if (!isActive()){
            price = 500;
            return price;
        }
        else if((year - 2024)<= 60 && isActive() && !under18()) {
            price = 1200;
            return price;
        }

        else if (under18 && isActive()){
            price = 1000;
            return price;
        }
        else if(!under18() && isActive()) {
            price = 1600;
            return price;
        }
        else {
            price = 500;
            return price;
        }
    }
}
