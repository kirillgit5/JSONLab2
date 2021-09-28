package ru.kramar.FileManager;

import java.io.IOException;

public interface JsonFileManagerAbstract {
    String getJson(String filepath) throws IOException;
}
