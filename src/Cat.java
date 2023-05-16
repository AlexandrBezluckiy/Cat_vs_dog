public class Cat {
    int power;
    int brain;
    int agility;
    int lifes;

    void cat_stats (int power, int brain, int agility, int lifes){
        this.power = power;
        this.brain = brain;
        this.agility = agility;
        this.lifes = lifes;
    }

    int cat(){
        int cat_power = power * brain * agility * lifes;
        return(cat_power);
    }
}
