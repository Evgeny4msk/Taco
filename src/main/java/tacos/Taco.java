package tacos;


import java.util.List;

import lombok.Data;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Taco {
    @NonNull
    private String name;

    private List<Ingredient> ingredients;
}
