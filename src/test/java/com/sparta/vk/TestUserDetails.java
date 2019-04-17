package com.sparta.vk;

import org.junit.Assert;
import org.junit.Test;

public class TestUserDetails {
    private UserDetails user = new UserDetails("Bob", 21, "lordbob@thebobman.com");

    @Test
    public void testName()
    {
        Assert.assertEquals(user.getUserDetails().get("Name"), "Bob");
    }

    @Test
    public void testAge(){
        Assert.assertEquals(user.getUserDetails().get("Age"), 21);
    }

    @Test
    public void testEmail(){
        Assert.assertEquals(user.getUserDetails().get("Email"), "lordbob@thebobman.com");
    }
}
