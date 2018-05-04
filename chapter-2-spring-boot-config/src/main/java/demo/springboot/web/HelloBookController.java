package demo.springboot.web;

import demo.springboot.config.BookComponent;
import demo.springboot.config.BookProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot Hello案例
 *
 * Created by bysocket on 26/09/2017.
 * http://localhost:8080/swagger-ui.html支持swagger查看接口文档
 */
@RestController
public class HelloBookController {

    @Autowired
    BookProperties bookProperties;

    @Autowired
    private BookComponent bookComponent;

    @GetMapping("/book/hello")
    public String sayHello() {
        return "Hello， " + bookProperties.getWriter() + " is writing "
                + bookProperties.getName() + " ！";
    }

    @PostMapping("/hi")
    public String sayHi() {
        return "hi， " + bookComponent.getWriter() + " is writing "
                + bookComponent.getName() + " ！";
    }

    @RequestMapping("/say")
    public String sayLanguage() {
        return "你好， " + bookComponent.getWriter() + " is writing "
                + bookComponent.getName() + " ！";
    }
}
