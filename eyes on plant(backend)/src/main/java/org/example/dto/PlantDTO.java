package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.model.PlantStage;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlantDTO {
    private String plant_name;
    private String type;
    private PlantStage plant_stage;
    private Integer growth_time;
    private String optimal_conditions;
    private String common_diseases;
}