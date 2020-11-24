package fr.ubordeaux.ao.infra;

import fr.ubordeaux.ao.domain.*;
import java.io.*;

public class RepositoryInJSON implements BasketRepository {
    public void save(Basket basket){
        File f = new File(Integer.toString(basket.getId()));
        f.write(basket);
    }

    public Basket findBasketById(int id){
        return null;
    }
}