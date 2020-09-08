package com.withertech.overtokapi.object;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class follower
{
    @XmlElement
    boolean is_private;
    @XmlElement
    String uid;
    @XmlElement
    String country;
    @XmlElement
    String avatar_large;
    @XmlElement
    String avatar_medium;
    @XmlElement
    String unique_id;
    @XmlElement
    String sec_uid;
    @XmlElement
    String nickname;
    @XmlElement
    boolean is_verified;

    public follower(boolean is_private, String uid, String country, String avatar_large, String avatar_medium, String unique_id, String sec_uid, String nickname, boolean is_verified)
    {
        this.is_private = is_private;
        this.uid = uid;
        this.country = country;
        this.avatar_large = avatar_large;
        this.avatar_medium = avatar_medium;
        this.unique_id = unique_id;
        this.sec_uid = sec_uid;
        this.nickname = nickname;
        this.is_verified = is_verified;
    }
}
