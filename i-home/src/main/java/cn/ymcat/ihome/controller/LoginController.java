package cn.ymcat.ihome.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录服务
 *
 * @author 86152
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
