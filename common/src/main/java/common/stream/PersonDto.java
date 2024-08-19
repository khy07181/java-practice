package common.stream;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class PersonDto {

    private String name;

    private int age;

    private String email;

    public PersonDto() {
    }

    public PersonDto(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
