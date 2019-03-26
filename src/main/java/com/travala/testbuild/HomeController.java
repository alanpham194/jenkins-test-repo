package com.travala.testbuild;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HomeController {
    @RequestMapping("")
    public TestDTO testPath() {
        return new TestDTO("Pham Van Hoa", true);
    }

}
