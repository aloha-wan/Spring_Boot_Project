package com.example.study.Controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController                    // controller로 사용할 거라는 알려주는 지시자로 어노테이션
@RequestMapping("/api")         // localhost:8080/api <- 어떠한 주소로 받을지 설정
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod") // localhost:8080/api/getMethod
    public String getRequst(){

        return "Hi getMethod";
    }

    @GetMapping("/getParameter")     // localhost:8080/api/getParameter?id=1234password=abcd
    public String getParameter(@RequestParam String id, @RequestParam(name = "password") String pwd){

        String password = "ddddd";

        System.out.println("id = " + id);
        System.out.println("password = " + password);

        return id+password;
    }

    // localhost:8080/api/getMultiParameter?account=abcd&email=study@gmai.com&page=10
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        // { "account" : "", "email" : "", "page" : 0}
        return searchParam;
    }
}
