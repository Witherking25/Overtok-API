package com.withertech.overtokapi.resource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class OvertokServices extends Application
{
    private Set<Object> singletons = new HashSet<>();

    public OvertokServices()
    {
        this.singletons.add(new OvertokResource());
    }

    @Override
    public Set<Object> getSingletons()
    {
        return singletons;
    }
}
