public class FloridaFormatter implements DriversLicenseFormatter {

    public FloridaFormatter() {
    }

    public String formatLicenseNumber(DriversLicense driversLicense) {
        String SSSS = driversLicense.getSoundexCode();
        String FFF = String.valueOf(driversLicense.getFirstNameMiddleInitial());
        String YY = String.valueOf(driversLicense.getBirthYear());
        String DDD = String.valueOf(driversLicense.getBirthMonthDayGender());
        String N = String.valueOf(driversLicense.getOverflow());

        return String.format("Florida DL #: %s-%s-%s-%s-%s", SSSS, FFF, YY.substring(2,4), DDD, N);
    }

    @Override
    public String toString() {
        return "FloridaFormatter{}";
    }
}
