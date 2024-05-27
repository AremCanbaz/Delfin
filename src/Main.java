import java.util.Scanner;
public class Main{

    static CreateMember2 createMember2 = new CreateMember2();
    static CreateCompetitiveSwimmers createCompetitiveSwimmers = new CreateCompetitiveSwimmers(createMember2);
    static PrintingBestDisciples printingBestDisciples = new PrintingBestDisciples();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to the main menu!\n" +
                    "you have 5 options\n"+
                    "1 = Create a member\n"
                    + "2 = View all members\n"
                    + "3 = View all paid or unpaid invoices\n" +
                    "4 creating a competitive swimmer under 18\n" +
                    "5 creating a competitive swimmer over 18\n" +
                    "6 Creating a record for the a competetive swimmer\n" +
                    "8 = View the best 5 records for all disciples");
            int answer = 0;
            answer = sc.nextInt();
            switch (answer) {
                case 1: {
                    createMember2.createMember();
                    break;
                }
                case 2: {
                    createMember2.loadMembers();
                    createMember2.printMemberList();
                    break;
                }
                case 3: {
                    createMember2.printInvoices();
                    break;
                }
                case 4: {
                    createCompetitiveSwimmers.createCompetitiveSwimmersu18();
                    break;
                }
                case 5:{
                  createCompetitiveSwimmers.createCompetitiveSwimmerso18();
                  break;
                }
                case 6: {
                    System.out.println("is the member over 18 = 1 or under 18 = 2 ");
                    int asw = sc.nextInt();
                    if (asw == 1) {
                        createCompetitiveSwimmers.creatingaRecordso18();
                        break;
                    }
                    else if (asw == 2) {
                        createCompetitiveSwimmers.creatingaRecordsu18();
                        break;
                    }
                    }

                case 7: {
                    System.out.println("You can see all the records here for tournaments or personal records\n" +
                            "Under 18 personal records = 1\n" +
                            "Under 18 Tournaments records = 2\n" +
                            "Over 18 personal records = 3\n" +
                            "Over 18 Tournaments records = 4\n");
                    int asw = sc.nextInt();
                    if (asw == 1) {
                        createCompetitiveSwimmers.printingSortedlistTrainingu18();
                        break;
                    }
                    else if (asw == 2) {
                        createCompetitiveSwimmers.printingSortedlistTournamentu18();
                        break;
                    }
                    else if (asw == 3) {
                        createCompetitiveSwimmers.printingSortedlistTrainingo18();
                        break;
                    }
                    else if (asw == 4) {
                        createCompetitiveSwimmers.printingSortedlistTournamento18();
                        break;
                    }

                }

                default:
                    System.out.println("Wrong choice, try again!\n"+
                            "Remember to use a number this time:) ");
            }
        }

    }
    }