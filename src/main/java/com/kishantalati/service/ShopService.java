package com.kishantalati.service;

import com.kishantalati.exception.ShopNotFound;
import com.kishantalati.model.Shop;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kishan talati
 * Date: 09/07/15
 * Time: 5:18 PM
 */
public interface ShopService {

    /**
     * Creation of Shop
     *
     * @param shop
     * @return
     */
    public Shop create(Shop shop);

    /**
     * Delete Shop by Shop Id
     *
     * @param id
     * @return
     * @throws ShopNotFound
     */
    public Shop delete(int id) throws ShopNotFound;

    /**
     * Retrieve all shops
     *
     * @return
     */
    public List<Shop> findAll();


    /**
     * Update Shop by Shop Id
     *
     * @param shop
     * @return
     * @throws ShopNotFound
     */
    public Shop update(Shop shop) throws ShopNotFound;

    /**
     * Find Shop By Id
     *
     * @param id
     * @return
     */
    public Shop findById(int id);
}
