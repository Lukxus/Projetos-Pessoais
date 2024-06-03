package dio.dio_spring_boot.teste_singleton_prototype;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Remetente {
    private String nome;
    private String email;

    @Override
    public String toString() {
        return "Remetente{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}