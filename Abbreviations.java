import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviation = sensitizedString(abbreviation);
        abbreviations.put(abbreviation, explanation);
    }

    public String sensitizedString(String abbreviation) {
        if (abbreviation == null) {
            return "";
        }
        abbreviation = abbreviation.trim().toLowerCase();
        return abbreviation;
    }

    public boolean hasAbbreviation(String abbreviation) {
        abbreviation = sensitizedString(abbreviation);
        if (abbreviations.containsKey(abbreviation)) {
            return true;
        } else {
            return false;
        }
    }

    public String findExplanationFor(String abbreviation){
        abbreviation = sensitizedString(abbreviation);
        return abbreviations.get(abbreviation);
    }
}
