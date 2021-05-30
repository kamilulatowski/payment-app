package pl.whirly.recruitment.businesscontext.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

   private String id;
   private Instant birthDate;
   private String locationCode;
}
