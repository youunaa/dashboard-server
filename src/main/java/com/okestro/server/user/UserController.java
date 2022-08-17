package com.okestro.server.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
@CrossOrigin
@RequiredArgsConstructor
public class UserController {

    /**
     * 로그인
     * @param param id/pw
     * @return
     */
    @ResponseBody
    @PostMapping("/login")
    public Map<String, Object> login(Map<String, Object> param) {
        Map<String, Object> result = new HashMap<>();

        return result;
    }

}
