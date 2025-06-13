package drk.java10x.cadastroNinjas.Controller;

import drk.java10x.cadastroNinjas.Entity.ninja.NinjaModel;
import drk.java10x.cadastroNinjas.services.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/home")
    public String message() {
        return "Cadastro de ninjas";
    }

    // Create ninja
    @PostMapping("/create")
    public NinjaModel create(@RequestBody NinjaModel ninjaModel) {
        return ninjaService.createNinja(ninjaModel);
    }

    // Read all ninjas
    @GetMapping("/all")
    public List<NinjaModel> getAllNinjas() {
        return ninjaService.getAllNinjas();
    }

    // Read ninja by ID
    @GetMapping("/{id}")
    public Optional<NinjaModel> getNinjaById(@PathVariable Long id) {
        return ninjaService.getNinjaById(id);
    }

    // Update ninja
    @PutMapping("/update")
    public NinjaModel update(@RequestBody NinjaModel ninjaModel) {
        return ninjaService.ninjaUpdate(ninjaModel);
    }

    // Delete ninja by ID
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        ninjaService.delete(id);
    }
}
