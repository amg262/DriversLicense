public class UnknownGenderCodeException extends Exception {
    public UnknownGenderCodeException(char gen) {
        super("Unknown Gender: " + gen);
    }

    @Override
    public String toString() {
        return "UnknownGenderCodeException{}";
    }
}
