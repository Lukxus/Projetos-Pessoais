package dio.dio_spring_boot.teste_configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "remetente")
public class Remetente1 {
    private String nome;
    private String email;
    private List<Long> telefones;

}