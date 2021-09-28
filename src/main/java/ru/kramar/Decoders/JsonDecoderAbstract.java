package ru.kramar.Decoders;

import ru.kramar.Models.Person;

import java.io.IOException;
import java.util.List;

public interface JsonDecoderAbstract {
    List<Person> getPersons() throws IOException;
}
