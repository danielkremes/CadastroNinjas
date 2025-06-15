package drk.java10x.cadastroNinjas.services;

import drk.java10x.cadastroNinjas.Entity.ninja.NinjaModel;
import drk.java10x.cadastroNinjas.Repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // add ninja (CREATE)
    public NinjaModel createNinja (NinjaModel ninjaModel) {
        return ninjaRepository.save(ninjaModel);
    }

    // Show all ninjas (READ)
    public List<NinjaModel> getAllNinjas () {
        return ninjaRepository.findAll();
    }

    // show ninja by id (READ)
    public Optional<NinjaModel> getNinjaById(Long id) {
        return ninjaRepository.findById(id);
    }

    // alter data of the ninjas (UPDATE)
    public NinjaModel ninjaUpdate (NinjaModel ninjaModel) {
        NinjaModel ninja = new NinjaModel();
        ninja.setName(ninjaModel.getName());
        ninja.setAge(ninjaModel.getAge());
        ninja.setEmail(ninjaModel.getEmail());
        ninja.setImageUrl(ninjaModel.getImageUrl());
        ninja.setMission(ninja.getMission());
        return ninjaRepository.save(ninja);
    }

    // deleted ninja by id (DELETE)
    public void delete(Long id) {
        ninjaRepository.deleteById(id);
    }

    public void deleteAllMissions() {
        ninjaRepository.deleteAll();
    }

}
