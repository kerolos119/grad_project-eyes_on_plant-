package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.model.CareGuide;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KeyAwaernessDTO {
    private String interesting_story;
    private CareGuide guide;
    private String description;
}
