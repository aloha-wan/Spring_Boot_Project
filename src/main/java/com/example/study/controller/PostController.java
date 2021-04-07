package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostController {

    // HTML <Form>
    // ajax 검색
    // http post body -> data를 넣어서 보내겠다라는 뜻.
    // json, xml, multipart-form / text-plain 형식으로 data를 받는다.

//    @RequestMapping(Method = RequestMapping.POST, path = "/postMethod")
//    위의 내용은 아래와 같은 것입니다. 길게 이렇게 작성하는 것보다 밑에처럼 간단하게 해줍니다.
    @PostMapping(value = "/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam){

        return searchParam;

    }
}
