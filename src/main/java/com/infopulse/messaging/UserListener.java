package com.infopulse.messaging;

import com.infopulse.messaging.dto.Payload;
import com.infopulse.messaging.dto.UserDTO;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(UserInput.class)
@Setter
@NoArgsConstructor
public class UserListener {

    @StreamListener(target = UserInput.INPUT)
    public void onTenantEvent(Message<Payload> message) {
      Payload<UserDTO> payload = message.getPayload();
    }
}
