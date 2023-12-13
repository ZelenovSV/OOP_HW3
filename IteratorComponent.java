package org.example.seminar.Apteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorComponent implements Iterator<PharmancyComponent>{

    private List<PharmancyComponent> components;
    private int index;

    private Pharmacy pharmacy;

    public IteratorComponent(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
        components = pharmacy.getComponents();
        index = pharmacy.getIndex();
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public PharmancyComponent next() {
        return components.get(index++);
    }
}
