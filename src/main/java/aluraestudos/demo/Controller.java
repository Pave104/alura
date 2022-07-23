package aluraestudos.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    public List<LinguagemPreferida> linguagens=List.of
            (new LinguagemPreferida("Java","https://ensinado.com.br/wp-content/uploads/2021/06/java_logo_640.jpg",1));

    @GetMapping("/linguagem")
    public String processaLinguagem() {
         return "oi java spring";
     }
     @GetMapping("preferidas")
         public List<LinguagemPreferida> obterLinguagem(){

         return linguagens;
         }

    }



