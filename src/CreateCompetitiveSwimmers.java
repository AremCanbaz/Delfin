import java.util.HashMap;
import java.util.Scanner;

public class CreateCompetitiveSwimmers {
    HashMap<Integer, Member> Competitiveo18 = new HashMap<>();
    HashMap<Integer, Member> Competitiveu18 = new HashMap<>();
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
        int day = sc.nextInt();
        System.out.println("Which month whats it: ");
        int month = sc.nextInt();
        System.out.println("Which year whats it: ");
        int year = sc.nextInt();


        if (createMember2.memberList.containsKey(memberId)) {
            Member member = createMember2.getMemberList().get(memberId);
            new CompetetiveSwimmer(member.memberNumber, member.firstName, member.lastName, member.day, member.month, member.year, member.gender, member.under18, false, member.isMotionist, member.isActive, true,
                    member.price,
                    swimCompetitive,
                    day,
                    month,
                    year
            );


            if (createMember2.isUnder18(member.day, member.month, member.year)) {
                Competitiveu18.put(createMember2.memberList.get(memberId).memberNumber, member);
            } else {
                Competitiveo18.put(createMember2.memberList.get(memberId).memberNumber, member);
            }

            System.out.println("Member " + member.firstName + " " + member.lastName + " has been added to the competitive swimmers list.");
        } else {
            System.out.println("Member ID not found.");
        }

    }

    public void printcompetitiveSwimmerso18() {
        System.out.println("Here is all the records holder over 18 years");

        for (Integer key : Competitiveo18.keySet()) {
            System.out.println(key + ": " + "First Name: " + Competitiveo18.get(key).firstName + " Last Name: " + Competitiveo18.get(key).lastName + " Date of birth: " + Competitiveo18.get(key).day + "/" + Competitiveo18.get(key).month + "/" + Competitiveo18.get(key).year + " Price: " + Competitiveo18.get(key).price + "\n");
        }
    }
}