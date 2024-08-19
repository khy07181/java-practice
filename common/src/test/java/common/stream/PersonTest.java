package common.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

class PersonTest {

    @Test
    void stream() {
        List<Person> people = List.of(
                new Person("John", 25, "email1@email.com"),
                new Person("John", 25, "email2@email.com"),
                new Person("Jane", 22, "email3@email.com"),
                new Person("Jane", 22, "email4@email.com"),
                new Person("Jane", 22, "email5@email.com"),
                new Person("Jane", 22, "email6@email.com"),
                new Person("John", 25, "email7@email.com"),
                new Person("John", 25, "email8@email.com")
        );

        School school = new School(people);

        List<PersonDto> collect = school.getPeople().stream()
                .distinct()
                .map(person -> {
                    System.out.println(person.getName() + " " + person.getAge() + " " + person.getEmail());
                    return new PersonDto(person.getName(), person.getAge(), person.getEmail());
                })
                .toList();

        System.out.println();


    }

}
