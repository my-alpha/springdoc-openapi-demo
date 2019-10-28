package cc.tomgao.demo.springdoc.crm.controller;

import cc.tomgao.demo.springdoc.crm.model.User;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "crm-user")
@RestController
@RequestMapping("/crm/user")
public class CrmUserController {
    @GetMapping("/")
    public User get() {
        return new User().setId("1").setUsername("tom");
    }
}
