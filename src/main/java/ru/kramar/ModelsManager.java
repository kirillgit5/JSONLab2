package ru.kramar;

import ru.kramar.Decoders.JsonDecoderAbstract;
import ru.kramar.Filters.PersonFilterAbstract;
import ru.kramar.Models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class ModelsManager {
    @Autowired
    PersonFilterAbstract personsFilter;
    @Autowired
    JsonDecoderAbstract jsonDecoder;

    public List<Person> getFilteredPersons() throws IOException {
        try {
            List<Person> list = jsonDecoder.getPersons();
            return  personsFilter.filtered(list);
        } catch (IOException e) {
            throw e;
        }
    }
}
