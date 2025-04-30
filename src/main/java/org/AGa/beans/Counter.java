package org.AGa.beans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.Dependent;
import java.io.Serializable;

//@RequestScoped // Бин живет в рамках одного HTTP-запроса
@Dependent     // Новый экземпляр создается при каждом внедрении
public class Counter implements Serializable {
    private int counter = 0;

    public int get() {
        counter++;
        return counter;
    }
}
