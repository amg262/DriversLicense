import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MissingNameException, UnknownGenderCodeException {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Last name");
        String lName = keyboard.nextLine();

        System.out.println("Middle Initial");
        String mi = keyboard.nextLine();

        System.out.println("First Name");
        String fName = keyboard.nextLine();

        System.out.println("Enter Month 0 to 12");
        int mm = Integer.parseInt(keyboard.nextLine());

        System.out.println("Enter Day 1 to 31");
        int dd = Integer.parseInt(keyboard.nextLine());

        System.out.println("Enter Year YYYY");
        int yy = Integer.parseInt(keyboard.nextLine());

        System.out.println("Enter Gender M or F ");
        char gen = keyboard.nextLine().charAt(0);

        try {
            DriversLicense dl = new DriversLicense();

            FirstNameUtility fni = new FirstNameUtility();
            LastNameUtility lnu = new LastNameUtility();
            MonthDayGenderUtility mdgu = new MonthDayGenderUtility();

            dl.setSoundexCode(lnu.encodeLastName(lName));
            dl.setFirstNameMiddleInitial(fni.encodeFirstName(fName, mi));
            dl.setBirthYear(yy);
            dl.setBirthMonthDayGender(mdgu.encodeMonthDayGender(yy, mm, dd, gen));
            dl.setOverflow(0);
            WisconsinFormatter wi = new WisconsinFormatter();
            FloridaFormatter fl = new FloridaFormatter();
            System.out.println(wi.formatLicenseNumber(dl));
            System.out.println(fl.formatLicenseNumber(dl));

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}
