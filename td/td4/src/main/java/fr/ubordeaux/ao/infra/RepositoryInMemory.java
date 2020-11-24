package fr.ubordeaux.ao.infra;

import java.util.*;
import fr.ubordeaux.ao.domain.*;

public class RepositoryInMemory implements BasketRepository {

    Set<Basket> memory;
    
    public RepositoryInMemory(){
        memory = new HashSet<Basket>();
    }

    public void save(Basket basket){
        memory.add(basket);
    }

    public Basket findBasketById(int id){
        for (Basket b : memory) {
            if (b.getId() == id)
                return b;
        }
        return null;
    }
}