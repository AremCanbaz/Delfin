import java.util.Scanner;
public class Main{
    static CreateMember2 createMember2 = new CreateMember2();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to the main menu!\n" +
                    "you have 5 options\n"+
                    "1 = Create a member\n"
            + "2 = View all members\n"
            + "3 = View all paid or unpaid invoices\n"
            +"4 = View all competitive records\n"
            + "5 = Create a new competitive score");
            int answer = 0;
            answer = sc.nextInt();
            switch (answer) {
                case 1: {
                    createMember2.createMember();
                    break;
                }
                case 2: {
                    createMember2.printMemberList();
                    break;
                }
                case 3: {
                    createMember2.printInvoices();
                    break;
                }

                default:
                    System.out.println("Wrong choice, try again!\n "+
                            "Remember to use a number this time:) ");
            }
        }

    }
    }