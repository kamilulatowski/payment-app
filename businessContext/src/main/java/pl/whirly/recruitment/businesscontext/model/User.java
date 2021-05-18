package pl.whirly.recruitment.businesscontext.model;

import java.time.Instant;

public class User {
   String id;
   Instant birthDate;
   String locationCode;

   public User(String id, Instant birthDate, String locationCode) {
      this.id = id;
      this.birthDate = birthDate;
      this.locationCode = locationCode;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
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
