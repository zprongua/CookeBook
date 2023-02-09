package cookebook.domain;

import org.springframework.data.annotation.Id;

@Entity
public class Ingredient {
    @Id
    private Long id;

    private String name;

    private double weight;
}
