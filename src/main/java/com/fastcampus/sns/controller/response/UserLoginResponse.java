package com.fastcampus.sns.controller.response;

import com.fastcampus.sns.model.User;
import com.fastcampus.sns.model.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserLoginResponse {

    // 로그인이 정상적으로 이루어졌을때 토큰이 반환되도록
    private String token;
}
