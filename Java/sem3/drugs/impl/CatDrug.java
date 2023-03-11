package sem3.drugs.impl;

import sem3.drugs.Component;
import sem3.drugs.Drug;

import java.util.List;

/**
 * Список компонентов лекарства, для кота
 */
public class CatDrug extends Drug {
    public CatDrug(List<Component> components) {
        super(components);
    }
}
