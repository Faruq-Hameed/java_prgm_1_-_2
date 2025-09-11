package part_8;

import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public int hashCode() {
        String hash = country + liNumber;
        return hash.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        LicensePlate compared = (LicensePlate) obj;
        //they are equal if there hashcodes are the same
        if(this.hashCode() == compared.hashCode()) {
            return true;
        }
        
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj.getClass() == this.getClass())) {
            return false;
        }


        if (this.country.equals(compared.country)
                && this.liNumber.equals(compared.liNumber)) {
            return true;
        }

        return false;
    }

}
