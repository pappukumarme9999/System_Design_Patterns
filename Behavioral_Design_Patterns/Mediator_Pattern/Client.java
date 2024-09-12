package Mediator_Pattern;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague colleague1 = new ConcreteColleague1(mediator);
        Colleague colleague2 = new ConcreteColleague2(mediator);

        ((ConcreteMediator) mediator).addColleague(colleague1);
        ((ConcreteMediator) mediator).addColleague(colleague2);

        mediator.sendMessage("Hello from Colleague 1", colleague1);
        mediator.sendMessage("Hi from Colleague 2", colleague2);
    }
}
