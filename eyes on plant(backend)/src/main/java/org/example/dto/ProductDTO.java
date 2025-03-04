package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.model.ProductCategory;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {
    private Integer productId;
    private String productName;
    private ProductCategory productCategory;
    private BigDecimal price;
    private String address;
    private String phone;
    private Integer userId;


}
