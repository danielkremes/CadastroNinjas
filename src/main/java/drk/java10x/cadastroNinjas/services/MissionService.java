package drk.java10x.cadastroNinjas.services;

import drk.java10x.cadastroNinjas.Entity.missions.MissionsModel;
import drk.java10x.cadastroNinjas.Repository.MissionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissionService {

    private final MissionRepository missionRepository;

    public MissionService(MissionRepository missionRepository) {
        this.missionRepository = missionRepository;
    }

    public MissionsModel createMission (MissionsModel missionsModel) {
        return missionRepository.save(missionsModel);
    }

    public List<MissionsModel> listAllMissions () {
        return missionRepository.findAll();
    }

    public Optional<MissionsModel> listMissionById(Long id) {
        return missionRepository.findById(id);
    }

    public MissionsModel updateMission(MissionsModel missionsModel) {
        MissionsModel mission = new MissionsModel();

        mission.setName(missionsModel.getName());
        mission.setDifficulty(mission.getDifficulty());
        mission.setNinja(mission.getNinja());

        return missionRepository.save(mission);
    }

    public void deleteMissionById(Long id) {
        missionRepository.deleteById(id);
    }

}
