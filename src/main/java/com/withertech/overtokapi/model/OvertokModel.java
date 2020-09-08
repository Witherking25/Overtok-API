package com.withertech.overtokapi.model;

import com.withertech.overtokapi.object.follower;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = {"followers"})
public class OvertokModel
{
    private int total_followers;
    private follower[] followers;

    public OvertokModel(int total_followers, follower[] followers)
    {
        this.total_followers = total_followers;
        this.followers = followers;
    }

    public follower[] getFollowers()
    {
        return followers;
    }

    public void setFollowers(follower[] followers)
    {
        this.followers = followers;
    }

    public int getTotal_followers()
    {
        return total_followers;
    }

    public void setTotal_followers(int total_followers)
    {
        this.total_followers = total_followers;
    }
}
