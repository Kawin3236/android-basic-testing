package cc.somkiat.basicunittesting.controller;


import android.os.SystemClock;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import cc.somkiat.basicunittesting.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void saveSuccess() {
        onView(withId(R.id.userNameInput)).perform(replaceText("somkiat"), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(scrollTo(), replaceText("abc@hitmd.com"), closeSoftKeyboard());
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
        SystemClock.sleep(2000);
    }

    @Test
    public void saveUnsuccess() {
        onView(withId(R.id.userNameInput)).perform(replaceText("somkiat"), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(scrollTo(), replaceText("abd"), closeSoftKeyboard());
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
        SystemClock.sleep(2000);
    }
    @Test
    public void saveUnsuccess2() {
        onView(withId(R.id.userNameInput)).perform(replaceText("s"), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(scrollTo(), replaceText("abd"), closeSoftKeyboard());
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
        SystemClock.sleep(2000);
    }
    @Test
    public void saveUnsuccess3() {
        onView(withId(R.id.userNameInput)).perform(replaceText("sssssssssssssssssssssssssssssssssssssssss"), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(scrollTo(), replaceText("abd"), closeSoftKeyboard());
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
        SystemClock.sleep(2000);
    }

    @Test
    public void revert() {
        onView(withId(R.id.userNameInput)).perform(replaceText("somkiat"), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(scrollTo(), replaceText("abd"), closeSoftKeyboard());
        onView(withId(R.id.revertButton)).perform(scrollTo(), click());
        SystemClock.sleep(2000);
    }

}
