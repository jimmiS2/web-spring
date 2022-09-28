package web.webspring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// - 컨트롤러를 JSON을 반환하는 컨트롤러로 만들어 줌
// restController = @Controller와 @ResponseBody 두 개를 합친 어노테이션
@Controller
//@RequestMapping("/board/**") // /board/로 접근하는 url 처리를 이곳에서 담당함을 명시
public class BoardController {

    @GetMapping("/hello") // GetMapping으로 설정한 hello로 접근하면 Hello() 메소드가 실행
    public String Hello(){
        return "board/hello"; // thymeleaf 에서 설정한 ~~~/tem../boards/hello.html 를 보여줌
    }
}

