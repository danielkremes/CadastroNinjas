package drk.java10x.cadastroNinjas;

import drk.java10x.cadastroNinjas.Entity.ninja.NinjaModel;
import drk.java10x.cadastroNinjas.Repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StarterApp implements CommandLineRunner {

    private NinjaRepository ninjaRepository;

    public StarterApp(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<NinjaModel> ninjas = List.of(
                new NinjaModel("ninhaUser1", 18),
                new NinjaModel("ninhaUser2", 19),
                new NinjaModel("ninhaUser3", 20),
                new NinjaModel("ninhaUser4", 21),
                new NinjaModel("ninhaUser5", 22),
                new NinjaModel("ninhaUser6", 23),
                new NinjaModel("ninhaUser7", 24),
                new NinjaModel("ninhaUser8", 25),
                new NinjaModel("ninhaUser9", 26),
                new NinjaModel("ninhaUser10", 27),
                new NinjaModel("ninhaUser11", 18),
                new NinjaModel("ninhaUser12", 19),
                new NinjaModel("ninhaUser13", 20),
                new NinjaModel("ninhaUser14", 21),
                new NinjaModel("ninhaUser15", 22),
                new NinjaModel("ninhaUser16", 23),
                new NinjaModel("ninhaUser17", 24),
                new NinjaModel("ninhaUser18", 25),
                new NinjaModel("ninhaUser19", 26),
                new NinjaModel("ninhaUser20", 27),
                new NinjaModel("ninhaUser21", 18),
                new NinjaModel("ninhaUser22", 19),
                new NinjaModel("ninhaUser23", 20),
                new NinjaModel("ninhaUser24", 21),
                new NinjaModel("ninhaUser25", 22),
                new NinjaModel("ninhaUser26", 23),
                new NinjaModel("ninhaUser27", 24),
                new NinjaModel("ninhaUser28", 25),
                new NinjaModel("ninhaUser29", 26),
                new NinjaModel("ninhaUser30", 27),
                new NinjaModel("ninhaUser31", 18),
                new NinjaModel("ninhaUser32", 19),
                new NinjaModel("ninhaUser33", 20),
                new NinjaModel("ninhaUser34", 21),
                new NinjaModel("ninhaUser35", 22),
                new NinjaModel("ninhaUser36", 23),
                new NinjaModel("ninhaUser37", 24),
                new NinjaModel("ninhaUser38", 25),
                new NinjaModel("ninhaUser39", 26),
                new NinjaModel("ninhaUser40", 27),
                new NinjaModel("ninhaUser41", 18),
                new NinjaModel("ninhaUser42", 19),
                new NinjaModel("ninhaUser43", 20),
                new NinjaModel("ninhaUser44", 21),
                new NinjaModel("ninhaUser45", 22),
                new NinjaModel("ninhaUser46", 23),
                new NinjaModel("ninhaUser47", 24),
                new NinjaModel("ninhaUser48", 25),
                new NinjaModel("ninhaUser49", 26),
                new NinjaModel("ninhaUser50", 27)
        );


        ninjaRepository.saveAll(ninjas);
    }
}
