package drk.java10x.cadastroNinjas.Controller;

import drk.java10x.cadastroNinjas.Entity.missions.MissionsModel;
import drk.java10x.cadastroNinjas.services.MissionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/missions")
public class MissionController {

    private MissionService missionService;

    public MissionController(MissionService missionService) {
        this.missionService = missionService;
    }

    @GetMapping()
    public String mission() {
        return "Mission Pages";
    }

    @PostMapping("/create")
    public MissionsModel createMission(@RequestBody MissionsModel missionsModel) {
        return missionService.createMission(missionsModel);
    }

    @GetMapping("/all")
    public List<MissionsModel> listAllMissions() {
        return missionService.listAllMissions();
    }

    @GetMapping("/{id}")
    public Optional<MissionsModel> listMissionById(@PathVariable Long id) {
        return missionService.listMissionById(id);
    }

    @PutMapping("/update")
    public MissionsModel updateMission(@RequestBody MissionsModel missionsModel) {
        return missionService.updateMission(missionsModel);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMission(@PathVariable Long id) {
        missionService.deleteMissionById(id);
    }

}
