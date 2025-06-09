package drk.java10x.cadastroNinjas.Entity.missions;

import drk.java10x.cadastroNinjas.Entity.ninja.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    // a ninja for every mission
    @ManyToOne
    @JoinColumn(name = "mission_id") // foreign key
    private NinjaModel ninja;


}
