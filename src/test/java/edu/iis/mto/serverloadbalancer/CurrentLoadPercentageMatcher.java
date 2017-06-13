package edu.iis.mto.serverloadbalancer;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

/**
 * Created by Konrad Gos on 13.06.2017.
 */
public class CurrentLoadPercentageMatcher extends TypeSafeMatcher<Server> {
    public static final double EPSILON = 0.01d;
    private double expectedLoadPercentage;

    public CurrentLoadPercentageMatcher(double expectedLoadPercentage) {
        this.expectedLoadPercentage = expectedLoadPercentage;
    }

    @Override
    protected void describeMismatchSafely(Server item, Description description) {
        description.appendText("a server with load percentage of ").appendValue(item.getCurrentLoadPercentage());
    }

    protected boolean matchesSafely(Server server) {
        return doublesAreEqual(this.expectedLoadPercentage, server.getCurrentLoadPercentage());
    }

    private boolean doublesAreEqual(double d1, double d2) {
        return d1 == d2 || Math.abs(d1 - d2) < EPSILON;
    }

    public void describeTo(Description description) {
        description.appendText("a server with load percentage of ").appendValue(expectedLoadPercentage);
    }

    public static CurrentLoadPercentageMatcher hasLoadPercentageOf(double expectedLoadPercentage) {
        return new CurrentLoadPercentageMatcher(expectedLoadPercentage);
    }
}
