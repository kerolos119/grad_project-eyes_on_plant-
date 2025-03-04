package org.example.document;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.example.document.Users;
import org.example.model.PlantStage;

@Entity
@Table(name = "Plants")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Plants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plant_id")
    private Integer plant_id;

    @Column(name = "plant_name", nullable = false, length = 50)
    @NotEmpty
    private String plant_name;

    @Column(name = "type", length = 50)
    @NotEmpty
    private String type;

    @Enumerated(EnumType.STRING) // Store ENUM as a string in the database
    @NotEmpty
    @Column(name = "plant_stage", nullable = false)
    private PlantStage plant_stage;

    @Column(name = "growth_time")
    @NotEmpty
    private Integer growth_time;

    @Column(name = "optimal_conditions", columnDefinition = "TEXT")
    @NotEmpty
    private String optimal_conditions;

    @Column(name = "common_diseases", columnDefinition = "TEXT")
    @NotEmpty
    private String common_diseases;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    private Users user; // Relationship with the Users table
}