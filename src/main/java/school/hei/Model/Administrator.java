package school.hei.Model;

import java.sql.Date;

public class Administrator extends User {

    public Administrator(int id, String name, Date dateOfBirth, String email) {
        super(id, name, dateOfBirth, email);
    }
}
