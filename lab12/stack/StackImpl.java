package stack;

public class StackImpl implements Stack {

    StackItem top = null; //Herhangi bi obje memoryde null olarak durar.





    @Override
    public void push(Object item) {
        StackItem box = new StackItem(item);
        StackItem previousTop = top;
        top = box;
        top.setNext(previousTop);


    }

    @Override
    public Object pop() {
        StackItem oldTop = top;
        top = oldTop.getNext();
        //top = top.getNext();

        return oldTop.getItem();
    }

    @Override
    public boolean empty() {
        return top == null;
    }
}
