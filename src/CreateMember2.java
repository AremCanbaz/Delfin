import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;

import java.util.Scanner;

public class CreateMember2 {
    Scanner sc = new Scanner(System.in);
    boolean isMotionist;
    HashMap<Integer, Member> memberList = new HashMap<Integer, Member>();
    static int memberNumber = 0;
    public CreateMember2() {
        // Add some dummy members for testing
        memberList.put(1, new Member(1, "John", "Doe", 15, 5, 2005, "Male", true, false, true, false, true, 1600));
        memberList.put(2, new Member(2, "Jane", "Smith", 20, 3, 1990, "Female", false, true, true, false, true, 1600));
        memberList.put(3, new Member(3,"Arem","Canbaz",10,4,2001,"Other",false, true, true, false, true, 1600));
        CreateMember2.memberNumber = 3;
    }
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
                if (member.restance == true){
                member.restance = false;
                }
                else {
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
                }
                else {
                    paidinvoices += member.getPrice();
                }

            }
                System.out.println("Here is the total of invoices paid and unpaid :)\n" +
                "Paid invoices: " + paidinvoices + ",- DKK"
                + "\nUnpaid invoices: " + unpaidinvoices + ",- DKK");

        }
    }



