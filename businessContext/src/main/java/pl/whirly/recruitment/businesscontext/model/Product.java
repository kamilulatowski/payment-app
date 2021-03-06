package pl.whirly.recruitment.businesscontext.model;

import java.util.List;

public class Product {

   private String id;
   private List<Blockade> blockadeList;

   public Product(String id, List<Blockade> blockadeList) {
      this.id = id;
      this.blockadeList = blockadeList;
   }

   public String getId() {
      return id;
   }

   public List<Blockade> getBlockadeList() {
      return blockadeList;
   }

   public void setBlockadeList(List<Blockade> blockadeList) {
      this.blockadeList = blockadeList;
   }
}
