package coder.lib.sso.app.auth;

import coder.lib.core.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by Pelin on 16/12/21.
 */
@RestController
@RequestMapping(value = "/api/v1/auth")
public class AuthController {

    @Autowired
    private RegisterService registerService;

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public User register(@Valid RegisterForm registerForm,
                         HttpServletRequest request,
                         @RequestHeader(value = "User-Agent") String userAgent,
                         @RequestAttribute String realRemoteAddress) {
        return registerService.registerV1(request, registerForm);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void login(@Valid LoginForm loginForm,
                      HttpServletRequest request,
                      @RequestHeader(value = "User-Agent") String userAgent,
                      @RequestAttribute String realRemoteAddress) {
    }

}
