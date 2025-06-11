package drk.java10x.cadastroNinjas.Repository;

import drk.java10x.cadastroNinjas.Entity.ninja.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionModelRepository extends JpaRepository<NinjaModel, Long> {

}
