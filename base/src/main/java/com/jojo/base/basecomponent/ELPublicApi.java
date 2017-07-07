package com.jojo.base.basecomponent;

/**
 * ********************************************************************
 *
 * @author sufun
 * @version 1.40.12
 * @createtime 17/7/5
 * @description ********************************************************************
 */

public class ELPublicApi {
    /**
     * 购物车相关的操作
     */
    public interface ShopCartApi extends ELModuleApi{
        void addCart(String js_data);
        void setCartNumber(int number);
        void cleanCart();
        void removeFromCart(String js_data);
    }

    public interface AddressApi extends ELModuleApi{
        void showAddresses();
        void addressUpdate(String js_data);
        void addAddress();
    }
}
