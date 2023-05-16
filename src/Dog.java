public class Dog {
    int power;
    int brain;
    int agility;
    int lifes;

    void dog_stats (int power, int brain, int agility, int lifes) {
        this.power = power;
        this.brain = brain;
        this.agility = agility;
        this.lifes = lifes;
    }

    int dog (){
        int dog_power = power * brain * agility * lifes;
        return(dog_power);
    }
}
