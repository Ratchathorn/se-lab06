package th.ac.ku.menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.menu.model.Menu;
import th.ac.ku.menu.service.MenuService;

import java.util.List;
import java.util.UUID;

// @RestController = @Service but handles user request via REST and
// creates an object with this class
@RestController
// base URL (localhost:8090/menu)
@RequestMapping("/menu")
public class MenuController {

    // controller -> service
    @Autowired
    private MenuService service;

    // get function
    @GetMapping
    public List<Menu> getAll() {
        return service.getAll();
    }

    // insert object
    @PostMapping
    public Menu create(@RequestBody Menu menu) {
        return service.create(menu);
    }

    @GetMapping("/{id}")
    public Menu getMenuById(@PathVariable UUID id) {
        return service.getMenuById(id);
    }

    @PutMapping
    public Menu update(@RequestBody Menu menu) {
        return service.update(menu);
    }

    @DeleteMapping("/{id}")
    public Menu delete(@PathVariable UUID id) {
        return service.delete(id);
    }

    @GetMapping("/name/{name}")
    public Menu getMenuByName(@PathVariable String name) {
        return service.getMenuByName(name);
    }

    @GetMapping("/category/{category}")
    public List<Menu> getMenuByCategory(@PathVariable String category) {
        return service.getMenuByCategory(category);
    }



}
