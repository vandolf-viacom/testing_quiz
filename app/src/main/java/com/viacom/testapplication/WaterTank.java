package com.viacom.testapplication;

/**
 * Water tank that can store {@link #maxCapacityInLiters}.
 */
public class WaterTank {

    private final int maxCapacityInLiters;

    private int currentAmountInLiters;

    public WaterTank(int maxCapacityInLiters, int currentAmountInLiters) {
        this.maxCapacityInLiters = maxCapacityInLiters;
        this.currentAmountInLiters = currentAmountInLiters;
    }

    /**
     * Adds water to this tank.
     *
     * @param liters the amount of water in liters to add
     * @return true if the tank is full after adding water
     */
    public boolean addWater(int liters) {
        int newAmountInLiters = currentAmountInLiters + liters;
        if (newAmountInLiters >= maxCapacityInLiters) {
            currentAmountInLiters = maxCapacityInLiters;
            return true;
        } else {
            currentAmountInLiters = newAmountInLiters;
            return false;
        }
    }

    public int getCurrentAmountInLiters() {
        return currentAmountInLiters;
    }
}
