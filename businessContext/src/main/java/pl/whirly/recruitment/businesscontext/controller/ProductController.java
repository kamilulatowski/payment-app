package pl.whirly.recruitment.businesscontext.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.whirly.recruitment.businesscontext.model.Product;
import pl.whirly.recruitment.businesscontext.repository.ProductRepository;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable String productId) {
        return productRepository.getProductById(productId);
    }

    @GetMapping
    public List<Product> getProducts() {
        return productRepository.getAllProducts();
    }

    @PostMapping
    public boolean addProduct(@RequestBody Product product) {
        return productRepository.addProduct(product);
    }

    @PutMapping("/{productId}")
    public boolean updateProduct(@PathVariable String productId, @RequestBody Product product) {
        return productRepository.updateProduct(productId, product);
    }

    @DeleteMapping("/{productId}")
    public boolean deleteProduct(@PathVariable String productId) {
        return productRepository.delete(productId);
    }
}
