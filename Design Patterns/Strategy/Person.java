package Strategy;

interface ITalkStrategy {
    String run();
}


interface IReproduceStrategy {
    Person run(Person withWhom);
}

public class Person {

    public Person(ITalkStrategy talkStrategy, IReproduceStrategy reproduceStrategy) {
        this.iReproduceStrategy = reproduceStrategy;
        this.iTalkStrategy = talkStrategy;
    }

    public String talk() {
        return this.iTalkStrategy.run();
    }

    public Person reproduce(Person withWhom) {
        return this.iReproduceStrategy.run(withWhom);
    }

    ITalkStrategy iTalkStrategy;
    IReproduceStrategy iReproduceStrategy;
    
}