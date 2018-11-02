package devfon.controller;

import devfon.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping({"", "/"})
    public String item(
            @RequestParam(value = "id", defaultValue = "0") Long id,
            Model model
    ) {
        model.addAttribute("item", itemService.findItemById(id));
        return "/item/form";
    }

    @GetMapping("/list")
    public String list(
            Model model
    ) {
        model.addAttribute("itemList", itemService.findItemList());
        return "/item/list";
    }
}
