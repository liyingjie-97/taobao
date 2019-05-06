package cn.fs.taobao.controller;

import cn.fs.taobao.AjaxResult;
import cn.fs.taobao.domain.User;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody User user){
        if (user!=null && !StringUtils.isEmpty(user.getName()) && !StringUtils.isEmpty(user.getName())){
            if ("admin".equals(user.getName()) && "123".equals(user.getPassword())){
                return new AjaxResult().setSuccess(true).setMessage("登陆成功");
            }
        }
        return new AjaxResult().setSuccess(false).setMessage("用户名或密码错误");
    }

    @RequestMapping(value = "/login2",method = RequestMethod.GET)
    public AjaxResult login2(){
        return new AjaxResult().setSuccess(false).setMessage("测试");
    }
}
