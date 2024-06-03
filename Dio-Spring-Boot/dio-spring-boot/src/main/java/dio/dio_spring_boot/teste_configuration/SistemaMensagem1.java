package dio.dio_spring_boot.teste_configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem1 implements CommandLineRunner {
    @Autowired
    private Remetente1 rementente;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("||-----------------------||");
        System.out.println("Mensagem enviada por: " + rementente.getNome()
                + "\nE-mail:" + rementente.getEmail() + "\nCom telefones para contato: "
                + rementente.getTelefones());
        System.out.println("Seu cadastro foi aprovado");
        System.out.println("||-----------------------||");
    }
}