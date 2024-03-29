package com.infopulse.messaging.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Payload {
    private String event;
    private UserDTO objectToSend;
}
