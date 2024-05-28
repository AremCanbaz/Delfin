import java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Scanner;

public class CreateMember2 { // klasse for metoder tilhørende oprettelse af members

    Scanner sc = new Scanner(System.in);
    boolean isMotionist;
    HashMap<Integer, Member> memberList = new HashMap<Integer, Member>();
    static int memberNumber = 12;

    public void createMember() { //metoden som spørg om alt info den har behov for til at oprette et medlem

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

        if (isActive) { // hvis aktiv, så hvilken aktiv medlem er.
            System.out.println("Is the member a Motionist swimmer or a Competetive (1 = Motionist or 2 = Competitive )");
            isMotionist = sc.nextInt() == 1;
        }
        memberNumber++;
        System.out.println("Member " + memberNumber + ": " +  firstName +" is created"); //
        memberList.put(memberNumber, new Member(memberNumber, firstName, lastName, day, month, year, gender, isUnder18(day, month, year), false, isMotionist, isActive, true, price(isOver60(day, month, year), isUnder18(day, month, year), isActive)));
    }

    public boolean isUnder18(int day, int month, int year) { // tjekker om medlemmet er under 18.
        LocalDate date = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        return Period.between(date, today).getYears() < 18;
    }

    public boolean isOver60(int day, int month, int year) { //tjekker om medlemmet er over 60
        LocalDate date = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        return Period.between(date, today).getYears() >= 60;
    }

    public int price(boolean over60, boolean under18, boolean isActive) { // udregner selv prisen for medlemmerne ud fra de oplysninger vi modtager
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

    public void printMemberList() { // metode til at printe medlemmer af foreningen
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
        // printer hvem der skylder penge og hvor meget der er betalt og hvor meget der skyldes
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

    public void printmembersu18() {
        System.out.println("Here is all the members who are competetive and can be made records to under 18 ");
        for (Integer key : memberList.keySet()) {
            Member member = memberList.get(key);
            if (!member.isMotionist() && member.isUnder18()) {
                System.out.println(key + ": " + "First Name: "
                        + member.getFirstName() + " Last Name: "
                        + member.getLastName() + " Date of birth: "
                        + member.getDay() + "/" + member.getMonth() + "/" + member.getYear() + "\n");

            }


        }
    }
        public void printmemberso18() {
            System.out.println("Here is all the members who are competetive and can be made records to over 18 ");
            for (Integer key : memberList.keySet()) {
                Member member = memberList.get(key);
                if (!member.isMotionist() && !member.isUnder18()) {
                    System.out.println(key + ": " + "First Name: "
                            + member.getFirstName() + " Last Name: "
                            + member.getLastName() + " Date of birth: "
                            + member.getDay() + "/" + member.getMonth() + "/" + member.getYear() + "\n");

                }
            }
        }
        // getter til at modtage hashmappet oplysninger
    public HashMap<Integer, Member> getMemberList() {
        return memberList;
    }
        //metode der bruges længere oppe til at printe hvor mange penge der skyldes og der er betalt
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
        // metode til at aflæse csv fil til at plugge medlemmer ind.
    public void loadMembers() {
        String allMembers = "allmembers1.csv";
        String line;
        String csvSplitBy = ";";

        try (BufferedReader br = new BufferedReader(new FileReader(allMembers))) {
            br.readLine(); // læser første linje

            while ((line = br.readLine()) != null) {
                try {
                    String[] members = line.split(csvSplitBy);

                    // Tjekker om der er nok oplysninger til at plugge medlemmerne ind
                    if (members.length != 13) {
                        System.out.println("Skipping line due to incorrect number of fields: " + line);
                        continue;
                    }

                    int memberNumber = Integer.parseInt(members[0]);
                    String firstName = members[1];
                    String lastName = members[2];
                    int dayOfBirth = Integer.parseInt(members[3]);
                    int monthOfBirth = Integer.parseInt(members[4]);
                    int yearOfBirth = Integer.parseInt(members[5]);

                    // sikre sig at medlemmerne har korrekte fødselsdage
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
                    memberList.put(memberNumber, new Member(memberNumber, firstName, lastName, dayOfBirth, monthOfBirth, yearOfBirth, gender, under18, over60, isMotionist, isActive, restance, price));
                } catch (NumberFormatException e) {
                    System.out.println("Skipping line due to number format issue: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


