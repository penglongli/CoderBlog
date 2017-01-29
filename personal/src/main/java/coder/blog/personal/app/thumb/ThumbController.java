package coder.blog.personal.app.thumb;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Pelin on 17/1/27.
 */
@RestController
@RequestMapping(value = "/api/v1/thumb")
public class ThumbController {

    @RequestMapping(value = "")
    public void index() {

    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void add() {

    }

    @RequestMapping(value = "/{slug}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer slug) {

    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public void update() {

    }
}
