package drk.java10x.cadastroNinjas.Entity.ninja;

import drk.java10x.cadastroNinjas.Entity.missions.MissionsModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

    @Column(unique = true)
    private String email;

    @Column(name = "img_url")
    private String imageUrl;

    // a mission can have several various ninjas
    @OneToMany(mappedBy = "ninja")
    private List<MissionsModel> missionsModelList;

}
