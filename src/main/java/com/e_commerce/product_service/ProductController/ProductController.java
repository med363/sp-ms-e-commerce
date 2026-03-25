package com.e_commerce.product_service.ProductController;

import com.e_commerce.product_service.ProductService.ProductService;
import com.e_commerce.product_service.dto.ProductRequest;
import com.e_commerce.product_service.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

//RestApi lombok annotation
@RestController
// restApi value
@RequestMapping(value = "/api/product")
//constructor lombok annotation for injection
@RequiredArgsConstructor
public class ProductController {
    //inject server i will add after
    private final ProductService productService;
    //post for create product use request from client
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void CreateProduct(@RequestBody ProductRequest ProductRequest) {
// use server busness logic
        productService.CreateProduct(ProductRequest);
    }


}
