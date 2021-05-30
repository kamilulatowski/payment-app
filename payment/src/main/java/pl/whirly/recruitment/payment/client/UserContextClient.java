package pl.whirly.recruitment.payment.client;

import pl.whirly.recruitment.payment.model.UserDto;

public interface UserContextClient {

   UserDto getUserById(String userId);
}
