package fr.ubordeaux.ao.domain;

public interface BasketRepository {
    public void save(Basket basket);
    public Basket findBasketById(int id);
}