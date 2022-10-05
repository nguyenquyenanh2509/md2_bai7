package rikkei.academy.animals;

public class Chicken extends Animal implements IEdible{
    @Override
    public String makeSound() {
        return "chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
