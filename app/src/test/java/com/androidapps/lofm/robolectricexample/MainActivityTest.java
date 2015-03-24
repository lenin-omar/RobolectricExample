package com.androidapps.lofm.robolectricexample;

import com.androidapps.lofm.test_helpers.StyleForcerRobolectricTest;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

/**
 * Created by Lenin Omar Flores Martinez
 * on 3/19/2015.
 */
@RunWith(StyleForcerRobolectricTest.class)
public class MainActivityTest  {

    public MainActivityTest(){}

    private MainActivity mActivity;

    @Before
    public void setup() {
        mActivity = Robolectric.buildActivity(MainActivity.class).create().get();
    }

    @Test
    public void myActivityAppearsAsExpectedInitially() {
        String appName = mActivity.getResources().getString(R.string.app_name);
        //Assert.assertThat(appName, CoreMatchers.equalTo("RobolectricExample"));
        Assert.assertThat(appName, CoreMatchers.equalTo("WrongNameExample"));
    }

}
