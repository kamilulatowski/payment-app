package pl.whirly.recruitment.payment.model;

import java.time.Instant;

public class User {

   private String id;
   private Instant birthDate;
   private String locationCode;

   public User(String id, Instant birthDate, String locationCode) {
      this.id = id;
      this.birthDate = birthDate;
      this.locationCode = locationCode;
   }

   public String getId() {
      return id;
   }

   public Instant getBirthDate() {
      return birthDate;
   }

   public void setBirthDate(Instant birthDate) {
      this.birthDate = birthDate;
   }

   public String getLocationCode() {
      return locationCode;
   }

   public void setLocationCode(String locationCode) {
      this.locationCode = locationCode;
   }
}
