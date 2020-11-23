
public class Question5 {

  public static void main(String[] args) {
    Stack myStack = new Stack();
    myStack.push("4");
    myStack.push("3");
    myStack.push("7");
    myStack.push("15");
    myStack.push("-1");
    System.out.println("Should be '4->3->7->15->-1->null': " + myStack);
    assert(myStack.toString().equals("4->3->7->15->-1->null"));
    reverseStack(myStack);
    System.out.println("Should be '-1->15->7->3->4->null': " + myStack);
    assert(myStack.toString().equals("-1->15->7->3->4->null"));
  }

  public static void reverseStack(Stack inStack) {
    Queue tempQ = new Queue();
    while(!inStack.isEmpty()){
      tempQ.enqueue(inStack.pop());
    }
    while(!tempQ.isEmpty()){
      inStack.push(tempQ.dequeue());
    }
    /*
     ** Both are correct
     *
    Stack tempS1 = new Stack();
    while(!inStack.isEmpty()){
      tempS1.push(inStack.pop());
    }
    Stack tempS2 = new Stack();
    while(!tempS1.isEmpty()){
      tempS2.push(tempS1.pop());
    }
    while(!tempS2.isEmpty()){
      inStack.push(tempS2.pop());
    }*/
  }
}
