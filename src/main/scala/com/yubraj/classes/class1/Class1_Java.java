package com.yubraj.classes.class1;

/**
 * Created by ypokhrel on 8/18/2017.
 */
public class Class1_Java {
    private final int hours;
    private final int minutes;
    private final int asMinutes;

    public Class1_Java(int hours, int minutes, int asMinutes) {
        this.hours = hours;
        this.minutes = minutes;
        this.asMinutes = asMinutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getAsMinutes() {
        return asMinutes;
    }

    public int getAsMinutes(Class1_Java thatTime){
        return this.asMinutes - thatTime.asMinutes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Class1_Java that = (Class1_Java) o;

        if (hours != that.hours) return false;
        if (minutes != that.minutes) return false;
        return asMinutes == that.asMinutes;
    }

    @Override
    public int hashCode() {
        int result = hours;
        result = 31 * result + minutes;
        result = 31 * result + asMinutes;
        return result;
    }
}
