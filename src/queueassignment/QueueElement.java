package queueassignment;

/**
 * @author george oster
 */
public class QueueElement {

    NewsPaper theNews;
    QueueElement next = null;

    public QueueElement() {
        theNews = new NewsPaper();
    }

    public QueueElement(NewsPaper n) {
        theNews = n;
    }

    public void setElement(NewsPaper n) {
        theNews = n;
    }

    public NewsPaper getElement() {
        return theNews;
    }

    public void setNext(QueueElement se) {
        next = se;
    }

    public QueueElement getNext() {
        return next;
    }

}
