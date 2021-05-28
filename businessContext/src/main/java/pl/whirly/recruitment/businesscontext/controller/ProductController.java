package pl.whirly.recruitment.businesscontext.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.whirly.recruitment.businesscontext.model.Product;
import pl.whirly.recruitment.businesscontext.repository.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/{id}")
    public Product get(@PathVariable String id) {
        return productRepository.getProductById(id);
    }
}
