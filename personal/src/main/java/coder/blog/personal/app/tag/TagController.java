package coder.blog.personal.app.tag;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by Pelin on 16/12/15.
 */
@RestController
@RequestMapping(value = "/api/v1/tag")
public class TagController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public void index() {

    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void add(@Valid TagForm form) {

    }

    @RequestMapping(value = "/{slug}/delete", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer slug) {

    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public void update(@Valid TagForm form) {

    }

    @RequestMapping(value = "/{slug}/detail", method = RequestMethod.GET)
    public void detail(@PathVariable String slug) {

    }
}
