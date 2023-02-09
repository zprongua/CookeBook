package cookebook.domain;

import org.springframework.data.annotation.Id;

@Entity
public class User {
    @Id
    private Long id;

    private String login;

    private String fname;

    private String lname;

    private String email;
}
