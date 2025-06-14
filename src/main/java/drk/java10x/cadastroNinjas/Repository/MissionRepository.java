package drk.java10x.cadastroNinjas.Repository;

import drk.java10x.cadastroNinjas.Entity.missions.MissionsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<MissionsModel, Long> {
}
