package com.Etech.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartDto {

//    private Long id;
//    private int quantity;
//    private double totalPrice;
//
//    private List<ProductDto> products;  // Assuming you have a ProductDto defined
//
//    private Long customerId;
//    private Long viewerId;


    private Long id;
    private double totalPrice;
    private List<ProductQuantityDto> productQuantities;
    private Long customerId;
    private Long viewerId;
}
