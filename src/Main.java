import java.util.Scanner;
public class Main{
    static CreateMember2 createMember2 = new CreateMember2();
    static CreateCompetitiveSwimmers createCompetitiveSwimmers = new CreateCompetitiveSwimmers(createMember2);
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to the main menu!\n" +
                    "you have 5 options\n"+
                    "1 = Create a member\n"
            + "2 = View all members\n"
            + "3 = View all paid or unpaid invoices\n" +
                    "4 = Create a new competitive score \n"
            +  "5 = View all competitive records");
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
                case 4: {
                    createCompetitiveSwimmers.createCompetitiveSwimmers();
                }
                case 5:{
                    System.out.println("Who do you want to see the score for ?\n " + "Under 18 = 1\n Over 18 = 2");
                    int choice = sc.nextInt();
                    switch (choice){
                        case 1: {
                            createCompetitiveSwimmers.printcompetitiveSwimmersu18();
                            break;
                        }
                        case 2: {
                            createCompetitiveSwimmers.printcompetitiveSwimmerso18();
                            break;
                        }
                    }

                }
                default:
                    System.out.println("Wrong choice, try again!\n"+
                            "Remember to use a number this time:) ");
            }
        }

    }
    }