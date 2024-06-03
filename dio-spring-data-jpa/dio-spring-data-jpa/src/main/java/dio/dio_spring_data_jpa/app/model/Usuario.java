package dio.dio_spring_data_jpa.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;

    @Column(length = 50, nullable = false)
    private String nomeCompleto;

    @Column(length = 50, nullable = false)
    private String email;

    @Column(length = 30, nullable = false)
    private String login;

    @Column(length = 100, nullable = false)
    private String senha;


}