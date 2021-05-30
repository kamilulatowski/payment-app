package pl.whirly.recruitment.businesscontext.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

   private String id;
   private List<Blockade> blockadeList;
}
