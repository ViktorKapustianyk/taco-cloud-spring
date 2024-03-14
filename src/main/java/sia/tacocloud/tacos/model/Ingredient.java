package sia.tacocloud.tacos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Entity
public class Ingredient {

    @Id
    private String id;
    private String name;
    private Type type;
}
