package org.example.dto;

import lombok.*;
import org.example.model.RemiderType;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReminderDTO {

    private Integer reminderId;
    private Integer userId;
    private Integer plantId;
    private RemiderType reminderType;
    private LocalDate nextReminderDate;
    private Integer frequency;
}