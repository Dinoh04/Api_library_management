package school.hei.Model;

import java.sql.Date;

public class Subscribers extends User {

    private String reference;

    public Subscribers(int id, String name, Date dateOfBirth, String email, String reference) {
        super(id, name, dateOfBirth, email);
        this.reference = reference;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "Subscribers{" +
                "reference='" + reference + '\'' +
                '}';
    }
}
