package dio.dio_spring_boot.teste_bean;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans1 {
    @Bean
    public Gson gson() {
        return new Gson();
    }
}