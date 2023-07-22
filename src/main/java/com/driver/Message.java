package com.driver;

import java.util.Date;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Message {
    private int id;
    private String content;
    private Date timestamp;
}
