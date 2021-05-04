package Ramon.Uriel.ProjetoCRUD.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController {


    @RequestMapping("/CadastrarProduto")
    public String form() {
        return "FormCadastro";

    }
}
