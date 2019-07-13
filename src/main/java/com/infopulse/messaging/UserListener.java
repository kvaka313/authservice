package com.infopulse.messaging;

import com.infopulse.messaging.dto.Payload;
import com.infopulse.messaging.dto.UserDTO;
import com.infopulse.service.UserService;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@EnableBinding(UserInput.class)
@Setter
@NoArgsConstructor
@Service
public class UserListener {

    @Autowired
    private UserService userService;

    @StreamListener(target = UserInput.INPUT)
    public void onTenantEvent(Message<Payload> message) {
      Payload payload = message.getPayload();
      UserDTO userDTO = payload.getObjectToSend();
      if("CREATE".equals(payload.getEvent())) {
          userService.insert(userDTO);
      }
    }
}
