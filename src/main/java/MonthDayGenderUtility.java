public class MonthDayGenderUtility {
    private final int MOD_MALE = 0;
    private final int MOD_FEMALE = 500;
    private final char CODE_MALE = 'M';
    private final char CODE_FEMALE = 'F';

    public MonthDayGenderUtility() {
    }

    public int encodeMonthDayGender(int year, int month, int day, char gender) throws UnknownGenderCodeException {
        if (gender != CODE_MALE && gender != CODE_FEMALE && gender != 'm' && gender != 'f') {
            throw new UnknownGenderCodeException(gender);
        } else {
            if (gender == 'm' || gender == CODE_MALE) {
                return (month - 1) * 40 + day + MOD_MALE;
            } else {
                return (month - 1) * 40 + day + MOD_FEMALE;
            }
        }
    }

    @Override
    public String toString() {
        return "MonthDayGenderUtility{" +
                "MOD_MALE=" + MOD_MALE +
                ", MOD_FEMALE=" + MOD_FEMALE +
                ", CODE_MALE=" + CODE_MALE +
                ", CODE_FEMALE=" + CODE_FEMALE +
                '}';
    }
}
