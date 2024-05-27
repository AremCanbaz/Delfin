import java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Scanner;

public class CreateMember2 {

    Scanner sc = new Scanner(System.in);
    boolean isMotionist;
    HashMap<Integer, Member> memberList = new HashMap<Integer, Member>();
    static int memberNumber = 10;

    public void createMember() {

        System.out.println("Hi Welcome to create new Member");
        System.out.println("What is the first name of the member?");
        String firstName = sc.next();

        System.out.println("What is the last name of the member?");
        String lastName = sc.next();

        System.out.println("What gender is the member? (Man, Women or other)");
        String gender = sc.next();

        System.out.println("What day is the member born?");
        int day = sc.nextInt();

        System.out.println("What month is the member born? (1-12)");
        int month = sc.nextInt();

        System.out.println("What year is the member born?");
        int year = sc.nextInt();

        System.out.println("What kind of membership has the member (Active = 1 or Passive = 2)");
        boolean isActive = sc.nextInt() == 1;

        if (isActive) {
            System.out.println("Is the member a Motionist swimmer or a Competetive (1 = Motionist or 2 = Competitive )");
            isMotionist = sc.nextInt() == 1;
        }
        memberNumber++;
        System.out.println("Member " + memberNumber + " created");
        memberList.put(memberNumber, new Member(memberNumber, firstName, lastName, day, month, year, gender, isUnder18(day, month, year), false, isMotionist, isActive, true, price(isOver60(day, month, year), isUnder18(day, month, year), isActive)));
    }

    public boolean isUnder18(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        return Period.between(date, today).getYears() < 18;
    }

    public boolean isOver60(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        return Period.between(date, today).getYears() >= 60;
    }

    public int price(boolean over60, boolean under18, boolean isActive) {
        int price = 1;
        if (!isActive) {
            price = 500;
            return price;
        } else if (isActive && under18) {
            price = 1000;
            return price;
        } else if (isActive && over60) {
            price = 1200;
            return price;
        } else if (!under18 && isActive) {
            price = 1600;
            return price;
        }
        return price;
    }

    public void printMemberList() {
        System.out.println("Hi Welcome to member site\n" +
                "Here is all the members for the union\n" + " ");

        for (Integer key : memberList.keySet()) {
            System.out.println(key + ": " + "First Name: "
                    + memberList.get(key).firstName
                    + " Last Name: " + memberList.get(key).lastName
                    + " Date of birth: " + memberList.get(key).day
                    + "/" + memberList.get(key).month
                    + "/" + memberList.get(key).year + "\n");
        }
    }

    public void printInvoices() {
        System.out.println("Hi Welcome to Invoice site\n" +
                "Here are all the invoices\n");

        for (Integer key : memberList.keySet()) {
            System.out.println(key + ": "
                    + "First Name: " + memberList.get(key).firstName
                    + " Last Name: " + memberList.get(key).lastName
                    + " Date of birth: " + memberList.get(key).day + "/" + memberList.get(key).month + "/" + memberList.get(key).year
                    + " Price: " + memberList.get(key).price
                    + " Unpaid invoice: " + memberList.get(key).restance + "\n");
        }
        printPaymentStatus();
        System.out.println("Would you like to change invoice status?\n" + "Yes = 1 \n" + "No = 2");
        int answer2 = 0;
        answer2 = sc.nextInt();
        if (answer2 == 1) {
            System.out.println("Which member do you want to change invoice status?\n" + "Enter Member Number ");
            int memberNumber = 0;
            memberNumber = sc.nextInt();
            if (memberList.containsKey(memberNumber)) {
                Member member = memberList.get(memberNumber);
                if (member.restance == true) {
                    member.restance = false;
                } else {
                    member.restance = true;
                }
                System.out.println("Invoice status for member " + memberNumber + " has been updated to = " + member.restance);
            } else {
                System.out.println("Member not found.");

            }
        }

    }

    public void printmembers() {
        System.out.println("Here is all the members");
        for (Integer key : memberList.keySet()) {
            System.out.println(key + ": " + "First Name: "
                    + memberList.get(key).firstName + " Last Name: "
                    + memberList.get(key).lastName + " Date of birth: "
                    + memberList.get(key).day + "/" + memberList.get(key).month + "/" + memberList.get(key).year + "\n");

        }


    }

    public HashMap<Integer, Member> getMemberList() {
        return memberList;
    }

    public void printPaymentStatus() {
        int paidinvoices = 0;
        int unpaidinvoices = 0;
        for (Integer key : memberList.keySet()) {
            Member member = memberList.get(key);
            if (member.isRestance()) {
                unpaidinvoices += member.getPrice();
            } else {
                paidinvoices += member.getPrice();
            }

        }
        System.out.println("Here is the total of invoices paid and unpaid :)\n" +
                "Paid invoices: " + paidinvoices + ",- DKK"
                + "\nUnpaid invoices: " + unpaidinvoices + ",- DKK");

    }

    public void loadMembers() {
        String allMembers = "allmembers1.csv";
        String line;
        String csvSplitBy = ";";

        try (BufferedReader br = new BufferedReader(new FileReader(allMembers))) {
            br.readLine(); // Skip header line

            while ((line = br.readLine()) != null) {
                try {
                    String[] members = line.split(csvSplitBy);

                    // Ensure that the CSV has the correct number of fields
                    if (members.length != 13) {
                        System.out.println("Skipping line due to incorrect number of fields: " + line);
                        continue;
                    }

                    int memberName = Integer.parseInt(members[0]);
                    String firstName = members[1];
                    String lastName = members[2];
                    int dayOfBirth = Integer.parseInt(members[3]);
                    int monthOfBirth = Integer.parseInt(members[4]);
                    int yearOfBirth = Integer.parseInt(members[5]);

                    // Validate day, month, and year of birth
                    if (dayOfBirth < 1 || dayOfBirth > 31 || monthOfBirth < 1 || monthOfBirth > 12 || yearOfBirth < 1900 || yearOfBirth > 2100) {
                        System.out.println("Skipping line due to invalid date of birth: " + line);
                        continue;
                    }

                    String gender = members[6];
                    boolean under18 = Boolean.parseBoolean(members[7]);
                    boolean over60 = Boolean.parseBoolean(members[8]);
                    boolean isMotionist = Boolean.parseBoolean(members[9]);
                    boolean isActive = Boolean.parseBoolean(members[10]);
                    boolean restance = Boolean.parseBoolean(members[11]);
                    int price = Integer.parseInt(members[12]);

                    // Assuming that the memberName is unique and can be used as a key
                    memberList.put(memberName, new Member(memberName, firstName, lastName, dayOfBirth, monthOfBirth, yearOfBirth, gender, under18, over60, isMotionist, isActive, restance, price));
                } catch (NumberFormatException e) {
                    System.out.println("Skipping line due to number format issue: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveMembersToFile() {
        String allMembers = "allmembers1.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(allMembers))) {

            for (Member member : getMemberList().values()) {
                while (!member.getFirstName().isEmpty() || !member.getLastName().isEmpty() || !member.getGender().isEmpty())
                {       BufferedReader bwr = new BufferedReader(new FileReader(allMembers));
                    bwr.readLine();
                    System.out.println("Skipping member due to filled field(s): " + member.getMemberNumber());
                }

                StringBuilder sb = new StringBuilder();
                sb.append(member.getMemberNumber()).append(";");
                sb.append(member.getFirstName()).append(";");
                sb.append(member.getLastName()).append(";");
                sb.append(member.getDay()).append(";");
                sb.append(member.getMonth()).append(";");
                sb.append(member.getYear()).append(";");
                sb.append(member.getGender()).append(";");
                sb.append(member.isUnder18()).append(";");
                sb.append(member.isOver60()).append(";");
                sb.append(member.isMotionist()).append(";");
                sb.append(member.isActive()).append(";");
                sb.append(member.isRestance()).append(";");
                sb.append(member.getPrice()).append("\n");

                bw.write(sb.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


