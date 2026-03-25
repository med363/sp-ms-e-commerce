package com.e_commerce.product_service.ProductService;

import com.e_commerce.product_service.ProductRepo.ProductRepository;
import com.e_commerce.product_service.dto.ProductRequest;
import com.e_commerce.product_service.model.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
// constructor for repo injection
@RequiredArgsConstructor
// for make log
@Slf4j
public class ProductService {
    //inject repo
    private final ProductRepository productRepository;

    // busness logic for create product use response to save in db
    public void CreateProduct(ProductRequest ProductRequest) {
        //use var product
        Product product = Product.builder()
                .name(ProductRequest.getName())
                .description(ProductRequest.getDescription())
                .price(ProductRequest.getPrice())
                .quantity(ProductRequest.getQuantity())
                .build();
        //save in db so we use repo
        productRepository.save(product);
        // show logs
        log.debug("Created product with id: {}", product.getId());

    }
}
