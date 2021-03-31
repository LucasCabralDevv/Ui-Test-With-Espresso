package com.lucascabral.espressouitest

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {

    @Test
    fun test_isActivityInView() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.mainActivity)).check(matches(isDisplayed()))
    }

    @Test
    fun test_isTitleTextDisplayed() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.mainActivityTitleTextView)).check(matches(withText(R.string.text_mainactivity)))
    }

    @Test
    fun test_visibility_title_nextButton() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.mainActivityTitleTextView)).check(matches(isDisplayed()))
        onView(withId(R.id.mainActivityNextButton)) // method 1
            .check(matches(isDisplayed()))
        onView(withId(R.id.mainActivityNextButton)) // method 2
            .check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
    }
}