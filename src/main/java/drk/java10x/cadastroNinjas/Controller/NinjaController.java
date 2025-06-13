package drk.java10x.cadastroNinjas.Controller;

import drk.java10x.cadastroNinjas.Entity.ninja.NinjaModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/home")
    public String message() {
        return "Cadastro de ninjas";
    }

    // add ninja (CREATE)
    @PostMapping("/create")
    public NinjaModel ninjaModel (@RequestBody NinjaModel ninjaModel) {
        return
    }

    // Show all ninjas (READ)
    @GetMapping(/"all")
    public List<NinjaModel> getAllNinjas () {
    }

    // show ninja by id (READ)
    @GetMapping(/"{id}")
    public List<NinjaModel> getAllNinjas (@PathVariable Long id) {
    }

    // alter data of the ninjas (UPDATE)
    @PutMapping("/update")
    public NinjaModel ninjaModel (@RequestBody NinjaModel ninjaModel) {
    }

    // deleted ninja by id (DELETE)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
    }
}
