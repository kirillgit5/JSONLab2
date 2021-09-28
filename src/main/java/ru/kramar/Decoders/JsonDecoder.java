package ru.kramar.Decoders;

import ru.kramar.FileManager.JsonFileManagerAbstract;
import ru.kramar.Models.Person;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.lang.reflect.Type;

@Component
public class JsonDecoder implements JsonDecoderAbstract {
    @Value("${generatedJson.path}")
    private String personMockPath;

    @Autowired
    private JsonFileManagerAbstract fileManager;

    public List<Person> getPersons() throws IOException  {
        Gson gson = null;
        String json = null;

        try {
            gson = new Gson();
            json = fileManager.getJson(personMockPath);
        } catch (IOException e) {
            throw e;
        }

        Type personListType = new TypeToken<List<Person>>() {}.getType();
        return  gson.fromJson(json, personListType);
    }
}
