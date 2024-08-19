package common.stream;

import lombok.Getter;

import java.util.List;

@Getter
public class School {

    private List<Person> people;

    public List<Person> getPeople() {
        return people;
    }

    public School(List<Person> people) {
        this.people = people;
    }

}
