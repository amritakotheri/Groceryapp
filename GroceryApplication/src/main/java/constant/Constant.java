package constant;

public class Constant {
	public static final String TESTDATAFILE = System.getProperty("user.dir")
			+ "\\src\\test\\resources\\groceryapp.xlsx";
	public static final String IMAGEDATAFILE = System.getProperty("user.dir") + "\\src\\test\\resources\\juices.png";
	public static final String LOGINWITHINVALIDPASSWORD = "homepage is loaded with incorrect password";
	public static final String LOGINWITHINVALIDUSERNAME = "homepage is loaded with incorrect username";
	public static final String LOGINWITHINVALIDUSERNAMEANDPASSWORD = "homepage is loaded with incorrect username and password";
	public static final String LOGINWITHVALIDCREDENTIALS = "homepage is not loaded with valid credentials";
	public static final String GETADMINUSERINFORMATION = "not able to add new adminuser";
	public static final String USERLOGOUT = "user is not able to logout by clicking logout button";
	public static final String MANAGECATEGORY = "user is not able to add new category and upload file";
	public static final String MANAGECONTACT = "user is not able to update contact information";
	public static final String MANAGEFOOTERTEXT = "user is not able to update footer details";
	public static final String MANAGENEWS = "user is not able to create new news";
}
