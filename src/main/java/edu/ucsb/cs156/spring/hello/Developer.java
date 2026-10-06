package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Michael";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "MushroomYolo";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("team-f26-13");
        team.addMember("Kun");
        team.addMember("Alex");
        team.addMember("Branden");
        team.addMember("Akshaj");
        team.addMember("Michael");
        team.addMember("Max");
        return team;
    }
}
