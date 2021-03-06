package com.example.polls.payload;

import lombok.Data;
import javax.validation.constraints.NotBlank;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.payload
 * User: YuAn
 * Date: 2018/6/25
 * Time: 12:04
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@Data
public class LoginRequest {

    @NotBlank
    private String usernameOrEmail;

    @NotBlank
    private String password;
}
