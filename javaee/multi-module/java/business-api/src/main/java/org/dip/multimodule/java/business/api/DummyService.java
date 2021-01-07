package org.dip.multimodule.java.business.api;

import javax.ejb.Local;

@Local
public interface DummyService
{
    public Integer obtainValue();
}
