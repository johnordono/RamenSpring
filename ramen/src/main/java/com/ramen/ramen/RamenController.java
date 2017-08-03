package com.ramen.ramen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Created by P2729496 on 7/3/2017.
 */
@RestController
public class RamenController {

    @Autowired
    private RamenService ramenService;

    @RequestMapping("/")
    String home(){
        return "home";
    }

    @RequestMapping("/ramen")
    public List<Ramen> getAllRamen(){
        return ramenService.getAllRamen();
    }

    @RequestMapping("/ramen/{id}")
    public Ramen getRamen(@PathVariable String id){
        return ramenService.getRamen(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/ramen")
    public void addRamen(@RequestBody Ramen ramen){
        ramenService.addRamen(ramen);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/ramen/{id}")
    public void updateRamen(@RequestBody Ramen ramen, @PathVariable String id){
        ramenService.updateRamen(id, ramen);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/ramen/{id}")
    public void deleteRamen(@PathVariable String id){
        ramenService.deleteRamen(id);
    }

}
