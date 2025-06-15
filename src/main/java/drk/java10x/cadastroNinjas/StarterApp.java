package drk.java10x.cadastroNinjas;

import drk.java10x.cadastroNinjas.Entity.missions.MissionsModel;
import drk.java10x.cadastroNinjas.Entity.ninja.NinjaModel;
import drk.java10x.cadastroNinjas.Repository.MissionRepository;
import drk.java10x.cadastroNinjas.Repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class StarterApp implements CommandLineRunner {

    private final NinjaRepository ninjaRepository;
    private final MissionRepository missionRepository;

    public StarterApp(NinjaRepository ninjaRepository, MissionRepository missionRepository) {
        this.ninjaRepository = ninjaRepository;
        this.missionRepository = missionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        MissionsModel mission = new MissionsModel();
        mission.setName("Mission01");
        mission.setDifficulty("moderate");

        List<NinjaModel> ninjas = List.of(
                new NinjaModel("ninhaUser1", 18),
                new NinjaModel("ninhaUser2", 19)
        );

        ninjas.forEach(n -> n.setMission(mission));
        mission.setNinjaModel(ninjas);

        missionRepository.save(mission);
    }
}
