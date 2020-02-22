package be.ucll.spamapp.domain;

import java.util.List;

public class Preferences {
    private int prefMinAge;
    private int prefMaxAge;
    private int prefMinLength;
    private int prefMaxLength;
    private char orientation;
    private List<Defect> prefdefects;

    public Preferences() {
    }

    public void addDefect(Defect defect)
    {
        if(prefdefects.indexOf(defect)==-1)
        {
            prefdefects.add(defect);
        }
    }

    public void removeDefect(int i)
    {
        prefdefects.remove(i);
    }

    public int getPrefMinLength() {
        return prefMinLength;
    }

    public void setPrefMinLength(int prefMinLength) {
        this.prefMinLength = prefMinLength;
    }

    public int getPrefMaxLength() {
        return prefMaxLength;
    }

    public void setPrefMaxLength(int prefMaxLength) {
        this.prefMaxLength = prefMaxLength;
    }

    public char getOrientation() {
        return orientation;
    }

    public void setOrientation(char orientation) {
        this.orientation = orientation;
    }

    public int getPrefMinAge() {
        return prefMinAge;
    }

    public void setPrefMinAge(int prefMinAge) {
        this.prefMinAge = prefMinAge;
    }

    public int getPrefMaxAge() {
        return prefMaxAge;
    }

    public void setPrefMaxAge(int prefMaxAge) {
        this.prefMaxAge = prefMaxAge;
    }

    public List<Defect> getPrefdefects() {
        return prefdefects;
    }

    public void setPrefdefects(List<Defect> prefdefects) {
        this.prefdefects = prefdefects;
    }
}
