package pl.whirly.recruitment.businesscontext.model;

public class Blockade {
   String key;
   boolean active;

   public Blockade(String key, boolean value) {
      this.key = key;
      this.active = value;
   }

   public String getKey() {
      return key;
   }

   public boolean isActive() {
      return active;
   }
}

