package dio.dio_spring_data_jpa.app;

import dio.dio_spring_data_jpa.app.model.Usuario;
import dio.dio_spring_data_jpa.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class SistemaUsuario implements CommandLineRunner {
    @Autowired
    public UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        Usuario gleyson = criarUsuarioGleyson();
        Usuario admin = criarUsuarioAdmin();

        userRepository.save(gleyson);
        userRepository.save(admin);
        Iterable<Usuario> usuarios = userRepository.findAll();
        System.out.println("--------------------------------------");
        usuarios.forEach(u->System.out.println(u.getNomeCompleto() + " - " + u.getLogin()));
        System.out.println("--------------------------------------");

    }
    private Usuario criarUsuarioGleyson() {
        Usuario usuario = new Usuario();
        usuario.setEmail("gleyson@dio.com.br");
        usuario.setLogin("gleyson");
        usuario.setNomeCompleto("GLEYSON SAMPAIO");
        usuario.setSenha("diospringjpa");
        return usuario;
    }
    private Usuario criarUsuarioAdmin() {
        Usuario usuario = new Usuario();
        usuario.setEmail("admin@dio.com.br");
        usuario.setLogin("admin");
        usuario.setNomeCompleto("ADMINISTRADOR");
        usuario.setSenha("masterpass");
        return usuario;
    }

}