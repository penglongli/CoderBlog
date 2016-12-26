package coder.lib.sso.Auth;

import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Pelin on 16/12/21.
 */
@RestController
@RequestMapping(value = "/api/v1/auth")
public class AuthController {

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void register(HttpServletRequest request,
                         @RequestHeader(value = "User-Agent") String userAgent,
                         @RequestAttribute String realRemoteAddress) {

    }



}
