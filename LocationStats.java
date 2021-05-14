package io.javabrains.coronavirustracker.models;

public class LocationStats {
    private String state;
    private String country;
    private int latestTotalCases;
    private int diffFromPreDay;

    public int getDiffFromPreDay() {
        return diffFromPreDay;
    }

    public void setDiffFromPreDay(int diffFromPreDay) {
        this.diffFromPreDay = diffFromPreDay;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}
