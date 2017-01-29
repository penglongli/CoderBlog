package coder.blog.personal.app.article;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by Pelin on 16/12/11.
 */
@RestController
@RequestMapping(value = "/api/v1/article")
public class ArticleController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public void index() {

    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void add(@Valid ArticleForm articleForm,
                      HttpServletRequest request) {

    }

    @RequestMapping(value = "/{slug}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer slug) {

    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public void update(@Valid ArticleForm articleForm) {

    }

    @RequestMapping(value = "/{slug}", method = RequestMethod.GET)
    public void detail(@PathVariable String slug) {

    }
}
