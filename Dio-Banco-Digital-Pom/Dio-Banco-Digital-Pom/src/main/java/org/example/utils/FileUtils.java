package org.example.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtils {
    public static String lerConteudoDoArquivo(String caminhoArquivo) {
        try {
            return new String(Files.readAllBytes(Paths.get(caminhoArquivo)));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
