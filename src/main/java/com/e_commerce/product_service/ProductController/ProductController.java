package com.e_commerce.product_service.ProductController;

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

    //post for create product
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void CreateProduct(@RequestBody ProductRequest productrequest) {

    }


}
