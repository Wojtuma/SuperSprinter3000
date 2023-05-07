package com.codecool.supersprinter3000.controller;

import com.codecool.supersprinter3000.entity.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {
    @GetMapping("/index")
    public String index(Model model){
        Task task1 = new Task(1, "Clean bathroom", "Clean bathroom and prepare clothes for washing machine", 2.34);
        Task task2 = new Task(2, "Clean car", "...", 0.5);

        List<Task> tasksList = List.of(task1, task2);
        model.addAttribute("tasks", tasksList);
        return "index";
    }
}
