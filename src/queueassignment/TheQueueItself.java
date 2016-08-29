package queueassignment;

/**
 * @author george oster
 */

public class TheQueueItself {

    QueueElement head = new QueueElement();
    QueueElement tail = new QueueElement();
    int size;

    public TheQueueItself() {
        size = 0;
    }

    public void enqueue(QueueElement qe) {
        if (head.getElement().getName() == null) {
            head = qe;
            tail = qe;
            size++;
        } else {
            QueueElement temp = head;

            for (int i = 0; i < size - 1; i++) {
                temp = temp.getNext();
            }
            temp.setNext(qe);
            tail = qe;
            size++;

        }
    }

    public QueueElement dequeue() {
        QueueElement temp = new QueueElement();
        temp = head;
        head = head.getNext();
        size--;
        return temp;
    }

    public int getSize() {
        return size;
    }

    public QueueElement getHead() {
        return head;
    }

    public QueueElement getTail() {
        return tail;
    }

    public boolean isEmpty() {
        boolean yesorno = false;

        if (size == 0) {
            yesorno = true;
        }

        return yesorno;
    }

    public void displayQueue() {
        System.out.println("here is the queue as it currently stands:");
        QueueElement temp = head;

        for (int i = 0; i < size; i++) {
            System.out.println(temp.getElement().toString());
            temp = temp.getNext();
        }
    }

}
