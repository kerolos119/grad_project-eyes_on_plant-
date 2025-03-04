package org.example.document;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.model.CareGuide;

@Entity
@Table(name = "KeyAwareness" )
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KeyAwareness {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "key_id")
    private Integer key_id;

    @Column(name = "interesting_story",columnDefinition = "TEXT")
    private String interesting_story ;

    @Enumerated(EnumType.STRING)
    @Column(name = "care_guide")
    @NotEmpty
    private CareGuide careGuide;

    @Column(name = "plant_description" , columnDefinition = "TEXT")
    @NotEmpty
    private String description;


}
