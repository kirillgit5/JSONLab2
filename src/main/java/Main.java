import ru.kramar.Config;
import ru.kramar.Models.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.kramar.ModelsManager;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ModelsManager modelsManager = context.getBean(ModelsManager.class);
        try {
            List<Person> list = modelsManager.getFilteredPersons();
            System.out.println(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}