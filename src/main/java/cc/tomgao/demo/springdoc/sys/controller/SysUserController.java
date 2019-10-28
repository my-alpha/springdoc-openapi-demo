package cc.tomgao.demo.springdoc.sys.controller;

import cc.tomgao.demo.springdoc.sys.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys/user")
public class SysUserController {
    @GetMapping("/")
    public User get() {
        return new User().setId("1").setUsername("tom");
    }
}
