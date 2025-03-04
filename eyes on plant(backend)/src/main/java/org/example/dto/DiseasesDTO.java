package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DiseasesDTO {
    private String disease_name;
    private String affected_parts;
    private String recommended_action;
    private String symptoms;
    private String treatment;
}
