package lesson1;

public class Main {
    public static void main (String[] args){
        Course[] triatlon;
        Pool track1;
        Air track2;
        Treadmill track3;

        triatlon = new Course []{
                track1 = new Pool(110),
                track2 = new Air(250),
                track3 = new Treadmill(50)
        };

        Team team1 = new Team("Chicago Bulls");
        team1.infoTeam(team1);


        team1.doIt(triatlon, team1);
        // у меня не получилось написать еще и метод вывода информации, все сидит в одном методе
        //могут ли преодолеть дорожку, и если да, то за сколько секунд
    }


}
