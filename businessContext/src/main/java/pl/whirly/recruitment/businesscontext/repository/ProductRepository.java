package pl.whirly.recruitment.businesscontext.repository;

import org.springframework.stereotype.Service;
import pl.whirly.recruitment.businesscontext.model.Blockade;
import pl.whirly.recruitment.businesscontext.model.Product;

import java.util.LinkedList;
import java.util.List;

@Service
public class ProductRepository {
   private List<Product> products = new LinkedList<>();

   public ProductRepository() {
      this.products.add(new Product("regular", List.of(new Blockade("ADULTS_ONLY", false))));
      this.products.add(new Product("adultsOnly", List.of(new Blockade("ADULTS_ONLY", true), new Blockade("EU_ONLY", true))));
   }

   public Product getProductById(String id) {
      return this.products.stream().filter(product -> product.getId().equals(id)).findFirst().orElse(null);
   }
}
