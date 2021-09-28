package ru.kramar.Filters;
import ru.kramar.Models.Person;

import java.util.List;

public interface PersonFilterAbstract {
    List<Person> filtered(List<Person> persons);
}
