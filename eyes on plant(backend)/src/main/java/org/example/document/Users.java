package org.example.document;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.example.model.Gender;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer user_id;

    @Column(name = "name", length = 50, nullable = false)
    @NotBlank(message = "Name required")
    @Size(max = 50,message = "Name cannot exceed 50 characters.")
    private String name;

    @Column(name = "email", unique = true, length = 50, nullable = false)
    @Size(max = 50)
    @NotBlank(message = "Email required")
    @Email(message = "Invalid email")
    private String email;

    @Column(name = "password", length = 50, nullable = false)
    @NotEmpty
    private String password;

    @Column(name = "phone_number", length = 15, nullable = false)

    @NotEmpty
    private String phone_number;

    @Column(name = "gender", nullable = false)
    @Enumerated(EnumType.STRING) // Store enum as a string in the database
    @NotEmpty
    private Gender gender;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Plants> plants = new ArrayList<>();
}
