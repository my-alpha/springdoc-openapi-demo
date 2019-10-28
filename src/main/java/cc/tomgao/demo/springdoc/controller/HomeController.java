package cc.tomgao.demo.springdoc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springdoc.core.Constants.SWAGGER_UI_PATH;
import static org.springframework.util.AntPathMatcher.DEFAULT_PATH_SEPARATOR;
import static org.springframework.web.servlet.view.UrlBasedViewResolver.REDIRECT_URL_PREFIX;


@Controller
@RequestMapping
public class HomeController {

    @Value(SWAGGER_UI_PATH)
    private String swaggerUiPath;

    @GetMapping(DEFAULT_PATH_SEPARATOR)
    public String index() {
        return REDIRECT_URL_PREFIX + swaggerUiPath;
    }
}
