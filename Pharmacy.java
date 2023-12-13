package org.example.seminar.Apteca;

import java.util.*;

//Лекарство
public class Pharmacy implements Iterable<PharmancyComponent>, Comparable<Pharmacy> {

    private List<PharmancyComponent> components = new ArrayList<>();
    private int index = 0;

    public Pharmacy addComponent(PharmancyComponent component){
        components.add(component);
        return this;
    }


    public List<PharmancyComponent> getComponents() {
        return components;
    }

    public void setComponents(List<PharmancyComponent> components) {
        this.components = components;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

//    @Override
    public boolean equals(Pharmacy comp) {
        if (this == comp) {
            return true;
        }
        if (comp == null || getClass() != comp.getClass()) {
            return false;
        }
        Pharmacy pharmacy = (Pharmacy) comp;
        return index == pharmacy.index;
    }



    @Override
    public int hashCode() {
        return Objects.hash(index);
      }

      Set<Pharmacy> result = new HashSet<>();
      System.out.println(result.size());

//    }
//
//    @Override
//    public PharmancyComponent next() {
//        return components.get(index++);
//    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "components=" + components +
                ", index=" + index +
                '}';
    }

    // вынесенный класс Iterable
//    @Override
//    public Iterator<PharmancyComponent> iterator() {
//        return new IteratorComponent(this);
//    }

    //анонимный класс Iterable
    @Override
    public Iterator<PharmancyComponent> iterator() {
        return new Iterator<PharmancyComponent>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public PharmancyComponent next() {
                return components.get(index++);
            }
        };
    }


    @Override
    public int compareTo(Pharmacy o) {
        if (this.index > o.index){
            return -1;
        } else if (this.index < o.index){
            return 1;
        }
        return 0;
        }
}
