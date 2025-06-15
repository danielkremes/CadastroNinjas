package drk.java10x.cadastroNinjas.Entity.missions;

import drk.java10x.cadastroNinjas.Entity.ninja.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_missions")
public class MissionsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String difficulty;

    // Uma missão pode ter vários ninjas
    @OneToMany(mappedBy = "mission", cascade = CascadeType.ALL)
    private List<NinjaModel> ninjaModel;

    public MissionsModel(String name, String difficulty, List<NinjaModel> ninja) {
        this.name = name;
        this.difficulty = difficulty;
        this.ninjaModel = ninja;
    }
}
