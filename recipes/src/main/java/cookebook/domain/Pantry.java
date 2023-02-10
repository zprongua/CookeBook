package cookebook.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Pantry {
    @Id
    private Long id;

    @OneToOne
    private User user;
}
