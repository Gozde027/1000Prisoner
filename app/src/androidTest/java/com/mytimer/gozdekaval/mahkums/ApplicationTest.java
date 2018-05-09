package com.mytimer.gozdekaval.mahkums;

import android.app.Application;
import android.support.test.espresso.ViewInteraction;
import android.support.test.filters.SmallTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.ApplicationTestCase;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class ApplicationTest{

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void testPrisoner(){

        onView(withId(R.id.editText)).perform(typeText("1000"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("977")));

    }

}