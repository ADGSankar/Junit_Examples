package junit_demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {
	MyMath myMath=new MyMath(); 
	
	@BeforeEach  //in junit4 @BeforeEach is @Before
	public void before() {
		System.out.println("before");
	}
	
	@AfterEach  //in junit4 @AfterEach is @After
	public void after() {
		System.out.println("after");
	}
	
	@BeforeAll //in junit4 @BeforeAll is @BeforeClass
	public static void beforeClass() {
		System.out.println("beforeclass");
	}
	
	@AfterAll  //in junit4 @AfterAll is @AfterClass
	public static void afterClass() {
		System.out.println("afterclass");
	}
	
	@Test
	void sumWith1Nums() {
		System.out.println("test1");
		assertEquals(3, myMath.sum(new int [] {3}));
	}
	@Test
	void sumWith3Nums() {
		System.out.println("test2");
		assertEquals(6, myMath.sum(new int [] {1,2,3}));
	}


}
