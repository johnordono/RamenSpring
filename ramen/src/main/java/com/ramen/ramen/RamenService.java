package com.ramen.ramen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by P2729496 on 7/3/2017.
 */

@Service
public class RamenService {

    @Autowired
    private RamenRepository ramenRepository;

    /** Old hardcoded list of Ramen
*    private List<Ramen> ramens = new ArrayList<>(Arrays.asList(
*            new Ramen("miso", "Miso Ramen", "Chicken Broth", "Roast Pork",
*                    "Udon", "Bamboo SBean Sprouts, Bamboo Shoots, Corn, Ginger, Green Onions, Wood Ear Mushroom, Tomatohoots, Bean Sprouts, Corn", 8.95 ),
*
*            new Ramen("miso_tonkotsu", "Miso Tonkotsu", "Pork Broth", "Roast Pork",
*                    "Udon", "Bamboo Shoots, Bean Sprouts, Corn", 8.95)
    ));
*/

    public List<Ramen> getAllRamen(){
        //return ramens;
        // Originally (above) for hardcoded list, but now it's looking into Crud Repository
        List<Ramen> ramens = new ArrayList<>();
        ramenRepository.findAll() //An iterable
        .forEach(ramens::add); //Lambda expression. For each in iterable, adds to ramens
        return ramens;
    }

    public Ramen getRamen(String id){
        //return ramens.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return ramenRepository.findOne(id);
    }


    public void addRamen(Ramen ramen){
        //ramens.add(ramen);
        ramenRepository.save(ramen);
    }

    public void updateRamen(String id, Ramen ramen){
        /*for (int i = 0; i < ramens.size(); i++){
            Ramen t = ramens.get(i);
            if(t.getId().equals(id)){
                ramens.set(i, ramen);
                return;
            }
        }
        */
        ramenRepository.save(ramen);
    }

    public void deleteRamen(String id){
        //ramens.removeIf(t -> t.getId().equals(id));
        ramenRepository.delete(id);
    }


}
