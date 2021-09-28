package ru.kramar.Filters;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.stream.Collectors;
import ru.kramar.Models.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonAgeAndGenderFilter implements PersonFilterAbstract {
    @Value("${personFilter.gender}")
    private String gender;

    @Value("${personFilter.minAge}")
    private int minAge;

    @Value("${personFilter.maxAge}")
    private int maxAge;

    public List<Person> filtered(List<Person> personsForFiltrate) {
        return personsForFiltrate.stream()
                .filter(person -> person.gender.equals(gender))
                .filter(person -> person.age >= minAge && person.age <= maxAge)
                .collect(Collectors.toList());
    }
}
