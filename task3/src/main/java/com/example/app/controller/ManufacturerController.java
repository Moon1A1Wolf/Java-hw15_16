package main.java.com.example.app.controller;

import com.example.app.model.Manufacturer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManufacturerController {

    @GetMapping("/manufacturer/info")
    public String getManufacturerInfo(Model model) {
        Manufacturer manufacturer = new Manufacturer("Acme", "Ukraine", 5000, "Leading producer of electronics.", "acme_logo.png");
        model.addAttribute("manufacturer", manufacturer);
        return "info";
    }
}
