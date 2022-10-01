package pl.camp.it.testy;

import org.junit.*;

public class CalculatorTest {

    static Calculator calculator = new Calculator();

    public CalculatorTest() {
        System.out.println("Konstruktor klasy CalculatorTest !!");
    }

    @Before
    public void prepare() {
        System.out.println("Przygotowanie !!!");
    }

    @After
    public void clean() {
        System.out.println("Sprzatanie !!!");
    }

    @BeforeClass
    public static void preparationForAllTests() {
        System.out.println("Przygotowanie przed wszystkimi testami !!");
    }

    @AfterClass
    public static void cleaningAfterAllTests() {
        System.out.println("Sprzateanie po wszystkich testach !!");
    }

    @Test
    public void addTwoPositiveTest() {
        int a = 5;
        int b = 7;
        int expectedResult = 12;

        int result = calculator.add(a, b);

        //Assert.assertEquals(expectedResult, result);
        if(expectedResult != result) {
            Assert.fail();
        }
    }

    @Test
    public void addTwoNegativeTest() {
        int a = -5;
        int b = -7;
        int expectedResult = -12;

        int result = calculator.add(a, b);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void addPositiveAndNegativeTest() {
        int a = 5;
        int b = -7;
        int expectedResult = -2;

        int result = calculator.add(a, b);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void addZeroAndPositiveTest() {
        int a = 0;
        int b = 7;
        int expectedResult = 7;

        int result = calculator.add(a, b);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void addZeroAndNegativeTest() {
        int a = 0;
        int b = -7;
        int expectedResult = -7;

        int result = calculator.add(a, b);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void diffTest() {
        int a = 5;
        int b = 3;
        int expectedResult = 2;

        int result = calculator.diff(a, b);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void multiplyTwoPositiveTest() {
        int a = 4;
        int b = 3;
        int expectedResult = 12;

        int result = calculator.multiply(a, b);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void multiplyTwoNegativeTest() {
        int a = -4;
        int b = -3;
        int expectedResult = 12;

        int result = calculator.multiply(a, b);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void multiplyPositiveAndNegativeTest() {
        int a = -4;
        int b = 3;
        int expectedResult = -12;

        int result = calculator.multiply(a, b);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void multiplyByZeroTest() {
        int a = 4;
        int b = 0;
        int expectedResult = 0;

        int result = calculator.multiply(a, b);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void divideTwoPositiveTest() {
        int a = 5;
        int b = 2;
        double expectedResult = 2.5;

        double result = calculator.divide(a, b);

        Assert.assertEquals(expectedResult, result, 0.001);
    }

    @Test
    public void divideTwoNegativeTest() {
        int a = -5;
        int b = -2;
        double expectedResult = 2.5;

        double result = calculator.divide(a, b);

        Assert.assertEquals(expectedResult, result, 0.001);
    }

    @Test
    public void dividePositiveAndNegativeTest() {
        int a = 5;
        int b = -2;
        double expectedResult = -2.5;

        double result = calculator.divide(a, b);

        Assert.assertEquals(expectedResult, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideByZeroTest() {
        int a = 5;
        int b = 0;

        calculator.divide(a, b);
    }
}
