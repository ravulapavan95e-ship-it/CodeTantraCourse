package q35952;
/**
* This class has an example code for the addition operator
* @author James Gosling
*/
public class TestAddition {
public int sum(int num1, int num2) {
/* This is an example of a traditional comment,
also called a star-comment or multi-line comment*/
return num1 + num2;
}//end of the method sum
public static void main(String[] args) {
TestAddition example = new TestAddition();
int num1 = 5;
int num2 = 10;
int result = example.sum(num1, num2);
System.out.println("Sum: " + result);
}
}