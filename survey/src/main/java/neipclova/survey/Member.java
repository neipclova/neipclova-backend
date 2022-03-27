package neipclova.survey;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {
    
    @Id
    private String id;
    
    private String pw;
    private String email;
}
