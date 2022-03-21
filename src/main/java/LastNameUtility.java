import org.apache.commons.codec.language.Soundex;

import java.util.Objects;

public class LastNameUtility {
    private final Soundex soundex;


    public LastNameUtility() {
        this.soundex = new Soundex();
    }

    public String encodeLastName(String lastName) throws MissingNameException {
        if (Objects.equals(lastName, "")) {
            throw new MissingNameException("Last Name");
        } else {
            return soundex.encode(lastName);
        }
    }

    @Override
    public String toString() {
        return "LastNameUtility{" +
                "soundex=" + soundex +
                '}';
    }
}
