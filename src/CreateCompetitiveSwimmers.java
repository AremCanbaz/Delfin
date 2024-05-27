import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class CreateCompetitiveSwimmers {
    HashMap<Integer, CompetetiveSwimmer> Competitiveo18 = new HashMap<>();
    HashMap<Integer, CompetetiveSwimmer> Competitiveu18 = new HashMap<>();
    ArrayList<RecordsTournament> recordsTournamentArrayListo18 = new ArrayList<>();
    ArrayList<RecordsTraining> recordsTrainingoArraylisto18 = new ArrayList<>();
    ArrayList<RecordsTournament> recordsTournamentArrayListu18 = new ArrayList<>();
    ArrayList<RecordsTraining> recordsTrainingoArraylistu18 = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    CreateMember2 createMember2 = new CreateMember2();


    public CreateCompetitiveSwimmers(CreateMember2 createMember2) {
        this.createMember2 = createMember2;
    }

    public void createCompetitiveSwimmersu18() {

        createMember2.printmembersu18();
        String answer = "";
        System.out.println("Enter the ID of the member you want to add a record to: ");
        int memberId = sc.nextInt();
        System.out.println("What disciple does he swim in: \n" +
                " 1 = Crawl\n" +
                " 2 = Breast swimming\n " +
                " 3 = Butterfly\n " +
                " 4 = BackCrawl");
        if (sc.nextInt() == 1) {
            answer = "Crawl";
        } else if (sc.nextInt() == 2) {
            answer = "Breast Swimming";
        } else if (sc.nextInt() == 3) {
            answer = "Butterfly Swimming";
        } else if (sc.nextInt() == 4) {
            answer = "BackCrawl";
        }

        String swimCompetitive = answer;
        Member member = createMember2.getMemberList().get(memberId);


        if (createMember2.memberList.containsKey(memberId) && createMember2.getMemberList().get(memberId).isUnder18() && !member.isMotionist()) {

            System.out.println(member.memberNumber + member.firstName + member.lastName);
            Competitiveu18.put(member.memberNumber, new CompetetiveSwimmer(member.memberNumber, member.firstName, member.lastName, member.day, member.month, member.year, member.gender, member.under18, false, member.isMotionist, member.isActive, true,
                    member.price, swimCompetitive));

        }
    }

    public void createCompetitiveSwimmerso18() {

        createMember2.printmemberso18();
        String answer = "";
        System.out.println("Enter the ID of the member you want to add a record to: ");
        int memberId = sc.nextInt();
        System.out.println("What disciple does he swim in: \n" +
                " 1 = Crawl\n" +
                " 2 = Breast swimming\n " +
                "3 = Butterfly\n " +
                "4 = BackCrawl");
        if (sc.nextInt() == 1) {
            answer = "Crawl";
        } else if (sc.nextInt() == 2) {
            answer = "Breast Swimming";
        } else if (sc.nextInt() == 3) {
            answer = "Butterfly Swimming";
        } else if (sc.nextInt() == 4) {
            answer = "BackCrawl";
        }

        String swimCompetitive = answer;
        Member member = createMember2.getMemberList().get(memberId);


        if (createMember2.memberList.containsKey(memberId) && member.isUnder18() && !member.isMotionist()) {

            System.out.println(member.memberNumber + member.firstName + member.lastName);
            Competitiveo18.put(member.memberNumber, new CompetetiveSwimmer(member.memberNumber, member.firstName, member.lastName, member.day, member.month, member.year, member.gender, member.under18, false, member.isMotionist, member.isActive, true,
                    member.price, swimCompetitive));

        }
    }


    public void creatingaRecordso18() {
        System.out.println("Here is all the records holder over 18 years");
        Competitiveo18.put(11, new CompetetiveSwimmer(11, "Arem", "Canbaz", 1, 2, 2018, "Man", false, false, false, true, true,
                1600, "Crawl"));

        for (Integer key : Competitiveo18.keySet()) {
            CompetetiveSwimmer swimmer = Competitiveo18.get(key);
            if (!swimmer.isMotionist() && swimmer.isActive() && !swimmer.isUnder18()) {
                System.out.println("Member Number: " + key + "\nFirst Name: " + swimmer.getFirstName() + "\nLast Name: " + swimmer.getLastName()
                        + "\nDate of birth: " + swimmer.getDay()
                        + "/" + swimmer.getMonth()
                        + "/" + swimmer.getYear()
                        + "\nGender: " + swimmer.getGender()
                        + "\nSwim Disciple: " + swimmer.getSwimDisciple());
            }
        }

        System.out.println("\nWhich member do you want to add a record to ");
        int memberNumber = sc.nextInt();
        CompetetiveSwimmer swimmer = Competitiveo18.get(memberNumber);
        System.out.println("\nYou choose to make a record to " + swimmer.getFirstName() + " " + swimmer.getLastName());
        System.out.println("\nIs the record creation for a convention = 1 or a personal record = 2");
        int asw1 = sc.nextInt();
        if (asw1 == 1) {
            System.out.println("Where was the convention");
            String convention = sc.next();
            System.out.println("What day was it");
            int day = sc.nextInt();
            System.out.println("What month was it");
            int month = sc.nextInt();
            System.out.println("What year was it");
            int year = sc.nextInt();
            System.out.println("What placement did the swimmer get");
            int placement = sc.nextInt();
            RecordsTournament recordsTournament = new  RecordsTournament(swimmer.getMemberNumber()
                    , swimmer.getFirstName()
                    , swimmer.getLastName(),
                    swimmer.getDay(),
                    swimmer.getMonth(),
                    swimmer.getYear(),
                    swimmer.getGender(),
                    swimmer.isUnder18(),
                    swimmer.isOver60()
                    , swimmer.isMotionist()
                    , swimmer.isActive(),
                    swimmer.isRestance(),
                    swimmer.getPrice(),
                    swimmer.getSwimDisciple(),
                    convention, day
                    , month
                    , year
                    , placement);
            recordsTournamentArrayListo18.add(recordsTournament);

        } else if (asw1 == 2) {
            System.out.println("What was the time for the record ex 10.82");
            double time = sc.nextDouble();
            System.out.println("What day was it");
            int day = sc.nextInt();
            System.out.println("What month was it");
            int month = sc.nextInt();
            System.out.println("What year was it");
            int year = sc.nextInt();
            RecordsTraining recordsTraining = new RecordsTraining(swimmer.getMemberNumber()
                    , swimmer.getFirstName()
                    , swimmer.getLastName(),
                    swimmer.getDay(),
                    swimmer.getMonth(),
                    swimmer.getYear(),
                    swimmer.getGender(),
                    swimmer.isUnder18(),
                    swimmer.isOver60()
                    , swimmer.isMotionist()
                    , swimmer.isActive(),
                    swimmer.isRestance(),
                    swimmer.getPrice(),
                    swimmer.getSwimDisciple(),
                    time
                    , day
                    , month
                    , year);
            recordsTrainingoArraylisto18.add(recordsTraining);
        }

    }


    public void creatingaRecordsu18() {
        System.out.println("Here is all the records holder under 18 years");
        Competitiveu18.put(11, new CompetetiveSwimmer(11, "Arem", "Canbaz", 1, 2, 2018, "Man", true, false, false, true, true,
                1600, "Crawl"));
        Competitiveu18.put(12, new CompetetiveSwimmer(12, "Arem", "Canbaz", 1, 2, 2018, "Woman", true, false, false, true, true,
                1600, "BackCrawl"));

        for (Integer key : Competitiveu18.keySet()) {
            CompetetiveSwimmer swimmer = Competitiveu18.get(key);
            if (!swimmer.isMotionist() && swimmer.isActive() && swimmer.isUnder18()) {
                System.out.println("Member Number: " + key + "\nFirst Name: " + swimmer.getFirstName() + "\nLast Name: " + swimmer.getLastName()
                        + "\nDate of birth: " + swimmer.getDay()
                        + "/" + swimmer.getMonth()
                        + "/" + swimmer.getYear()
                        + "\nGender: " + swimmer.getGender()
                        + "\nSwim Disciple: " + swimmer.getSwimDisciple());
            }
        }

        System.out.println("\nWhich member do you want to add a record to ");
        int memberNumber = sc.nextInt();
        CompetetiveSwimmer swimmer = Competitiveu18.get(memberNumber);
        System.out.println("\nYou choose to make a record to " + swimmer.getFirstName() + " " + swimmer.getLastName());
        System.out.println("\nIs the record creation for a convention = 1 or a personal record = 2");
        int asw1 = sc.nextInt();
        if (asw1 == 1) {
            System.out.println("Where was the convention");
            String convention = sc.next();
            System.out.println("What day was it");
            int day = sc.nextInt();
            System.out.println("What month was it");
            int month = sc.nextInt();
            System.out.println("What year was it");
            int year = sc.nextInt();
            System.out.println("What placement did the swimmer get");
            int placement = sc.nextInt();
            RecordsTournament recordsTournament = new RecordsTournament(swimmer.getMemberNumber()
                    , swimmer.getFirstName()
                    , swimmer.getLastName(),
                    swimmer.getDay(),
                    swimmer.getMonth(),
                    swimmer.getYear(),
                    swimmer.getGender(),
                    swimmer.isUnder18(),
                    swimmer.isOver60()
                    , swimmer.isMotionist()
                    , swimmer.isActive(),
                    swimmer.isRestance(),
                    swimmer.getPrice(),
                    swimmer.getSwimDisciple(),
                    convention, day
                    , month
                    , year
                    , placement);
            recordsTournamentArrayListu18.add(recordsTournament);

        } else if (asw1 == 2) {
            System.out.println("What was the time for the record ex 10.82");
            double time = sc.nextDouble();
            System.out.println("What day was it");
            int day = sc.nextInt();
            System.out.println("What month was it");
            int month = sc.nextInt();
            System.out.println("What year was it");
            int year = sc.nextInt();
            RecordsTraining recordsTraining = new RecordsTraining(swimmer.getMemberNumber()
                    , swimmer.getFirstName()
                    , swimmer.getLastName(),
                    swimmer.getDay(),
                    swimmer.getMonth(),
                    swimmer.getYear(),
                    swimmer.getGender(),
                    swimmer.isUnder18(),
                    swimmer.isOver60()
                    , swimmer.isMotionist()
                    , swimmer.isActive(),
                    swimmer.isRestance(),
                    swimmer.getPrice(),
                    swimmer.getSwimDisciple(),
                    time
                    , day
                    , month
                    , year);
            recordsTrainingoArraylistu18.add(recordsTraining);
        }
        System.out.println("Current records in list:");
        for (RecordsTraining record : recordsTrainingoArraylistu18) {
            System.out.println(record);
        }
    }

        public void printingSortedlistTrainingu18() {
            CreateMember2 createMember2 = new CreateMember2();
            CreateCompetitiveSwimmers createCompetitiveSwimmers = new CreateCompetitiveSwimmers(createMember2);

            // Get the records list
            ArrayList<RecordsTraining> recordsTrainingsu18 = createCompetitiveSwimmers.getRecordsTrainingoArrayListu18();

            // Check if the list is null or empty
            if (recordsTrainingsu18 == null || recordsTrainingsu18.isEmpty()) {
                System.out.println("No records to print.");
                return;
            }

            // Sort the list first by swim disciple and then by training result time
            List<RecordsTraining> sortedList = recordsTrainingsu18.stream()
                    .sorted(Comparator.comparing(RecordsTraining::getSwimDisciple)
                            .thenComparingDouble(RecordsTraining::getTrainingResultTime))
                    .collect(Collectors.toList());

            try {
                // Print the sorted list
                for (RecordsTraining record : sortedList) {
                    System.out.println("Member Number: " + record.getMemberNumber() +
                            "\nFirst Name: " + record.getFirstName() +
                            "\nLast Name: " + record.getLastName() +
                            "\nDate of birth: " + record.getDay() + "/" + record.getMonth() + "/" + record.getYear() +
                            "\nGender: " + record.getGender() +
                            "\nSwim Disciple: " + record.getSwimDisciple() +
                            "\nTraining Result Time: " + record.getTrainingResultTime() +
                            "Training day: " + record.getTrainingResultDay() + "/" + record.getTrainingResultMonth() + "/" + record.getTrainingresultYear() + "\n");
                }
            } catch (Exception e) {
                System.out.println("An error occurred while printing: " + e.getMessage());
                e.printStackTrace();
            }
        }
        public void printingSortedlistTournamentu18() {
            // Assuming CreateCompetitiveSwimmers is another class that provides access to the records list
            CreateMember2 createMember2 = new CreateMember2();
            CreateCompetitiveSwimmers createCompetitiveSwimmers = new CreateCompetitiveSwimmers(createMember2);

            // Get the records list
            ArrayList<RecordsTournament> recordsTournamentsu18 = createCompetitiveSwimmers.getRecordsTournamentArrayListu18();

            // Check if the list is null or empty
            if (recordsTournamentsu18 == null || recordsTournamentsu18.isEmpty()) {
                System.out.println("No records to print.");
                return;
            }

            // Sort the list first by swim disciple and then by training result time
            List<RecordsTournament> sortedList = recordsTournamentsu18.stream()
                    .sorted(Comparator.comparing(RecordsTournament::getSwimDisciple)
                            .thenComparingInt(RecordsTournament::getplacement))
                    .collect(Collectors.toList());

            try {
                // Print the sorted list
                for (RecordsTournament record : sortedList) {
                    System.out.println("Member Number: " + record.getMemberNumber() +
                            "\nFirst Name: " + record.getFirstName() +
                            "\nLast Name: " + record.getLastName() +
                            "\nDate of birth: " + record.getDay() + "/" + record.getMonth() + "/" + record.getYear() +
                            "\nGender: " + record.getGender() +
                            "\nSwim Disciple: " + record.getSwimDisciple() +
                            "\nPlacement: " + record.getplacement() +
                            "Training day: " + record.gettournementDay() + "/" + record.gettournementMonth() + "/" + record.gettournementYear() + "\n");
                }
            } catch (Exception e) {
                System.out.println("An error occurred while printing: " + e.getMessage());
                e.printStackTrace();
            }
        }
        public void printingSortedlistTrainingo18() {
            // Assuming CreateCompetitiveSwimmers is another class that provides access to the records list
            CreateMember2 createMember2 = new CreateMember2();
            CreateCompetitiveSwimmers createCompetitiveSwimmers = new CreateCompetitiveSwimmers(createMember2);

            // Get the records list
            ArrayList<RecordsTraining> recordsTrainingso18 = createCompetitiveSwimmers.getRecordsTrainingo18();

            // Check if the list is null or empty
            if (recordsTrainingso18 == null || recordsTrainingso18.isEmpty()) {
                System.out.println("No records to print.");
                return;
            }

            // Sort the list first by swim disciple and then by training result time
            List<RecordsTraining> sortedList = recordsTrainingso18.stream()
                    .sorted(Comparator.comparing(RecordsTraining::getSwimDisciple)
                            .thenComparingDouble(RecordsTraining::getTrainingResultTime))
                    .collect(Collectors.toList());

            try {
                // Print the sorted list
                for (RecordsTraining record : sortedList) {
                    System.out.println("Member Number: " + record.getMemberNumber() +
                            "\nFirst Name: " + record.getFirstName() +
                            "\nLast Name: " + record.getLastName() +
                            "\nDate of birth: " + record.getDay() + "/" + record.getMonth() + "/" + record.getYear() +
                            "\nGender: " + record.getGender() +
                            "\nSwim Disciple: " + record.getSwimDisciple() +
                            "\nTraining Result Time: " + record.getTrainingResultTime() +
                            "Training day: " + record.getTrainingResultDay() + "/" + record.getTrainingResultMonth() + "/" + record.getTrainingresultYear() + "\n");
                }
            } catch (Exception e) {
                System.out.println("An error occurred while printing: " + e.getMessage());
                e.printStackTrace();
            }
        }
        public void printingSortedlistTournamento18() {
            // Assuming CreateCompetitiveSwimmers is another class that provides access to the records list
            CreateMember2 createMember2 = new CreateMember2();
            CreateCompetitiveSwimmers createCompetitiveSwimmers = new CreateCompetitiveSwimmers(createMember2);

            // Get the records list
            ArrayList<RecordsTournament> recordsTournamentso18 = createCompetitiveSwimmers.getRecordsTournamento18();

            // Check if the list is null or empty
            if (recordsTournamentso18 == null || recordsTournamentso18.isEmpty()) {
                System.out.println("No records to print.");
                return;
            }

            // Sort the list first by swim disciple and then by training result time
            List<RecordsTournament> sortedList = recordsTournamentso18.stream()
                    .sorted(Comparator.comparing(RecordsTournament::getSwimDisciple)
                            .thenComparingInt(RecordsTournament::getplacement))
                    .collect(Collectors.toList());

            try {
                // Print the sorted list
                for (RecordsTournament record : sortedList) {
                    System.out.println("Member Number: " + record.getMemberNumber() +
                            "\nFirst Name: " + record.getFirstName() +
                            "\nLast Name: " + record.getLastName() +
                            "\nDate of birth: " + record.getDay() + "/" + record.getMonth() + "/" + record.getYear() +
                            "\nGender: " + record.getGender() +
                            "\nSwim Disciple: " + record.getSwimDisciple() +
                            "\nPlacement: " + record.getplacement() +
                            "Training day: " + record.gettournementDay() + "/" + record.gettournementMonth() + "/" + record.gettournementYear() + "\n");
                }
            } catch (Exception e) {
                System.out.println("An error occurred while printing: " + e.getMessage());
                e.printStackTrace();
            }
        }


        public ArrayList<RecordsTournament> getRecordsTournamento18(){
        return this.recordsTournamentArrayListo18;
    }
    public ArrayList<RecordsTraining> getRecordsTrainingo18(){
        return this.recordsTrainingoArraylisto18;
    }

    public ArrayList<RecordsTournament> getRecordsTournamentArrayListu18() {
        return this.recordsTournamentArrayListu18;
    }
    public ArrayList<RecordsTraining> getRecordsTrainingoArrayListu18() {
        return this.recordsTrainingoArraylistu18;
    }
}




