package pl.whirly.recruitment.businesscontext.model;

public class Blockade {

   private String key;
   private boolean active;

   public Blockade(String key, boolean active) {
      this.key = key;
      this.active = active;
   }

   public String getKey() {
      return key;
   }

   public void setKey(String key) {
      this.key = key;
   }

   public boolean isActive() {
      return active;
   }

   public void setActive(boolean active) {
      this.active = active;
   }
}

