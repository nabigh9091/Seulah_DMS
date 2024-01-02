package com.seulah.seulahdms.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ScreenResponse {
    boolean questionExists;
    String screenHeading;
    String message;
}
