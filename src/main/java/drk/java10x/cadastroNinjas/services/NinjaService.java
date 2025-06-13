package drk.java10x.cadastroNinjas.services;

import drk.java10x.cadastroNinjas.Entity.ninja.NinjaModel;
import drk.java10x.cadastroNinjas.Repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
        NinjaModel ninjaModel1 = new NinjaModel();
        ninjaModel1.setName(ninjaModel.getName());
        ninjaModel1.setAge(ninjaModel.getAge());
        ninjaModel1.setEmail(ninjaModel.getEmail());
        ninjaModel1.setImageUrl(ninjaModel.getImageUrl());
        ninjaModel1.setMissionsModelList(ninjaModel1.getMissionsModelList());
        return ninjaRepository.save(ninjaModel1);
    }

    // deleted ninja by id (DELETE)
    public void delete(Long id) {
        ninjaRepository.deleteById(id);
    }
}
