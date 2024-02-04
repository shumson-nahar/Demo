package basicparameterazation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	//Parameterization = validating single test case with multiple sets of data
	
	@Test(dataProvider ="getData")//Step 3 - linking the test case with the dataprovider
	public void RegisteringNewUser(String username, String browser , int mobile , String email) {
		//Step 4 - = no of input parameters no of cols
		System.out.println(username+"----"+browser+"----"+mobile+"----"+email);
	}
@DataProvider
public Object[][] getData(){//Step 1 - returns a 2 Dimensional Object Array
	Object[][] data = new Object[3][4];//[row][cols]
	
	
	data[0][0] ="User";//Step 2 - enter the data as per the rows and cols
	data[0][1]="Chrome";
	data[0][2]=98735556;
	data[0][3]="naharshumson@gmail.com";
	
	data[1][0] ="User1";
	data[1][1]="Firefox";
	data[1][2]=98736556;
	data[1][3]="naharshumson1@gmail.com";
	
	data[2][0] ="User2";
	data[2][1]="Chrome2";
	data[2][2]=98737556;
	data[2][3]="naharshumson2@gmail.com";
	return data;
	
	
	
}
}
