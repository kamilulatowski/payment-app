package pl.whirly.recruitment.payment.client;

import pl.whirly.recruitment.payment.model.User;

public interface UserContextClient {

   User getUserById(String userId);
}
