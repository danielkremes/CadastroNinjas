package drk.java10x.cadastroNinjas.Repository;

import drk.java10x.cadastroNinjas.Entity.ninja.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {

}
