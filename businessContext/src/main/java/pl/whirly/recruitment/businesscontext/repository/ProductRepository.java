package pl.whirly.recruitment.businesscontext.repository;

import org.springframework.stereotype.Service;
import pl.whirly.recruitment.businesscontext.model.Blockade;
import pl.whirly.recruitment.businesscontext.model.Product;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

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

   public List<Product> getAllProducts() {
      return this.products;
   }

   public boolean addProduct(Product product) {
      return this.products.add(product);
   }

   public boolean updateProduct(String id, Product product) {
      Product updatedProduct = getProductById(id);
      if (updatedProduct == null) {
         throw new NoSuchElementException();
      }
      products.remove(updatedProduct);
      return products.add(product);
   }

   public boolean delete(String productId) {
      return this.products.removeIf(p -> p.getId().equals(productId));
   }
}
