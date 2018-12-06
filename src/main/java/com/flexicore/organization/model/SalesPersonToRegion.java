package com.flexicore.organization.model;

import com.flexicore.model.Baseclass;
import com.flexicore.model.TimedLink;
import com.flexicore.product.model.Product;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity
public class SalesPersonToRegion extends TimedLink {
    static SalesPersonToRegion s_Singleton = new SalesPersonToRegion();
    public static SalesPersonToRegion s() {
        return s_Singleton;
    }





    @Override
    @ManyToOne(targetEntity = SalesPerson.class, cascade = {CascadeType.MERGE ,CascadeType.PERSIST})
    public SalesPerson getLeftside() {
        return (SalesPerson) super.getLeftside();
    }

    public void setLeftside(SalesPerson leftside) {
        super.setLeftside(leftside);
    }

    @Override
    public void setLeftside(Baseclass leftside) {
        super.setLeftside(leftside);
    }

    @Override
    @ManyToOne(targetEntity = SalesRegion.class, cascade = {CascadeType.MERGE ,CascadeType.PERSIST})
    public SalesRegion getRightside() {
        return (SalesRegion) super.getRightside();
    }

    public void setRightside(SalesRegion rightside) {
        super.setRightside(rightside);
    }

    @Override
    public void setRightside(Baseclass rightside) {
        super.setRightside(rightside);
    }


}
