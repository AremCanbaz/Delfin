import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PrintingBestDisciples {

    public void printingSortedlistTrainingu18() {
        // Assuming CreateCompetitiveSwimmers is another class that provides access to the records list
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
                        "Training day: " + record.getTrainingResultDay() + "/" + record.getTrainingResultMonth() + "/" + record.getTrainingresultYear());
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
                        "Training day: " + record.gettournementDay() + "/" + record.gettournementMonth() + "/" + record.gettournementYear());
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
                        "Training day: " + record.getTrainingResultDay() + "/" + record.getTrainingResultMonth() + "/" + record.getTrainingresultYear());
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
                        "Training day: " + record.gettournementDay() + "/" + record.gettournementMonth() + "/" + record.gettournementYear());
            }
        } catch (Exception e) {
            System.out.println("An error occurred while printing: " + e.getMessage());
            e.printStackTrace();
        }
    }

}

