import java.util.HashMap;
import java.util.Scanner;

public class CreateCompetitiveSwimmers {
    HashMap<Integer, CompetetiveSwimmer> Competitiveo18 = new HashMap<>();
    HashMap<Integer, CompetetiveSwimmer> Competitiveu18 = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    CreateMember2 createMember2 = new CreateMember2();


    public CreateCompetitiveSwimmers(CreateMember2 createMember2) {
        this.createMember2 = createMember2;
    }

    public void createCompetitiveSwimmers() {

        createMember2.printmembers();
        System.out.println("Enter the ID of the member you want to add a record to: ");
        int memberId = sc.nextInt();
        System.out.println("How many meters did the member swim: ");
        int swimCompetitive = sc.nextInt();
        System.out.println("Which day whats it: ");
        int swimDay = sc.nextInt();
        System.out.println("Which month whats it: ");
        int swimMonth = sc.nextInt();
        System.out.println("Which year whats it: ");
        int swimYear = sc.nextInt();
        Member member = createMember2.getMemberList().get(memberId);



        if (createMember2.memberList.containsKey(memberId) && createMember2.getMemberList().get(memberId).under18) {

            System.out.println(member.memberNumber + member.firstName + member.lastName);
            Competitiveu18.put(member.memberNumber, new CompetetiveSwimmer(member.memberNumber, member.firstName, member.lastName, member.day, member.month, member.year, member.gender, member.under18, false, member.isMotionist, member.isActive, true,
                    member.price, swimCompetitive, swimDay, swimMonth, swimYear));

            } else {
                Competitiveo18.put(member.memberNumber, new CompetetiveSwimmer(member.getMemberNumber(), member.getFirstName(), member.getLastName(), member.getDay(), member.getMonth(), member.getYear(), member.getGender(), member.isUnder18(), member.isOver60(), member.isMotionist(), member.isActive(), member.isRestance(),
                        member.getPrice(), swimCompetitive, swimDay, swimMonth, swimYear));
            }

        CompetetiveSwimmer competetiveSwimmer = new CompetetiveSwimmer(member.memberNumber, member.firstName, member.lastName, member.day, member.month, member.year, member.gender, member.under18, false, member.isMotionist, member.isActive, true,
                member.price, swimCompetitive, swimDay, swimMonth, swimYear);
        System.out.println(competetiveSwimmer.getDay());
    }

    public void printcompetitiveSwimmerso18() {
        System.out.println("Here is all the records holder over 18 years");

        for (Integer key : Competitiveo18.keySet()) {
            CompetetiveSwimmer swimmer = Competitiveo18.get(key);
            System.out.println("Member Number: "+key  + "\nFirst Name: " + swimmer.getFirstName() + "\nLast Name: " + swimmer.getLastName()
                    + "\nDate of birth: " + swimmer.getDay()
                    + "/" + swimmer.getMonth()
                    + "/" + swimmer.getYear()
                    + "\nGender: " + swimmer.getGender()
                    + "\nSwim Disciple: " + swimmer.getSwimDisciple() + " Meters"
                    + "\nSwim Disciple day: " + swimmer.getSwimDisicpleDay()
                    + "/" + swimmer.getSwimdiscipleMonth() + "/"
                    + swimmer.getSwimdiscipleYear()
                    + "\n");
        }
    }

    public void printcompetitiveSwimmersu18() {
        System.out.println("Here is all the records holder under 18 years");

        for (Integer key : Competitiveu18.keySet()) {
            CompetetiveSwimmer swimmer = Competitiveu18.get(key);
            System.out.println("Member Number: "+key  + "\nFirst Name: " + swimmer.getFirstName() + "\nLast Name: " + swimmer.getLastName()
                    + "\nDate of birth: " + swimmer.getDay()
                    + "/" + swimmer.getMonth()
                    + "/" + swimmer.getYear()
                    + "\nGender: " + swimmer.getGender()
                    + "\nSwim Disciple: " + swimmer.getSwimDisciple() + " Meters"
                    + "\nSwim Disciple day: " + swimmer.getSwimDisicpleDay()
                    + "/" + swimmer.getSwimdiscipleMonth() + "/"
                    + swimmer.getSwimdiscipleYear()
                    + "\n");
        }
    }
}