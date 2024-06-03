package dio.dio_spring_boot.teste_singleton_prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp2 implements CommandLineRunner {

    @Autowired
    public SistemaMensagem sistema;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("-------------------------------------");
        sistema.enviarConfirmacaoCadastro();
        sistema.enviarMensagemBoasVindas();
        sistema.enviarConfirmacaoCadastro();
        System.out.println("-------------------------------------");
    }
}
