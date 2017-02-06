package com.udacity.gradle.builditbigger;

import android.os.AsyncTask;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class JokesAsyncTaskTest  {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void testAsyncTaskReturn() {
        MainActivity mainActivity= activityTestRule.getActivity();
        mainActivity.tellJoke((Button)mainActivity.findViewById(R.id.tell_joke_button));
        assertNull(mainActivity.testJokeString);
    }
}