package dio.dio_spring_data_jpa.app.repository;

import dio.dio_spring_data_jpa.app.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario, Integer> {

}
