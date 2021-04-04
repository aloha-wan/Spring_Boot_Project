package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController                                         // 이곳을 controller로 활용할 것이라는 언어 지시자
@RequestMapping("/api") //localhost:8080/api         // 이곳으로 들어올 api 주소로 매핑해주기 위해서
public class GetController {

    // 사용자의 요청에 대해서 한가지 메소드로 받아드릴수 있다.
    // localhost:8080/api/getMethod <- 사용자의 요청이 이렇게 들어온다.
    @RequestMapping(method = RequestMethod.GET, path = "/getMethod")
    public String getRequst(){


        return "Hi getMethod";
    }

    @GetMapping("/getParameter")    // localhost:8080/api/getParameter?id=1234&password=abcd
    public String getParameter(@RequestParam String id, @RequestParam(name = "password") String pwd){

        String password = "bbbb";   // 어쩔수 없이 지역내에 선언을 해야한다면 (name = "")을 사용해준다.
        System.out.println("id : " + id);
        System.out.println("pwd : " + pwd);

        return id+pwd;

    }

    // localhost:8080/api/getMultiParameter?account=abcd&email=study@gmail.com&page=10
    // 위 처럼 많아지면 여러 파라미터를 작성해야하는 불편함이 있기때문에 객체로 받을 수 있는 방법이 있다.
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        // 네트워크 통신을 할때 json 형태로 통신을 한다
        // {"account" : "", "email" : "", "page" : 0} 로 json형태로 자동 완성이 된다.
        return searchParam;
    }

}
