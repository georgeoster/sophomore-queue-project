package queueassignment;

import java.util.Scanner;

/**
 * @author george oster
 */
public class QueueAssignment {

    public static void main(String[] args) {

        Scanner qwerty = new Scanner(System.in);
        String pause = null;

        NewsPaper nyt = new NewsPaper("New York Times", "1683855", "New York", "NY", "0362-4331");
        NewsPaper lat = new NewsPaper("Los Angeles Times", "1231318", "Los Angeles", "CA", "0458-3035");
        NewsPaper wp = new NewsPaper("Washington Post", "960684", "Washington", "DC", "0190-8286");
        NewsPaper ct = new NewsPaper("Chicago Tribune", "957212", "Chicago", "IL", "1085-6706");
        NewsPaper pi = new NewsPaper("Philadelphia Inquirer", "705965", "Philadelphia", "PA", "0885-6613");

        QueueElement NYT = new QueueElement(nyt);
        QueueElement LAT = new QueueElement(lat);
        QueueElement WP = new QueueElement(wp);
        QueueElement CT = new QueueElement(ct);
        QueueElement PI = new QueueElement(pi);

        TheQueueItself myQueue = new TheQueueItself();

        myQueue.enqueue(NYT);
        myQueue.enqueue(LAT);
        myQueue.enqueue(WP);
        myQueue.enqueue(CT);
        myQueue.enqueue(PI);

        System.out.println("5 newspapers have been created and then added to the queue.");
        System.out.println("They were added to the queue in this order:");
        System.out.println("New York Times was added first.");
        System.out.println("Los Angeles Times was added second");
        System.out.println("Washington Post was added third");
        System.out.println("Chicago Tribue was added fourth");
        System.out.println("Philadelphia Inquirer was added fifth");
        System.out.println("\nWe will now call the displayQueue() method, which shows the queue");
        System.out.println("as it currently stands, starting with the head.");
        System.out.print("Press enter when ready. ");
        pause = qwerty.nextLine();

        myQueue.displayQueue();

        System.out.println("\nNow we will call the dequeue() method which will return the");
        System.out.println("head and set the new head to be the second item in the queue");
        System.out.println("Then we will callthe displayQueue() method to demonstrate that it worked");
        System.out.print("Press enter when ready. ");
        pause = qwerty.nextLine();

        myQueue.dequeue();
        myQueue.displayQueue();

        System.out.println("\nNow we will do the same thing again to demonstrate that it fully works.");
        System.out.println("we will call the dequeue() method which will return the");
        System.out.println("head and set the new head to be the second item in the queue");
        System.out.println("Then we will callthe displayQueue() method to demonstrate that it worked");
        System.out.print("Press enter when ready. ");
        pause = qwerty.nextLine();

        myQueue.dequeue();
        myQueue.displayQueue();

        System.out.println("\nNow we will enqueue the New York Times and call the displayQueue() method");
        System.out.println("to demonstrate that it worked.");
        System.out.print("Press enter when ready");
        pause = qwerty.nextLine();

        myQueue.enqueue(NYT);
        myQueue.displayQueue();

        System.out.println("\nThe testing is complete.");
        System.out.println("Good night and good luck.");

    }

}
