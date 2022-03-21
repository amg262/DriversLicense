public class MissingNameException extends Exception {
    public MissingNameException(String nameType) {
        super("Missing name" + nameType);
    }

    @Override
    public String toString() {
        return "MissingNameException{}";
    }
}

