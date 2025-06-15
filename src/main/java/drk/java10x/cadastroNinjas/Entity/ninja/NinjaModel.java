package drk.java10x.cadastroNinjas.Entity.ninja;

import com.fasterxml.jackson.annotation.JsonIgnore;
import drk.java10x.cadastroNinjas.Entity.missions.MissionsModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    // Um ninja pertence a uma missão
    @ManyToOne
    @JoinColumn(name = "mission_id") // foreign key
    @JsonIgnore // Evita recursão infinita no JSON
    private MissionsModel mission;

    public NinjaModel(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
