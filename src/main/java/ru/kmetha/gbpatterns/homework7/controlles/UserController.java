package ru.kmetha.gbpatterns.homework7.controlles;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kmetha.gbpatterns.homework7.service.UserService;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/all_users")
    public String findAllUser(Model model) {
        model.addAttribute("users", userService.findAll());
        return "all-users";
    }
}
