package lesson1;

import java.util.Arrays;

public class Team {

    public String teamName;
    public Animal[] teamMembers;
    Animal cat1;
    Animal wolf1;
    Animal turtle1;
    Animal owl1;

    public Team(String teamName) {
        this.teamName = teamName;
        teamMembers = new Animal[]{
                cat1 = new Cat("Murzik", "black", 3, 5),
                wolf1 = new Wolf("Klyk", "grey", 5, 2, 15),
                turtle1 = new Turtle("Tortilla", "brown", 100, 4, 1),
                owl1 = new Owl("Filipp", "polar white", 15, 12)
        };
    }

    public void infoTeam(Team team) {
        System.out.println("Name of Team: " + team.teamName + ". General info about this team: " + "\n" + Arrays.toString(team.teamMembers));
    }

    public void doIt(Course[] triatlon, Team team1) {
        for (int i = 0; i < 4; i++) {
            if (team1.teamMembers[i] instanceof Wolf || team1.teamMembers[i] instanceof Turtle) {
                System.out.println("На полосу выходит " + team1.teamMembers[i].getName());
                for (int j = 0; j < 3; j++) {
                    if (triatlon[j] instanceof Pool){
                        System.out.println(((Pool) triatlon[j]).getTimeToOvercomePool((CanSwim) team1.teamMembers[i]));
                    } else if (triatlon[j] instanceof Treadmill){
                        System.out.println(((Treadmill) triatlon[j]).getTimeToOvercomeTreadmill((CanRun) team1.teamMembers[i]));
                    } else {
                        System.out.println(team1.teamMembers[i].getName() + " не будет преодолевать " + triatlon[j].getClass() + " дорожку");
                    }
                }
            } else if (team1.teamMembers[i] instanceof Owl){
                System.out.println("На полосу выходит " + team1.teamMembers[i].getName());
                for (int j = 0; j < 3; j++) {
                    if (triatlon[j] instanceof Air){
                        System.out.println(((Air) triatlon[j]).getTimeToOvercomeAir((CanFly) team1.teamMembers[i]));
                    } else {
                        System.out.println(team1.teamMembers[i].getName() + " не будет преодолевать " + triatlon[j] + " дорожку");
                    }
                }
            } else if (team1.teamMembers[i] instanceof Cat){
                System.out.println("На полосу выходит " + team1.teamMembers[i].getName());
                for (int j = 0; j < 3; j++) {
                    if (triatlon[j] instanceof Treadmill){
                        System.out.println(((Treadmill) triatlon[j]).getTimeToOvercomeTreadmill((CanRun) team1.teamMembers[i]));
                    } else {
                        System.out.println(team1.teamMembers[i].getName() + " не будет преодолевать " + triatlon[j] + " дорожку");
                    }
                }
            }
        }
    }
}
