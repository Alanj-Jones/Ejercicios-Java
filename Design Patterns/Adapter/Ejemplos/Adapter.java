package Adapter.Ejemplos;

class Dog
{
    public String bark()
    {
        return "Woof";
    }
}

class Cat
{
    public String meow()
    {
        return "Meow";
    }
}

interface AnimalAdapter
{
    String talk();
}

class DogAdapter implements AnimalAdapter
{
    public DogAdapter(Dog dog)
    {
        this.dog = dog;
    }

    @Override
    public String talk()
    {
        return this.dog.bark();
    }

    private Dog dog;
}

class CatAdapter implements AnimalAdapter
{
    public CatAdapter(Cat cat)
    {
        this.cat = cat;
    }

    @Override
    public String talk()
    {
        return this.cat.meow();
    }

    private Cat cat;
}

public class Adapter
{
    public static void main(String[] args)
    {
        AnimalAdapter d = new DogAdapter(new Dog());
        AnimalAdapter c = new CatAdapter(new Cat());
        System.out.println(d.talk());
        System.out.println(c.talk());
    }
}
