package org.example.document;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.example.model.ProductCategory;

import java.math.BigDecimal;

@Entity
@Table(name = "Products")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Poduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "product_name",columnDefinition = "TEXT",length = 50,nullable = false)
    @NotEmpty
    @Size(max = 50)
    private String productName;

    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    @NotEmpty
    private ProductCategory category;

    @Column(name = "price",nullable = false,precision = 10,scale = 2)
    @DecimalMin(value = "0.0", inclusive = false)
    private BigDecimal price;

    @Column(name = "seller_address",nullable = false,columnDefinition = "TEXT")
    private String address;

    @Column(name = "seller_phone",nullable = false,length = 50)
    @Pattern(regexp = "^[0-9+]+$")
    private String phone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",referencedColumnName = "user_id",nullable = false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Users user;



}
