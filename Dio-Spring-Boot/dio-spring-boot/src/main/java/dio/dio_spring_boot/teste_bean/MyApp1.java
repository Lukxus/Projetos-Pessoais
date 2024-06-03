package dio.dio_spring_boot.teste_bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp1 implements CommandLineRunner {
    @Autowired
    private ConversorJson  conversor ;

    @Override
    public void run(String... args) throws Exception {
        String json = "{\"cep\": \"01001-000\",\"logradouro\": \"Praça da Sé\",\"localidade\": \"São Paulo\"}";
        ViaCepResponse response = conversor.converter(json);
        System.out.println("Dados do CEP: " + response);
    }
}
