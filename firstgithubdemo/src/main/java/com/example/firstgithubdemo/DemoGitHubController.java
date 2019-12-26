package com.example.firstgithubdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author AK
 * @ClassName: DemoGitHubController
 * @Description: 我的第一次GitHub
 * @date 2019/12/26 10:19
 */

@Controller
public class DemoGitHubController {

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "Hello Word!";
    }
}
