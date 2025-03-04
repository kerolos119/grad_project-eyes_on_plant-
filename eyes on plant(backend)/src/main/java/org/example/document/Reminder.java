package org.example.document;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.example.model.RemiderType;
import org.example.model.ReminderStatus;

import java.time.LocalDate;

@Entity
@Table(name = "Reminders")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Reminder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reminder_id")
    private Integer reminderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",referencedColumnName = "user_id",nullable = false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @NotEmpty
    private Users user;

    @ManyToOne
    @JoinColumn(name = "plant_id",referencedColumnName = "plant_id",nullable = false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @NotEmpty
    private Plants plant;

    @Enumerated(EnumType.STRING)
    @Column(name = "reminder_type",nullable = false)
    @NotEmpty
    private RemiderType remiderType;

    @Column(name = "next_reminder_date")
    private LocalDate reminder;

    @Column(name = "frequency")
    private Integer frequency;


    //@Enumerated(EnumType.STRING)
    //@Column(name = "status")
    //private ReminderStatus status = ReminderStatus.PENDING; // حالة التذكير (افتراضي: Pending)

    //@Column(name = "created_at", updatable = false, nullable = false)
   // private LocalDate createdAt = LocalDate.now();

    //@Column(name = "updated_at", nullable = false)
    //private LocalDate updatedAt = LocalDate.now();

    //@PreUpdate
    //protected void onUpdate() {
       // updatedAt = LocalDate.now();
    //}
}
