package upgrad.technicalblog.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import upgrad.technicalblog.model.Posts;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getAllPosts(Model  model){
        Posts pos1 = new Posts();
        pos1.setTitle("Post1");
        pos1.setBody("Post1 body");
        pos1.setDate(new Date());
        Posts pos2 = new Posts();
        pos2.setTitle("Post1");
        pos2.setBody("Post1 body");
        pos2.setDate(new Date());
        ArrayList<Posts> posts = new ArrayList<Posts>();
        posts.add(pos1);
        posts.add(pos2);
        model.addAttribute("posts",posts);
        return "index";
    }
}
