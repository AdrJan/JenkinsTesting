import org.testng.Assert;
import org.testng.annotations.Test;

public class ReallyImportantTests {
    ReallyImportantClass reallyImportantClass = new ReallyImportantClass();

    @Test
    public void addTest1() {
        addTwoNumbersAssertion(1, 2, 3);
    }

    @Test
    public void addTest2() {
        addTwoNumbersAssertion(-2, -7, -9);
    }

    @Test
    public void addTest3() {
        addTwoNumbersAssertion(-2, 2, 0);
    }

    @Test
    public void addTest4() {
        addTwoNumbersAssertion(872, 120, 992);
    }

    @Test
    public void addTest5() {
        addTwoNumbersAssertion(-12, -12, -24);
    }

    @Test
    public void subtractTest1() {
        subtractTwoNumbersAssertion(1, 2, -1);
    }

    @Test
    public void subtractTest2() {
        subtractTwoNumbersAssertion(-2, -7, 5);
    }

    @Test
    public void subtractTest3() {
        subtractTwoNumbersAssertion(-2, 2, -4);
    }

    @Test
    public void subtractTest4() {
        subtractTwoNumbersAssertion(872, 120, 752);
    }

    @Test
    public void subtractTest5() {
        subtractTwoNumbersAssertion(-12, -12, 0);
    }

    private void addTwoNumbersAssertion(int num1, int num2, int result)
    {
        Assert.assertEquals(reallyImportantClass.addTwoNumbers(num1, num2), result);
    }

    private void subtractTwoNumbersAssertion(int num1, int num2, int result)
    {
        Assert.assertEquals(reallyImportantClass.subtractTwoNumbers(num1, num2), result);
    }
}
