package com.example.polls.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.payload
 * User: YuAn
 * Date: 2018/6/25
 * Time: 13:12
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@AllArgsConstructor
public class ApiResponse {

    private Boolean success;

    private String message;


}
