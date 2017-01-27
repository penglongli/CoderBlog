package coder.lib.sso.auth;

import coder.lib.sso.form.auth.LoginForm;
import coder.lib.sso.form.auth.RegisterForm;
import coder.lib.utils.Result;
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

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void login(@Valid LoginForm loginForm,
                         HttpServletRequest request,
                         @RequestHeader(value = "User-Agent") String userAgent,
                         @RequestAttribute String realRemoteAddress) {
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public void register(@Valid RegisterForm registerForm,
                         HttpServletRequest request,
                         @RequestHeader(value = "User-Agent") String userAgent,
                         @RequestAttribute String realRemoteAddress) {

    }

}
